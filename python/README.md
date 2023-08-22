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
  and // AND
  or // OR
  not  // NOT
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
### 9. Methods ###
### 10. String methods ###
```python

```
### 11. Cocatenation ###
```python
  print("Text" + myVar)
```

### 13. Objects ###
### 14. Access modifiers ###
### 15. Data Structures ###
### 16. Inheritance ###
### 17. Polymorphism ###
### 18. Connection to database ###
### 19. HTTP Server (API)
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
### 20. HTTP Client
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
  response = requests.post(url, json=json.loads(data))

  if response.status_code == 201:
    created_data = response.json()
    print('Novo objeto criado', created_data)
  else:
    print('Erro: ', response.status_code)
```
### 21. Tests ###
```python
  assert sum([1, 4, 1]) == 6, "Should be 6"
```
### 22. Date format (convertion methods) ###

```python

```
### 23. Files (read and write) ###
### 24. Exceptions ###


