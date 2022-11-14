/**
 * 
 */
 
 function Hello(){
	return "Hello user ";
	
}

var hello = Hello();
console.log("I am Calling the Hello()")
console.log(hello);


function add(firstNumber,  secondNumber){
	var sum = firstNumber + secondNumber;
	console.log("The Sum Of The Two Number is ");
	console.log(sum);
}
add(100,100);
for(var i=0;i<5;i++){
	add(200,200);
}

// function Returning someThing 

function getReturn(){
	return "Hello I Am Giving some Money To You";
}

console.log("the Returning function is ");
console.log(getReturn());


// The Use Of The New Function()

var add = new Function(
	"FirstNumber",
	"SecondNumber",
	"return FirstNumber + SecondNumber"
)

console.log(add(10,1000));


//Again the Use Of The New Function()

var pow = new Function(
	"base",
	"power",
	"return Math.pow(base,power)"
)

console.log("the Power Of The Number is ");
console.log(pow(2,2));
