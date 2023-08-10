function isAnagram(test, original) {
  let arrTest = [...test.toLowerCase()].sort();
  let arrOriginal = [...original.toLowerCase()].sort();
  return arrTest.filter((item, key) => arrTest[key] === arrOriginal[key]).length === arrTest.length;
}

function testIsAnagram() {
  if (isAnagram("TPJRUEwvWtbn", "UTbJXPvWRwEtn") && !isAnagram("dumble", "bumble")) {
    console.log("OK");
  } else {
    console.log("NOK");
  }
}

testIsAnagram();