




var numIslands = function(grid) {

    traverse = (x, y) => {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid.length){
            console.log(grid[x][y]);
            grid[x][y] = 0;
            traverse(grid[x][y]);
        }
    }

    for(let x = 0; x < grid.length; x++){
        for(let y = 0; y < grid[0].length; y++){
            // console.log(grid[x][y]);
            traverse(grid[x][y]);
        }
        console.log('\n');
    }



};



const grid = [
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
];



let soln = numIslands(grid);
// console.log(soln);