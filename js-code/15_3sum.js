/**
 * @param {number[]} nums
 * @return {number[][]}
 */
 var threeSum = function(nums) {
    let toReturn = [];
    nums.sort();

    for(let i = 0; i < nums.length; i++){
        console.log('hi out');
        // prevent duplicates from being found and added to return list
        if(i > 0){
            console.log(`nums[i]=${nums[i]}`);
            while(nums[i] == nums[i - 1] && i < nums.length){
                i++;
                console.log('i++');
            }
        }


        let l = i + 1;
        let r = nums.length - 1;
        


        while(l < r){
            let sum = nums[i] + nums[l] + nums[r];
            console.log(`i=${i} current=${nums[i]} nums[l]=${nums[l]} nums[r]=${nums[r]} sum=${sum}   ||||||| l=${l} r=${r}`);
            if(sum == 0){
                console.log('pushing above value');
    
                toReturn.push([nums[i], nums[l], nums[r]]);

                let previous = l;
                l++;
                while(nums[l] == nums[previous]){
                    console.log('shifting left pointer after duplicate');
                    l++;
                }
             
                if(l > nums.length)
                    break;
   

            }
            else if(sum > 0){
                console.log('else if');
                r -= 1;
            }
            else{
                console.log('else');
                l += 1;
            }

        }
    }
    return toReturn;
};

// console.log(threeSum([-2,0,1,1,2]));

// console.log(threeSum([-1,0,1,2,-1,-4]));


// console.log(threeSum([-2,0,1,1,2]));

// console.log(threeSum([0,0,0,0]));

// console.log(threeSum([-1,0,1,2,-1,-4]));

console.log(threeSum([-1,0,1,2,-1,-4,-2,-3,3,0,4]));

// [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]



let difference = arrA.filter(x => !arrB.includes(x));