class Animal1 {
   constructor(name) {
      this.name = name;
   }
   move(distanceInMeters = 0) {
      console.log(`${this.name} moved ${distanceInMeters}m.`);
   }
}
class Dog1 extends Animal1 {
   bark() {
      console.log('Woof! Woof!');
   }
}
const dog = new Dog1('Cooper');
dog.bark();    
dog.move(10);
class Animal {
  constructor(name) {
    this.name = name;
  }
  speak() {
    console.log(this.name + ' makes a noise.');
  }
}

class Dog extends Animal {
  constructor(name, color = 'white') {
    super(name);	
    this.color = color;
  }
  speak() {
    console.log(this.name + ' barks.');
  }
  describe() {	
    console.log(`${this.name} is ${this.color} in color.`);
  }
}

class Lion extends Animal {
  speak() {
    super.speak();		
    console.log(this.name + ' roars.');
  }
}

const a = new Animal('Tommy');
a.speak();     

const d = new Dog('Snowy');
d.speak();     
d.describe();  

const l = new Lion('Leo');
l.speak();
