const multiply1 = function (a, b) {
  return a * b;
};
console.log(multiply1(3, 4));

const multiply2 = (c, d) => {
  return c * d;
};
console.log(multiply2(3, 4));

const multiply3 = (x, y) => x * y;
console.log(multiply3(3, 4));


// ----------------
const square = x => x * x;
console.log(square(5));


const greet = () => {
  console.log('Arrow functions are concise');
};
greet();

const multiply = (a, b = 1) => a * b;
console.log(multiply(3, 4));  
console.log(multiply(3)); 

const greeting = (greeting, ...names) => {
  return `${greeting} ${names.join(", ")}!`;
}
console.log(greeting("Hello", "Steve", "Bill"));
console.log(greeting("Hello"));




// ----------------


const showBook = ({ name: bookName, author }) => {
  console.log(`The book ${bookName} is authored by ${author}.`);
};
const book = {
  id: 100,
  name: 'JavaScript: The Good Parts',
  author: 'Douglas Crockford',
  price: 375,
  publisher: 'Shroff'
};
showBook(book);






// ----------------


let team = {
   players: ['Jeter', 'Ruth', 'Young', 'Bonds'],
   country: 'USA',
   display: function () {
      this.players.forEach(player => {
         console.log(`${player} is from ${this.country}`);
      });
   }
};

team.display();


