/**
 * 
 */

 
 class Student{
	
	constructor(){
		this.id = 120;
		this.name = "Sunil";
	}
}

var firstStudent = new Student();
console.log("the First Student  Id is "+ firstStudent.id+ " "+ "The First Student Name is "+ firstStudent.name );


class ComapnyName {
	
	constructor(){
		this.companyName = "Infinite COmputer Solutions";
	}
}


class Employee extends ComapnyName{
	constructor(id,Name){
		super();
		this.id = id;
		this.Name = Name;
	}
}

var firstEmployee = new Employee(120,"Sunil");
console.log(firstEmployee.id + " "+ firstEmployee.Name+ " "+ firstEmployee.companyName);
