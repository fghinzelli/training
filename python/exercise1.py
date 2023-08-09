def solution(number):
  total = 0
  for i in range(0, number):
    if i % 3 == 0 or i % 5 == 0:
      total += i
  return total

def testSolution():
  if solution(10) == 23:
    print('Test Passed')
  else:
    print('Failed')

testSolution()

