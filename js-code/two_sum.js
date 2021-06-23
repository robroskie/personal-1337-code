
class Timer {
    // Automatically starts the timer
    constructor(name = 'Benchmark') {
        this.NS_PER_SEC = 1e9;
        this.MS_PER_NS = 1e-6
        this.name = name;
        this.startTime = process.hrtime();
    }

    // returns the time in ms since instantiation
    // can be called multiple times
    runtimeMs() {
        const diff = process.hrtime(this.startTime);
        return (diff[0] * this.NS_PER_SEC + diff[1]) * this.MS_PER_NS;
    }

    // retuns a string: the time in ms since instantiation
    runtimeMsStr() {
        return `${this.name} took ${this.runtimeMs()} milliseconds`;
    }
}



var twoSum = function(nums, target) {
    //O(n) Single operation 
    const values = Object.assign({}, nums);

    for(let j = 0; j < nums.length; j++){
        if(nums.indexOf(target - nums[j]) != -1 && (nums.indexOf(target - nums[j]) != j)){
            return [j,nums.indexOf(target - nums[j])];
        }
    }

};

var twoSum_V1 = function(nums, target) {

    //Reduce the nums array into an object where each key represents a value from the array, in order
    //const values = nums.reduce((acc,curr)=> (acc[curr]='',acc),{});
    let values = {};

    //assign value to each key
    for(let i = 0; i < nums.length; i++)
        values[nums[i]] = i;

    for(let j = 0; j < nums.length; j++){
        if(values.hasOwnProperty(target - nums[j]) && (values[target-nums[j]] != j)){
            return[j,values[(target-nums[j])]];
        }
    }
    return[0,0];
};

const twoSum_On_Better = (arr, target) => {
	let numObject = {};
	for (let i = 0; i < arr.length; i++) {
		let thisNum = arr[i];
		numObject[thisNum] = i;
	}
	for (var i = 0; i < arr.length; i++) {
		let diff = target - arr[i];
		if (numObject.hasOwnProperty(diff) && numObject[diff] !== i) {
			return [i, numObject[diff]];
		}
	}
    return [0,0];
}

let a = [];

for(let k = 0; k < 1000000; k++){
    a.push(Math.floor(Math.random() * 1000));
}
for(let h = 0; h < 100; h++)
    console.log(a[h]);



// const t4 = new Timer('For Loop')
// console.log(twoSum_On_Better(a, 564));
// t4.runtimeMs()     // => 1212.34
// console.log(t4.runtimeMsStr())  // => 'For Loop took 1232.34 milliseconds'

const t3 = new Timer('For1 Loop')
console.log(twoSum_V1([3,2,4], 6));
t3.runtimeMs()     // => 1212.34
console.log(t3.runtimeMsStr())  // => 'For Loop took 1232.34 milliseconds'





