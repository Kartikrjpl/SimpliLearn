// take the user age from the as const age = <value> and let percentage = <value>;
// (1) if age > 18 and age <30 
//     resolve 
//     reject
// (2) if percentage > 50 and percentage < 70
// (3) bind the (1) and (2) with the .then  and 
//    - if both are true then show 'resolve' 
//    - if any one of them is false then show reject using .catch
//    - print the message as "we are into finally block" in .finally


const age = 20

let per = 61

let ageValue = new Promise(function (resolve, reject) {
    if (age>18 && age<30) {
        resolve("There is correct age value.");
    } else {
        reject("There is no correct age value");
    }
});


let perValue = new Promise(function (resolve, reject) {
    if (per>50 && per<70) {
        resolve("There is correct per value.");
    } else {
        reject("There is no correct per value");
    }
});

Promise.all([ageValue,perValue]).then(
   function success1(result) {
        console.log(result);
    }
 )
.then(
   function success2(result) {
        console.log(result);
    }
 )

// executes if there is an error
.catch(
    function errorValue(result) {
        console.log(result);
    }
)
.finally(
    function greet() {
        console.log('We are in finally.');
    }
);