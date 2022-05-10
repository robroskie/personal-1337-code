
// Brute force approach
var maxProduct = function(nums) {
    let max = -100000000000;
    

    for(let i = 0; i < nums.length; i++){
        let rightM = 1;
        max = Math.max(nums[i], max);
        for(let j = i + 1; j < nums.length; j++){
            rightM *= nums[j];
            max = Math.max(nums[i] * rightM, max);
        }
    }
    return max;
};


// console.log(maxProduct([2,3,-2,4]));
// console.log(maxProduct([-2,0,-1]));
// console.log(maxProduct([0,2]));
console.log(maxProduct([-3,0,1,-2]));