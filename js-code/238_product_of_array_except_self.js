
var productExceptSelf = function(nums) {
    let toReturn = Array(nums.length);

    let right = 1;
    
    // Set of the leftmost element of the output array to 1
    toReturn[0] = 1;

    // Calculate the products left of each of the elements up to but not including i, and store at position i in the output array 
    for(let i = 1; i < nums.length; i++){
        toReturn[i] = toReturn[i - 1] * nums[i - 1];
    }

    // Calculate the products right of each of the elements down to but not including i, multiply by the corresponding left value and update entry in output array 
    for(let z = nums.length - 1; z >= 0; z--){
        console.log(`left at i=${z} is left=${toReturn[z]}  right=${right}`);
        toReturn[z] *= right;
        right = right * nums[z];
    }
    return toReturn;
};



let nums = [2,3,4,5];
console.log(`Expected=[24,12,8,6], Actual=${productExceptSelf(nums)}`);

// nums = [-1,1,0,-3,3];
// console.log(`Expected=[24,12,8,6], Actual=${productExceptSelf(nums)}`);