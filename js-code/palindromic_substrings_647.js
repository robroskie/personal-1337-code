countSubStrings = (s) => {
  let count = 0;
  for (let i = 0; i < s.length; i++) {
    console.log("loop case");
    count++;

    // Even case
    for (let z = i + 1; z < s.length; z+=2) {
      if (s[i] == s[z]) {
        console.log("even case");
        count++;
      }
      else{
          break;
      }
    }

    // Odd case
    let left = 0;
    let right = 1;

    for (let z = 1; z <= Math.floor(s.length / 2); z++) {
      if (i - z >= 0) {
        left = s[i - z];
      } else {
        break;
      }

      if (i + z <= s.length) {
        right = s[i + z];
      } else {
        break;
      }

      if (right == left) {
        console.log("odd case added");
        count++;
      }
    }
  }
  return count;
};

// k = countSubStrings("aaaaa");

// console.log(k);

// k = countSubStrings("abc");
// console.log(k);

// k = countSubStrings("hello");
// console.log(k);


k = countSubStrings("aaa");
console.log(k);