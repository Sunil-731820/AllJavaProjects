/**
 * 
 */
var _value = 100;
console.log("the Value is ",_value);

var $number = 200;
console.log("The Number is ",$number)


// This is the global Variable in JS
var data = 300;
function firstFunct(){
	console.log("The Data is ",data);
	
}

function secondFunct(){
	console.log("the Data is ",data);
}

firstFunct();
secondFunct();

var undefined ;
console.log("the Undefined Variable is ",undefined);

console.log("the Type Of The avraivle is ")
console.log(typeof _value);