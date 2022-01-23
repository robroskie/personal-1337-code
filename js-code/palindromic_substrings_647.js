var countSubstrings = function (s) {
  let evenPS = 0;
  let oddPS = 0;
  let countSingle = 0;

  for (let i = 0; i < s.length; i++) {
    let countOdd = true;
    let countEven = true;
    for (let z = 1; z + i < s.length && (countOdd || countEven); z++) {
      let leftOdd = s[i - z];
      let rightOdd = s[i + z];

      // Testing even case
      
      // if (i == 17) {
      //         console.log(`i=${i}   z=${z}   s[i]=${s[i]} and s[z]=${s[z]}   left=${left}    right=${right}           countOdd=${countOdd}    countEven=${countEven}   `);
      //         console.log(s[i] == right);
      //         console.log((z + i) % 2 != 0 && countEven);

      // }
      // console.log(`i=${i}   z=${z}   s[i]=${s[i]} and s[z]=${s[z]}   left=${left}    right=${right}           countOdd=${countOdd}    countEven=${countEven}   `);

      // Check even cases
      if(s[i] != rightOdd){
        countEven = false;
      }
      if(z == 1){
        if(s[i] == rightOdd){
          evenPS++;
          for(let k = 1; s[i + k + 1] == s[i - k] && typeof(s[i + k + 1]) != 'undefined' && typeof(s[i - k]) != 'undefined'; k++){
            evenPS++;
          }
        }
        else{
          countEven = false;
        }
      }

      // Check odd cases
      if (typeof leftOdd != "undefined" && typeof rightOdd != "undefined" && countOdd) {
        if (leftOdd == rightOdd) {
          oddPS++;
        } else {
          countOdd = false;
        }
      } else {
        countOdd = false;
      }
    }
    countSingle++;
  }


  return evenPS + oddPS + countSingle;
};

// let b = "hello";
// k = countSubStrings(b);
// console.log(k);

// b = "aaa"
// k = countSubStrings(b);
// console.log(k);

// b = "leetcode"
// k = countSubStrings(b);
// console.log(k);

// b = "fdsklf";
// k = countSubStrings(b);
// console.log(k);

// 64

// Evens at 0, 2, 4, 16, 17, 25, 26, 32
// Odds at 6, 7, 10, 11, 13, 14, 14(x2), 15, 17(x3), 

// const b = "bbccaacacdbdbcbcbbbcbadcbdddbabaddbcadb";
const b = "aaaaa";
// c = "0123456789"
//  "bbccaacacdbdbcbcb bb cbadcbdddbabaddbcadb";
k = countSubstrings(b);
console.log(k);

