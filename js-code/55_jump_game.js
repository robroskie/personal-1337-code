/**
 * @param {number[]} nums
 * @return {boolean}
 */

// Greedy algorithm approach
var canJump = function(nums) {
    // Set the starting element to the last index of the array
    let currentIdx = goalPostIdx = nums.length - 1;    
    currentIdx--;

    // Iterate from end to start of array
    while(0 <= currentIdx){
        // If the current element can be reached by the preceding element, update the goalpost index to the preceding element
        if((goalPostIdx - currentIdx) <= nums[currentIdx]){
            goalPostIdx = currentIdx;
        }
        currentIdx--;
    }
    // If able to assign goalpost index to first element, we are done
    if(goalPostIdx == 0){
        return true;
    }
    // Otherwise the last element cannot be reached
    return false;
};



console.log(canJump([2,3,1,1,4]));
console.log(canJump([0,1]));