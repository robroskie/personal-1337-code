/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = {};

    for(let i = 0; i < nums.length; i++){
        console.log('loop');
        map[nums[i]] = i;
        console.log(`i=${i}  nums.length=${nums.length}`);
    }
    console.log(map);
    for(let i = 0; i < nums.length; i++){
        let val = target - nums[i];
        console.log(val);
        if(map[val] != i && val in map){
            console.log('found' + i);
            return[i, map[val]];
        }
    }
};

const arr = [3,3];
console.log(twoSum(arr, 6));
