/**
 * @param {number[]} nums
 * @return {number}
 */
 var findMin = function(nums) {
    //  Set the minimum encountered value to the first element in the nums array
    let min = nums[0];

    // Initalize left and right pointers 
    let left = 0;
    let right = nums.length - 1;

    let mid = Math.floor(nums.length / 2);

    // If the middle pointer is higher than the right pointer, binary search right
    // Else binary search left
    do
    {
        if(nums[mid] > nums[right]){
            left = mid; 
            let temp = mid;
            mid = Math.ceil((right - left) / 2) + temp;
        }
        else{
            right = mid;
            mid = Math.ceil((right - left) / 2);
        }
        // Update the global minimum with the local minimum if applicable
        min = Math.min(min, nums[mid]);
    }
    // Iterate until only two or fewer elements remain
    while(right - left > 1)
        
    return min;  
};


// console.log(findMin([4,5,6,1,2,3]));
// console.log(findMin([4,5,6,7,0,1,2]));
// console.log(findMin([11,13,15,17]));
// console.log(findMin([3,4,5,1,2]));
// console.log(findMin([2,1]));
console.log(findMin([2,3,1]));