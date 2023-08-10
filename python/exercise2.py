def solution(test, original):
    return sorted(test.lower()) == sorted(original.lower())

def testSolution():
    print(solution("Buckethead", "DeathCubeK"))

testSolution()