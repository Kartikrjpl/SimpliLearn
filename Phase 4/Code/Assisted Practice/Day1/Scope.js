// function someFunction() {
//    var x = "Declared inside the function";  
//    console.log("Inside the function");
//    console.log(x);
// }

// someFunction();
// console.log(x); 
var x = "Declared outside the function";

someFunction();

function someFunction() {
   console.log("Inside the function");
   console.log(x);
}

console.log("Outside the function");
console.log(x);
