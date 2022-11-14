/**
 * 
 */
 
 class Test {
	static Hello(){
		return "I Am Calling The Static Method Here";
	}
	
	static Hi(){
		return "I Am calling Hi Static Method";
	}
}



console.log(Test.Hello());
console.log(Test.Hi());

class TestAgain{
	
	constructor(){
		console.log(TestAgain.HelloStaticMethod());
		console.log(TestAgain.HiStaticMethod());
		
	}
	
	static HelloStaticMethod(){
		return " Hello I Am Calling The hello Static Method ";
	}
	
	static HiStaticMethod(){
		return "Hi I Am calling The Hi Static Method";
	}
}

console.log("first time Function Calling inside the Constructor ");
var test = new TestAgain();

console.log("Second  time Function Calling inside the Constructor ");
var test = new TestAgain();
