from flask import Flask, request, jsonify
from collections import defaultdict, deque
import time

RATE_LIMIT = 10 
RATE_WINDOW = 60
PORT = 7023
DEV_MODE = True

app = Flask(__name__)
request_log = defaultdict(deque)

# -----------------------------
# Routes
# -----------------------------
@app.route("/test", methods=["GET"])
def test_route():
    ip = request.remote_addr
    if is_rate_limited(ip):
        return jsonify({"error": "Rate limit exceeded"}), 429
    return jsonify({"message": "Request successful"}), 200

# -----------------------------
# Helpers
# -----------------------------
def is_rate_limited(ip):
    """
    Returns True if the IP has exceeded the rate limit
    Uses a sliding window algorithm
    """
    now = time.time()
    window_start = now - RATE_WINDOW
    
    # Remove old requests outside the window
    while request_log[ip] and request_log[ip][0] <= window_start:
        request_log[ip].popleft()
    
    if len(request_log[ip]) >= RATE_LIMIT:
        return True
    
    request_log[ip].append(now)
    return False

if __name__ == "__main__":
    app.run(port=PORT, debug=DEV_MODE)
