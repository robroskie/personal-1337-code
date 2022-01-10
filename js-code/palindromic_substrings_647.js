countSubStrings = (s) => {
  let left = null;
  let right = null;
  let count = 0;

  for (let i = 0; i < s.length; i++) {
    console.log('loop');
    count++;
    for(let z = 1; z < s.length; z++){
      console.log(`z=${z} i=${i} s[i-z]=${s[i-z]}  s[i+z]=${s[i+z]}`)
      if(i - z >= 0){
        left = s[i - z];
      }
      else{
        left = null
      }

      if(i + z < s.length){
        right = s[z];
      }
      else{
        right != null;
      }
      console.log(`z=${z} i=${i} s[i-z]=${s[i-z]}  s[i+z]=${s[i+z]}`)
      
      if(s[i] == s[z] && (i + z) % 2 != 0){
        console.log('count even++');
        count++;
      }

      else if(s[left] === s[right] && left != null && right != null){
        console.log('count odd++');
        count++;
      }

      else{
        break;
      }

    }
  }
  return count;
};
const b = "aaaaa";

k = countSubStrings(b);
console.log(k);
