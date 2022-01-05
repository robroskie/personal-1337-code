


containsDuplicate = (arr) => {
    let temp = new Array(arr.length - 1).fill(0);

    for(let i = 0; i < temp.length; i++){
        temp[arr[i]] += 1
        if(temp[arr[i]] > 1)
            return false;
    }
    return true;
}



arr = [1,2,3]

console.log(containsDuplicate(arr));