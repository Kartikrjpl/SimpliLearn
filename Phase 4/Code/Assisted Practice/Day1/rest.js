function sum(...params) {
   return params.reduce((previous, current) => {
      return previous + current;
   });
}
console.log(sum(1, 2, 3));
console.log(sum(1, 2, 3, 4));
function greet(greeting, ...names) {
   return `${greeting} ${names.join(", ")}!`;
}

console.log(greet("Hello", "Steve", "Bill"));
console.log(greet("Hello"));

