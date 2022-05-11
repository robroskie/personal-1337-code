/**
 * @param {number[]} nums
 * @return {number}
 */


 var maxProduct = function(nums) {
    // Initalize global max and cumulative max and mins
    let max = Math.max(...nums);
    let cMin = 1;
    let cMax = 1;

    // Iterate over each element in the array from left to right
    for(let e in nums){
        let value = nums[e];

        // cumulative min is the min of current value, current value * cumulative max and current value * cumulative min
        // cumulative max is the max of the 3 calculated values above
        // tempcMax is used to prevent error in the cMin calc
        let tempcMax = cMax;
        cMax = Math.max(value, cMax * value, cMin * value);
        cMin = Math.min(value, tempcMax * value, cMin * value);

        max = Math.max(cMin, cMax, max);      
    }

    return max;
};



// Brute force approach
// var maxProduct = function(nums) {
//     let max = -100000000000;
    

//     for(let i = 0; i < nums.length; i++){
//         let rightM = 1;
//         max = Math.max(nums[i], max);
//         for(let j = i + 1; j < nums.length; j++){
//             rightM *= nums[j];
//             max = Math.max(nums[i] * rightM, max);
//         }
//     }
//     return max;
// };


