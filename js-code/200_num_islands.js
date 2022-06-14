
const dfs = function(grid, x, y) {
    if(x < 0 || x == grid.length || y < 0 || y == grid[x].length){
        return 0;    
    }

    else if(grid[x][y] == '0'){
        return 0;  
    }
 

    grid[x][y] == "0";
    
    dfs(grid, x - 1, y);
    dfs(grid, x + 1, y);
    dfs(grid, x, y - 1);
    dfs(grid, x, y + 1);

    return 1;
}

var numIslands = function(grid) {
    let numIs = 0;

    if(grid == null || grid.length == 0){
        return 0;
    }

    for(let x = 0; x < grid.length; x++){
        for(let y = 0; y < grid[0].length; y++){
            if(grid[x][y] == '1'){
                numIs += dfs(grid, x, y);
                console.log(numIs);
            }
        }
    }
    return numIs;
};



grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
];

grid1 = [
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
];

// console.log(numIslands(grid));
console.log(numIslands(grid1));