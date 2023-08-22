import string
qtd_testes = int(input())

alphabet = list(string.ascii_lowercase)

for i in range(0, qtd_testes):
  total_operations = 0
  string1, string2 = input().split()
  for i in range(len(string1)):
    index_string1 = alphabet.index(string1[i]) + 1
    index_string2 = alphabet.index(string2[i]) + 1
    if index_string1 < index_string2:
      total_operations += (index_string2 - index_string1)
    elif index_string1 > index_string2:
      total_operations += ((len(alphabet) - index_string1) + index_string2)
  print(total_operations)

