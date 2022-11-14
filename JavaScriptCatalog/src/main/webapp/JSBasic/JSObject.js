/**
 * 
 */
 
 //Let’s see the simple example of creating object in JavaScript.
var empInfo = {
	id:102,
	name : "Manoj",
	age:23	
}
console.log("The EmpInfo is ")
console.log(empInfo);

// creating the instance Of The Object using new Keywords

var empInformation = new Object();
empInformation.id = 103;
empInformation.name = "Rakesh";
empInformation.salary = 12500;
console.log("The Personal Info is ");
console.log(empInformation);


//The this keyword refers to the current object.
//The example of creating object by object constructor is given below.

function empInformationPart(id,name,salary){
	this.id = id;
	this.name = name;
	this.salary = salary;
}

e = new empInformationPart(1000,"Sunil",22000);
console.log("The Personal Info is ");
console.log(e);
e = new empInformationPart(1000,"Sunil",22000);
console.log("The Personal Info is ");
console.log(e);
e = new empInformationPart(1000,"Sunil",22000);
console.log("The Personal Info is ");
console.log(e);
e = new empInformationPart(1000,"Sunil",22000);
console.log("The Personal Info is ");
console.log(e);


/*
Defining method in JavaScript Object
We can define method in JavaScript object. But before defining method, we need to add property in the function with same name as method.

The example of defining method in object is given below.
*/

function EmployInformation(id,Name,salary){
	this.id=id;
	this.Name = Name;
	this.salary = salary;
	
	this.changeSalary=changeSalary;  
	function changeSalary(otherSalary){
		this.salary = otherSalary;
	}
}


e = new EmployInformation(10001,"Harish Kumar Gupta",22765);
e.changeSalary(30000);
console.log("The Data is ");
console.log(e);








