### 1. Comments ###
```javascript
// Inline comment
/*
  Block comment
*/
```

### 2. Printing ###
```javascript
console.log("Output text");
process.stdout.write("Output text without ln");
```

### 3. Reading ###
```javascript
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("What's your age?", function(my_age) {
  // The type of the input value is, by default, a string
  rl.close();
});
```
### 4. Variables and Data Types ###
Variables are **dynamically** typed. Is not necessary define the type on creation
```javascript
  let var_string = "Text"; // string
let var_string2 = 'Text'; // string
// Numeric
let var_int = 100; // int
let var_float = 2.3; // float
let var_complex = new Complex(3, 2); // complex
// Boolean 
let var_boolean = true; // boolean (true/false)

// Sequence
let var_list = [1, 3, 4]; // list (mutable)
let var_tuple = [1, 3, 4]; // tuple (List is immutable)
let var_range = Array.from({ length: 5 }, (_, i) => i); // range
let var_dict = {"a": 1, "b": 2, "c": 3}; // dict
let var_set = new Set(["a", "b", "c"]); // set (Items are immutable, the list not)

// None
let var_none = null;

// Get type of variable
typeof my_var;

// Assign
let x, y, z;
x = y = z = "Text";
let fruits = ["apple", "banana", "cherry"];
[x, y, z] = fruits;

// Global
globalThis.x;
  
```

### 5. Cast data types ### 
```javascript
  parseInt();
  parseFloat();
  String();
  Boolean();
```
### 6. Operators ###
```javascript
  #// Arithmetic
+; // Addition
-; // Subtraction
*; // Multiplication
/; // Division
**; // Power
Math.sqrt(); // Raiz quadrada
%; // Modulo

// Assignment
+=; -=; *=; /=;

// Logical
&&; // AND
||; // OR
!; // NOT

// Identity
===; !==;

// Membership
in;
!in;

// Math functions
Math.max();
Math.min();
Math.sum();
Math.pow(); // power
```

### 7. Conditional Statements ###
```javascript
  let my_var = 10;
  if (my_var < 10) {
    console.log('minor');
  } else if (my_var === 10) {
    console.log('equal');
  } else {
    console.log('major');
  }

```
### 8. Loops ###
```javascript
// for
for (let i = 0; i < 10; i++) {
  console.log(i);
}

// forEach
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9].forEach(i => {
  console.log(i);
});

// while
let i = 0;
while (i < 10) {
  console.log(i);
  i++;
}
```

### 9. Functions ###
```javascript
  function my_function(...parameters) {
    console.log(parameters[2]);
  }

  my_function("a", "b", "c");

  // kwargs
  function my_other_function(kwargs) {
    console.log(kwargs.name);
  }

  my_other_function({name: 'Fernando'});
```
### 10. String methods ###
```javascript
  // Multiline strings
let x = `
  asdfasdfasd
  asdfasdfasd
`;
x = "The best things in life are free!";

// String size
x.length;

// Contains
if (x.includes("best")) {
  console.log("yes");
}

// Slicing (By position)
console.log(x.slice(2, 5)); // Position 2 to 5
console.log(x.slice(0, 5)); // Print from the start to position 5
console.log(x.slice(2)); // Print from position 2 to the end
console.log(x.slice(-5, -2)); // Print by the end
console.log(x.slice()); // Print all array

// Uppercase
x.toUpperCase();

// Lowercase
x.toLowerCase();

// Trim
x.trim();

// Replace
x.replace(/t/g, "x");

// Split
x.split(" ");

// Concatenation
console.log("Text" + myVar);

// Index
x.indexOf("life");

// Format
const name = "John Snow";
const age = 25;
console.log(`Name: ${name}, age: ${age}`);
console.log(`Age: ${age}, name: ${name}`);

```
### 11. Date format (convertion methods) ###

```javascript
  const now = new Date();

  // Current date
  console.log(now.toISOString());

  // Print formatted date
  console.log(now.toLocaleString('en-US', { weekday: 'long' }));
  console.log(now.getDate());
  console.log(now.getMonth() + 1);
  console.log(now.getFullYear());
  console.log(now.getHours());
  console.log(now.getMinutes());
  console.log(now.getSeconds());
  console.log(now.getDay());
```

### 12. Arrays ###
```javascript
  let my_list = ["apple", "banana", "orange"];

// Get size
console.log(my_list.length);

// Get index item
console.log(my_list[0]);
// Range of indexes
console.log(my_list.slice(2, 5));
console.log(my_list.slice(0, 4));
console.log(my_list.slice(2));
console.log(my_list.slice(-5, -2));

// Check if one item exists
if (my_list.includes("apple")) {
  console.log("ok");
}

// Change one value
my_list[1] = "Grape";

// Change a range of value
my_list.splice(2, 2, "Fruit1", "Fruit2");

// Insert values on specified index
my_list.splice(2, 0, "watermelon");

// Insert data from another array
my_list.push(...["new1", "new2"]);

// Append
my_list.push("cherry");

// Remove
my_list.splice(my_list.indexOf("apple"), 1);

// Remove specified index
my_list.splice(1, 1);
// If not specify the index, the last item will be removed
my_list.pop();

// Remove all array
my_list.length = 0;

// Convert to one list
my_list = ["apple", "banana", "orange"];

// Iterate
for (const x of my_list) {
  console.log(x);
}

// Iterate with the index numbers
for (let i = 0; i < my_list.length; i++) {
  console.log(my_list[i]);
}

// Using forEach
my_list.forEach(x => {
  console.log(x);
});

// Sorting
my_list.sort();
my_list.sort((a, b) => b.localeCompare(a));

// Copy
let new_list = my_list.slice();
let new2 = [...my_list];

// Reverse
my_list.reverse();

// Join
new_list = my_list.concat(new_list);
new_list.push(...my_list);

// Umpacking
let red, yellow, orange;
[red, yellow, orange] = x;

```

### 13. Files (read and write) ###
```javascript
  const fs = require('fs');

  try {
    const data = fs.readFileSync('file.txt', 'utf-8');
    console.log(data);
  } catch (error) {
    // Handle error here
  }

  // Read file
  // Mode: r - readonly; 
  try {
    const my_file = fs.readFileSync('file.txt', 'utf-8');
    // Read all the file
    console.log(my_file);

    // Read first line
    const firstLine = my_file.split('\n')[0];
    console.log(firstLine);
  } catch (error) {
    // Handle error here
  }

  // Write file
  try {
    fs.writeFileSync('file.txt', 'New line', { flag: 'a' });
  } catch (error) {
    // Handle error here
  }

```
### 14. Exceptions ###
```javascript
  try {
  // Throw a new exception
  throw new Error("Error on try");
} catch (e) {
  console.log(e.message);
} finally {
  console.log("No errors!");
}
```

### 15. Classes/Objects ###
```javascript
  class Person {
    constructor(firstname, lastname) {
      this.firstname = "";
      this.lastname = "";
    }

    toString() {
      return `${this.firstname} ${this.lastname}`;
    }

    myFunction() {
      console.log(`Hello ${this.name} ${this.lastname}!`);
    }
  }

```
### 16. Inheritance, Encapsulation and Polymorphism ###
```javascript
  class Person {
    constructor(firstname, lastname) {
      this.firstname = firstname;
      this.lastname = lastname;
    }

    toString() {
      return `${this.firstname} ${this.lastname}`;
    }
  }

  class Student extends Person {
    constructor(firstname, lastname, age) {
      super(firstname, lastname);
      this._age = age;
    }

    get age() {
      return this._age;
    }

    toString() {
      return `${this.firstname} ${this.lastname} (${this.age})`;
    }
  }
```

### 17. Connection to database ###
```javascript

  const mysql = require('mysql');

  // Create a new connection
  const myConnection = mysql.createConnection({
    host: "localhost",
    user: "username",
    password: "password",
    database: "database"
  });

  myConnection.connect();

  // Insert
  const insertSql = "INSERT INTO USERS (firstname, lastname) VALUES (?, ?)";
  // one value
  const insertValues = ["John", "Snow"];
  // multiple values
  const insertMultipleValues = [
    ["Maria", "Silva"],
    ["Jose", "Loureiro"],
    ["Alfredo", "Chaves"]
  ];
  myConnection.query(insertSql, [insertValues], (error, results) => {
    if (error) throw error;
    console.log(results.affectedRows, "Record inserted");
  });

  // Select
  const selectSql = "SELECT firstname, lastname FROM USERS";
  myConnection.query(selectSql, (error, result_set) => {
    if (error) throw error;
    for (const row of result_set) {
      console.log(row.firstname, row.lastname);
    }
  });

  myConnection.end();

```

### 18. HTTP Server (API)
```javascript
const http = require('http');
const url = require('url');
const querystring = require('querystring');

const host = '127.0.0.1';
const port = 8091;

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url);
  const path = parsedUrl.pathname;

  if (path === '/users' && req.method === 'GET') {
    res.writeHead(200, { 'Content-Type': 'application/json' });
    const data = JSON.stringify({ username: 'user', age: '52' });
    res.end(data);
  } else if (path === '/users' && req.method === 'POST') {
    let body = '';
    req.on('data', chunk => {
      body += chunk.toString();
    });

    req.on('end', () => {
      const postData = querystring.parse(body);
      const response_data = { message: 'Received POST data', data: postData };
      res.writeHead(201, { 'Content-Type': 'application/json' });
      res.end(JSON.stringify(response_data));
    });
  } else {
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('Not Found');
  }
});

server.listen(port, host, () => {
  console.log(`Servidor rodando em http://${host}:${port}`);
});
```
### 19. HTTP Client
```javascript
  const axios = require('axios');

const url = 'https://www.cebraspe.org.br/concursos/serpro_23';

// GET
axios.get(url)
.then(response => {
  if (response.status === 200) {
    console.log(response.data);
  } else {
    console.log('Erro', response.status);
  }
})
.catch(error => {
  console.error(error);
});

// POST
const postData = { title: 'foo', body: 'bar', userId: 1 };
axios.post(url, postData)
.then(response => {
  if (response.status === 201) {
    console.log('Novo objeto criado', response.data);
  } else {
    console.log('Erro: ', response.status);
  }
})
.catch(error => {
  console.error(error);
});
```
### 20. Tests ###
```javascript
const assert = require('assert');

function sumOfNumbers(number1, number2) {
  return number1 + number2;
}

class TestSum {
  test_sum_ok() {
    assert.strictEqual(sumOfNumbers(2, 3), 5, "Should be 5");
  }

  test_sum_nok() {
    assert.notStrictEqual(sumOfNumbers(2, 3), 2, "Is incorrect");
  }
}

const testInstance = new TestSum();
```