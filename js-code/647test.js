

var countSubstrings = function(s) {
    let sol = 0;
    for (let i = 0; i < s.length; i++) {
      for (let j = i + 1; j < s.length + 1; j++) {
        let temp = s.substr(i, j - i);
        if (isPalim(temp)) {
          sol++;
        }
      }
    }
    return sol;
  };
  
  const isPalim = (str) => {
    for (let i = 0, j = str.length - 1; i < j; i++, j--) {
      if (str[i] !== str[j]) {
        return false;
      }
    }
    return true;
  };



const s = "bbccaacacdbdbcbcbbbcbadcbdddbabaddbcadb"

console.log(countSubstrings(s));