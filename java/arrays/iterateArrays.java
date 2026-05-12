// 2D Array
int[][] grid = new int[3][4];

for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j]);
    }
    System.out.println();
}

// Trick
int[] nums = {1, 2, 3};
int ans = 0;
for (int num : nums) {
    ans = ans + num;
}
