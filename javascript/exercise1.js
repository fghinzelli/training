function solution(number){
  let total = 0;
  for (let i=0; i <=number; i++) {
    let aux = 0;
    if (i % 3 === 0) {
      aux = i;
    }
    if (aux === 0 && i % 5 === 0) {
      aux = i;
    }
    total += aux;
  }
  return total;
}

function testSolution() {
  if (solution(10) === 23) {
    console.log('Test passed');
  } else {
    console.error('Failed')
  }
}

testSolution();