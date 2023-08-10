function countOfSheeps(arrayOfSheep) {
    return arrayOfSheep.filter(sheep => sheep).length
}

function testCountOfSheeps() {
    if (countOfSheeps([true, true, false, undefined]) === 2) {
        console.log("OK");
    } else {
        console.log("NOK");
    }
}

testCountOfSheeps()