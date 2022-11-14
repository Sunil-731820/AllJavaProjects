/**
 * 
 */
 
 
 class Student{
	
	constructor(){
		var StudentName;
		var StudentMarks;
	}
	
	getStudentName(){
		return this.StudentName;
	}
	
	setStudentName(StudentName){
		this.StudentName = StudentName;
	}
	
	getStudentMarks(){
		return this.getStudentMarks;
	}
	
	setStudentMarks(StudentMarks){
		this.StudentMarks = StudentMarks;
	}
	
}

var s1 = new Student();
s1.setStudentName("Sunil");
s1.setStudentMarks(70);
console.log("Student Data is ");
console.log(s1.getStudentName() + " "+ s1.getStudentMarks());
