// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

var twoSum = function(nums, target) {
    let hashmap = new Map();
    for(let i = 0; i < nums.length; i++){
        hashmap.set(nums[i], i)
    }

    for(let i = 0; i < nums.length; i++){
        let search = target - nums[i];
        if(hashmap.has(search)){
            if(hashmap.get(search) > i){
                return [i, hashmap.get(search)];
            }
        }
    }

    return null;
};


nums = [2,7,11,15];

console.log(twoSum(nums, 9));

