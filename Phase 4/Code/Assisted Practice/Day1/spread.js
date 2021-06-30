
// ----- 1 -----
// let arr1 = [1, 2, 3];
// let arr2 = [...arr1]; 


// console.log(arr1);
// console.log(arr2);

// ----- 2 -----
let arr1 = [0, 1, 2];
let arr2 = [3, 4, 5];
let arr3 = [...arr1, ...arr2];


console.log(arr1);
console.log(arr2);
console.log(arr3);


// ----- 3 -----
let obj1 = { foo: 'bar', x: 42 };
let clonedObj = { ...obj1 };


console.log(obj1);
console.log(clonedObj);



// ----- 4 -----
let obj3 = { foo: 'bar', x: 42 };
let obj2 = { foo: 'baz', y: 13 };

let mergedObj = { ...obj3, ...obj2 };

console.log(obj3);
console.log(obj2);
console.log(mergedObj);


function sum(x, y, z) {
   return x + y + z;
}
const numbers = [1, 2, 3];

console.log(sum(...numbers));
