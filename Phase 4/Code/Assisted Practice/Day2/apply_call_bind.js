let cat = {type:'Cat',sound:'Meow'}
let dog = {type:'Dog',sound:'Woof'}

let say = function (greeting){
	console.log(greeting)
	console.log(this.type+" "+this.sound)
}

say.apply(cat,['Hi'])
say.apply(dog,['Hi'])



say.call(cat,'Hio')
say.call(dog,'Hio')


let car = {
	speed : 5,
	start : function(){
		console.log("Starts with "+this.speed);
	}
};


let aircraft = {
	speed : 10,
	fly : function(){
		console.log("Flying");
	}
};


let taxing = car.start.bind(aircraft)
taxing();
