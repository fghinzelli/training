### 1. Comments ###
```python
# Inline comment
"""
  Block comment
"""
```

### 2. Printing ###
```python
print("Output text")
print("Output text without ln", end="")
```

### 3. Reading ###
```python
my_age = input("What's your age?")
# The type of the input value is, by default, a string
```
### 4. Variables and Data Types ###
Variables are **dynamically** typed. Is not necessary define the type on creation
```python
  # Text
  var_string = "Text" # string
  var_string2 = 'Text' # string
  # Numeric
  var_int = 100; # int
  var_float = 2.3 # float
  var_complex = 3+2j # complex
  # Boolean 
  var_boolean = True # boolean (True/False)

  # Sequence
  var_list = [1, 3, 4] # list (mutable)
  var_tuple = (1, 3, 4) # tupple (List is immutable)
  var_range = range(0, 5) # range
  var_dict = {"a": 1, "b": 2, "c": 3} # dict
  var_set = {"a", "b", "c"} # set (Items are immutable, the list not)

  # Binary
  # bytes, bytearray, memoryview

  # None
  var_none = None

  # Get type of variable
  type(my_var)

  # Assign
  x, y, z = "Orange", "Banana", "Cherry"
  x = y = z = "Text"
  fruits = ["apple", "banana", "cherry"]
  x, y, z = fruits

  # Global
  global x
  
```

### 5. Cast data types ### 
```python
  int()
  float()
  str()
  bool()
```
### 6. Operators ###
```python
  # Arithmetic
  +  # Addition
  -  # Subtraction
  *  # Multiplication
  /  # Division
  ** # Power
  math.sqrt   # Raiz quadrada
  %  # Modulo

  # Assignment
  +=, -=, *=, /=

  # Logical
  and # AND
  or # OR
  not  # NOT

  # Identity
  is 
  is not

  # Membership
  in
  not in 

  ## Math functions
  max
  min
  sum 
  pow # power
```

### 7. Conditional Statements ###
```python
  my_var = 10
  if my_var < 10:
    print('minor')
  elif my_var == 10:
    print('equal')
  else:
    print('major')
```
### 8. Loops ###
```python
# for
for i in range(0, 10):
  print(i)

[print(i) for i in range(0, 10)]

# while
while i in range(0, 10):
  print(i)
```

### 9. Functions ###
```python
  def my_function(*parameters):
    print(parameters[2])

  my_function("a", "b", "c")

  # kwargs
  def my_other_function(**kwargs):
    print(kwargs['name'])

  my_other_function({'name': 'Fernando'})

  # Default parameters
```
### 10. String methods ###
```python
  # Multiline strings
  x = """
  asdfasdfasd
  asdfasdfasd
  """
  x = "The best things in life are free!"

  # String size
  len(x)

  # Contains
  if "best" in x:
    print("yes")

  # Slicing (By position)
  print(x[2:5]) # Position 2 to 5
  print(x[:5]) # Print from the start to position 5
  print(x[2:]) # Print from position 2 to the end
  print(x[-5:-2]) # Print by the end
  print(x[:]) # Print all array

  # Uppercase
  x.upper()

  # Lowercase
  x.lowercase()

  # Trim
  x.strip()

  # Replace
  x.replace("t", "x")

  # Split
  x.split(" ")

  # Concatenation
  print("Text" + myVar)

  # Index
  x.index("life")


  # Format
  name = "John Snow"
  age = 25
  print("Name: {}, age: {}".format(name, age))
  print("Age: {1}, name: {0}".format(name, age))

```
### 11. Date format (convertion methods) ###

```python
  import datetime

  # Current date
  datetime.datetime.today()

  # Current time
  datetime.datetime.now()

  # Print formatted date
  x = datetime.datetime.now()
  print(x.strftime(%A))
  # %d = day of month (1 - 31)
  # %m = month of year (1 - 12)
  # %Y = Full year 
  # %H = hour 24h format (0 - 23)
  # %M = minute (0 - 59)
  # %S = seconds (0 - 59)
  # %w = weekday (0 - 6)
```

### 12. Arrays ###
```python
  ### LISTS ###
  # Changeble, Ordered, Allow duplicates. Can contain different data types
  my_list = ["apple", "banana", "orange"]

  # Get size
  print(len(my_list))

  # Get index item
  print(my_list[0])
  # Range of indexes
  print(my_list[2:5])
  print(my_list[:4])
  print(my_list[2:])
  print(my_list[-5:-2])

  # Check if one item exists
  if ("apple" in my_list):
    print("ok")

  # Change one value
  my_list[1] = "Grape"

  # Change a range of value
  my_list[2:3] = ["Fruit1", "Fruit2"]

  # Insert values on specified index
  my_list.insert(2, "watermelon")

  # Insert data from another array
  my_list.extend(["new1", "new2"])

  # Append
  my_list.append("cherry")

  # Remove
  my_list.remove("apple")

  # Remove specified index
  my_list.pop(1)
  # If not specify the index, the last item will be removed
  my_list.pop()

  # Remove one item
  del my_list[2]
  # Remove all array
  del my_list

  # Remove all itens
  my_list.clear() 

  # Convert to one list
  my_list = list(("apple", "banana", "orange"))

  # Iterate
  for x in my_list:
    print(x)

  # Iterate with the index numbers
  for i in range(len(my_list)):
    print(my_list[i])

  # Using list compreehensoin
  [print(x) for x in my_list]

  # Sorting
  my_list.sort()
  my_list.sort(reverse=True)

  # Copy
  new = my_list.copy()
  new2 = list(my_list)

  # Reverse
  my_list.reverse()

  # Join
  my_list + new
  my_list.extend(new)

  # Umpacking
  (red, yellow, orange) = x
  # Upacking "other" into a varible
  x = ("one", "two", "three", "four", "five")
  (one, two, *other)

  # Multiply values
  new_list = my_list * 2

  # Count the number of occurences of one item
  new_list.count("apple")

  # Return the index of a value
  my_list.index("apple")

  ### TUPLE ###
  # IMUTABLE, Ordered, Allow duplicate values
  my_tuple = ("apple", "banana", "orange")
  # To create a tuple with one unique item, inclue a comma on the end
  only_one = ("apple",)

  # To change values of a tuple
  x = ("apple", "banana", "orange")
  y = list(x)
  y[1] = "kiwi"s
  x = tuple(y)

  ### SET ###
  # Unorderd, unchangeable and unindexed (Items are immutable, but the list not!). Without duplicate values.
  my_set = {"apple", "banana", "orange"}

  # To add a new item
  my_set.add("lemon")

  # To add sets
  thisset = {"one", "two", "three"}
  otherset = {"four", "five", "six"}
  thisset.update(otherset) 

  ### DICTIONARY ###
  # Ordered, Changeale, does not allow duplicates.
  this_dict == dict(name = "John", age = 30)
  other_dict = {
    "name": "John",
    "age": 36
  }

  print(this_dict['name'])
  print(this_dict.get('name'))
  # List of keys
  this_dict.keys()
  # List all values
  this_dict.values()
  # List of tuples with each item
  this_dict.items()


```

### 13. Files (read and write) ###
```python
  import os

  try:
    f = open('file.txt', 'r')
    print(f.read())
    f.close()
  except:

  # Read file
  # Mode: r - readonly; 
  with open('file.txt', 'r') as my_file:
    # Read all the file
    print(my_file.read())

    # Read first line
    print(my_file.readline())

  # Write file
  # Modes: a: append to the end; w: override any content
  with open('file.txt', 'a') as my_file:
    my_file.write('New line');

```
### 14. Exceptions ###
```python
  try:
    # throew a new exception
    raise Exception("Error on try")
  except Exeption as e:
    print(e)
  else:
    print("No errors!")
  finally:
    pass
```

### 15. Classes/Objects ###
```python
  class Person():
    __init__(self, firstname, lastname):
      self.firstname = ""
      self.lastname = ""

    __str__(self):
      return f"{self.firstname} {self.lastname}"

    def myFunction(self):
      print(f"Hello {self.name} {self.lastname}!")

```
### 16. Inheritance, Encapsulation and Polymorphism ###
```python
  class Person:
    def __init__(self, firstname, lastname):
      self.firstname = firstname
      self.lastname = lastname

    def __str__(self):
      return f"{self.firstname} {self.lastname}"

  class Student(Person): # Inheritance
    def __init__(self, firstname, lastname, age):
      super().__init__(firstname, lastname)
      self.__age = age

    # Emcapsulation
    @property
    def age
      return self.__age

    # Polymorphism
    def __str__(self):
      return "f{self.firstname} {self.lastname} ({self.age})"
```

### 17. Connection to database ###
```python

  # Using Mysql
  import mysql.connector

  # Create a new connection
  myConnection = mysql.connector.connect(
    host="localhost"
    user="username"
    password="password"
    database="database"
  )

  cursor = myConnection.cursor()
  # Insert 
  sql = "INSERT INTO USERS (firstname, lastname) VALUES (%s, %s)"
  # one value
  val = ("John", "Snow")
  # multiple values
  val = [
    ("Maria", "Silva"),
    ("Jose", "Loureiro"),
    ("Alfredo", "Chaves")
  ]
  cursor.execute(sql, val)
  myConnection.commit()
  print(cursor.rowcount, "Record inserted")

  # Select 
  cursor.execute("SELECT firstname, lastname FROM USERS")
  # return all lines
  result_set = cursor.fetchall()
  # return only one value
  result_unique = cursor.fetchone()

  for i in result_set:
    print(i)

```

### 18. HTTP Server (API)
```python
  from http.server import BaseHTTPRequestHandler, HTTPServer
  import json

  class MyServer(BaseHTTPRequestHandler):
    def _set_response(self, status_code=200, content_type='application/json'):
      self.send_response(status_code)
      self.send_header('Content-type', content_type)
      self.end_headers()

    def do_GET(self):
      if self.path == '/users':
        self._set_response()
        data = {'username': 'user', 'age': '52'}
        self.wfile.write(json.dumps(data).encode('utf-8'))
      else:
        self.send_response(404)
        self.end_headers()
        self.wfile.write('Not found'.encode('utf-8'))

    def do_POST(self):
      if self.path == '/users':
        content_length = int(self.headers['Content-Length'])
        post_data = self.rfile.read(content_length).decode('utf-8')
        data = json.loads(post_data)
        response_data = {'message': 'Received POST data', 'data': data}
        self._set_response(201)
        self.wfile.write(json.dumps(response_data).encode('utf-8'))
      else:
        self.send_response(404)
        self.end_headers()
        self.wfile.write('Not Found'.encode('utf-8'))   

  host = '127.0.0.1'
  port = 8091

  server = HTTPServer((host, port), MyServer)

  print(f'Servidor rodando em http://{host}:{port}')

  server.serve_forever()
```
### 19. HTTP Client
```python
  import requests
  import json

  url = 'https://www.cebraspe.org.br/concursos/serpro_23'

  # GET
  response = requests.get(url)
  if response.status_code == 200:
    print(response.content)
  else:
    print('Erro', response.status_code)

  # POST
  data = {'title': 'foo', 'body': 'bar', 'userId': 1}
  response = requests.post(url, json=json.dumps(data))

  if response.status_code == 201:
    created_data = response.json()
    print('Novo objeto criado', created_data)
  else:
    print('Erro: ', response.status_code)
```
### 20. Tests ###
```python
  assert sum([1, 4, 1]) == 6, "Should be 6"

### Builtin class unittest

import unittest

def sumOfNumbers(number1, number2):
  return number1 + number2

class TestSum(unittest.TestCase):

  def test_sum_ok():
    self.assertEqual(sumOfNumbers(2, 3), 5, "Should be 5")

  def test_sum_nok(self):
    self.assertNotEqual(sumOfNumbers(2, 3), 2, "Is incorect")

# To execute all the test cases:
python -m unittest discover -s .
```