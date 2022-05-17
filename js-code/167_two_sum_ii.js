/**
 * @param {number[]} nums
 * @return {number[][]}
 */

// Completed using two-pointer method
 var twoSum = function(numbers, target) {
    let left = 0;
    let right = nums.length - 1;
    let curr;

    while(right > left){
        curr = nums[left] + nums[right];
        if(curr == target)
            return [left + 1, right + 1]
        if(curr > target)
            right -= 1;
        else
            left += 1;
    }
    return -1;
};


let nums = [2,7,11,15];
let target = 9;
console.log(twoSum(nums, target));

nums = [2,3,4];
target = 6;
console.log(twoSum(nums, target));


nums = [-1,0];
target = -1;
console.log(twoSum(nums, target));