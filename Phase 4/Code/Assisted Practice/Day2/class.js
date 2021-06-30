// class Book {
//    constructor(name, author) {
//       this.name = name;
//       this.author = author;
//    }
//    show() {
//       console.log(`Book name: ${this.name}`);
//       console.log(`Author: ${this.author}`);
//    }
// }
// const book = new Book(
//    'JavaScript: The Good Parts', 'Douglas Crockford'
// );
// console.log(book.name);  
// book.show();


class Emp {
	constructor(empname,age,gender,deptname,designation){
		this.empname = empname;
		this.age = age;
		this.gender = gender;
		this.deptname = deptname;
		this.designation = designation;
	}

	set Empempname(a1){
		this.empname = a1;	
	}
	set Empage(a2){
		this.age = a2;
	}
	set Empgender(a3){
		this.gender = a3;
	}
	set Empdeptname(a4){
		this.deptname = a4;
	}
	set Empdesignation(a5){
		this.designation = a5;
	}

	get Empempname(){
		return this.empname;
	}
	get Empage(){
		return this.age
	}
	get Empgender(){
		return this.gender;
	}
	get Empdeptname(){
		return this.deptname;
	}
	get Empdesignation(){
		return this.designation;
	}

	


	printDeatils(){
		console.log(`Emp name: ${this.empname}`);
      	console.log(`Emp age: ${this.age}`);
     	console.log(`Emp gender: ${this.gender}`);
      	console.log(`Emp deptname: ${this.deptname}`);
      	console.log(`Emp designation: ${this.designation}`);
      	console.log(`----------------------------------`)
      	
      	 	
	}

	static dispEmp(emps){
		for (var employee of emps){
			console.log(`${employee.empname} ------ : ${employee.designation}` )
		}
	}
}



const emp1 = new Emp(
   'Raka',23,'Male','HR','PSA'
); 


const emp2 = new Emp(
   'Zone',20,'Female','Process Project','DGM'
); 
emp1.printDeatils();

emp2.printDeatils();
Emp.dispEmp([emp1,emp2]);