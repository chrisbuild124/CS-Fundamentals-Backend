# Sets

res = set() # Create
res.add('my_val') # Add
res.remove('my_val') # Remove

val1 = {1, 2} # Create (another way)
val2 = {2, 3}

val3 = val1 & val2 # only in common
val3 = val1 - val2 # differences from 1 to 2

if 1 in val1:
  print("1 is in val1")

# Trick to get oneliner duplicates removed
tmp = [1, 2, 2, 3]
print(set(tmp))

# Find length of set
print(len(val3))
