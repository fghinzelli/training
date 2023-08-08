def solution(number):
  total = 0
  for i in range(0, number):
    aux = 0
    if i % 3 == 0:
      aux = i
    if aux == 0 and i % 5 == 0:
      aux = i
    total += aux
  return total

def testSolution():
  if solution(10) == 23:
    print('Test Passed')
  else:
    print('Failed')

testSolution()

