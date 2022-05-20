/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let maxArea = 0;

    while(left < right){
        let curArea = Math.min(height[left], height[right]) * (right - left);       
        maxArea = Math.max(maxArea, curArea);

        if(height[left] < height[right])
            left++;
        else
            right--;
    }

    return maxArea;

};


console.log(maxArea([1,8,6,2,5,4,8,3,7]));

