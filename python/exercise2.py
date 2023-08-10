def solution(test, original):
    arrTest = list(test.upper())
    arrOriginal = list(original.upper())
    arrTest.sort()
    arrOriginal.sort()
    return (len(test) == len(original)) and (arrTest == arrOriginal)

def testSolution():
    print(solution("Buckethead", "DeathCubeA"))

testSolution()