var search = function(nums, target) {


    let idx = 0;
    let idx_temp;
    // let middle_element;
    console.log('start');
    do{
        idx_temp = Math.floor(nums.length / 2);

        if(nums[idx_temp] < target){
            console.log('if #1');
            nums = nums.slice(0,idx);
        }
        else if(nums[idx_temp] > target){
            console.log('if #2');
            nums = nums.slice(idx_temp + 1, nums.length);
            idx += idx_temp;
        }
      console.log(`nums.length=${nums.length}`);
    } while(nums.length > 1)

    console.log(idx);

    console.log('end');

};

console.log(search([-1,0,3,5,9,12], 9));





