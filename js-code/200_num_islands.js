var numIslands = function(grid) {
    
};

function dfs(grid, seen, x, y){

    if(x < 0 || x >= grid.length || y < 0 || y >= grid.length){
        return;
    }
    else if(seen[x][y] == '1'){
        return;
    }

    seen[x][y] = '1';

    console.log(`(${x}, ${y}) ${grid[x][y]}`);
    console.log(grid[x][y]);
    dfs(grid, seen, x + 1, y);
    dfs(grid, seen, x, y - 1);
    dfs(grid, seen, x - 1, y);
    dfs(grid, seen, x, y + 1);
}



grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
];

grid2 = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
];

grid2 = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
];

let seen = new Array(grid2.length).fill('').map(() => new Array(grid2[0].length).fill(0));
console.log(seen);
dfs(grid, seen, 0, 0);