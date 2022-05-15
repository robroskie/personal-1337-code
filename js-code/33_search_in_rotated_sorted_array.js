/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

// If middle is greater than or equal to left pointer, we are in the "left" portion of the array
    // if target > middle value => search right of mid(else condition)
    // if target < middle and left values => search right of mid(else condition)
    // if target < middle value and greater than or equal to left value => search left of mid(if condition)

// If middle is less than left
    // if target less than middle value => search left of mid(else condition)
    // if target greater than middle and right values => search left(else condition)
    // if target is greater than middle and less than or equal to right values => search right(if condition) 

var search = function(nums, target) {
    let left = 0;
    let right = nums.length - 1;
    let mid; 

    do{


        mid = Math.floor((right + left) / 2);
        if(nums[mid] == target)
            return mid;
        console.log(`left=${left} (${nums[left]}) mid=${mid} (${nums[mid]}) right=${right} (${nums[right]})`);

        // Middle equal to or greater than left
        if(nums[mid] >= nums[left]){
            // Search right
            if(target < nums[mid] && target >= nums[left]){
                right = mid - 1;
            }
            // Search left
            else{
                left = mid + 1;
            }
        }
        // Middle less than left 
        else{
            if(target > nums[mid] && target <= nums[right]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        console.log(`left=${left} mid=${mid} right=${right}\n`);
    }
    while(left <= right)

    return -1;

};

console.log(search([4,5,6,7,0,1,2], 0));