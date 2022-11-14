/**
 * 
 */
 
 function Employee(FirstName , LastName){
	this.FirstName = FirstName;
	this.LastName = LastName;
}


Employee.prototype.FUllName= function(){
	return this.FirstName+"  "+this.LastName;
}

var employee1=new Employee("Martin","Roy");  
var employee2=new Employee("Duke", "William");  

console.log(employee1.FUllName());

console.log(employee2.FUllName());


function Student(id,name,salary,Address){
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.Address = Address;
}


Student.prototype.concatenationOfData = function(){
	return this.id + " "+ this.name + " "+ this.salary + " "+ this.Address;
}

var FirstStudent = new Student(101,"Sunil",22600,"LKO");
console.log("The Detail of The First Student is ");
console.log(FirstStudent.concatenationOfData());S