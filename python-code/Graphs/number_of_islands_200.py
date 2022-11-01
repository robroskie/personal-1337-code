def numIslandsHelper(x, y, grid):
  if x < 0 or x >= len(grid) or y < 0 or y >= len(grid[0]) or grid[x][y] == '0':
    return

  grid[x][y] = '0'

  numIslandsHelper(x + 1, y, grid)
  numIslandsHelper(x - 1, y, grid)
  numIslandsHelper(x, y + 1, grid)
  numIslandsHelper(x, y - 1, grid)

def numIslands(grid):
  islands = 0

  for x in range(0, len(grid)):
    for y in range(0, len(grid[0])):
      if grid[x][y] == '1':
        numIslandsHelper(x, y, grid)
        islands += 1

  return islands

grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]

numIslands(grid)
