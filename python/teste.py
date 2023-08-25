try:
  raise Exception('Error on try')
except Exception as e:
  print(e)
else:
  print('No exceptions')
finally:
  pass