function multiply(a, b) {
   return a * b;
}
console.log(multiply(5, 2));
console.log(multiply(5)); 
function multiply(a, b) {
   b = (typeof b !== 'undefined') ? b : 1;
   return a * b;
}
console.log(multiply(5, 2));
console.log(multiply(5)); 
function multiply(a, b = 1) {
   return a * b;
}

console.log(multiply(5, 2)); 
console.log(multiply(5));   
function greet(name, greeting, message = `${greeting} ${name}`) {
   return [name, greeting, message];
}


console.log(greet('David', 'Hi'));
console.log(greet('David', 'Hi', 'Happy Birthday!'));
function multiply(a = 1, b) {
  return a * b;
}

console.log(multiply(2, 5));          
console.log(multiply(5));             
console.log(multiply(undefined, 5));


