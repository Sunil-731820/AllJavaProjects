/**
 * 
 */
 
 class Momenets extends Date {
	
	constructor(){
		super();
	}
}

var date = new Momenets();
console.log("The Todays Date is ");
console.log(date.getDate()+ "-"+ (date.getMonth()+1)+ "-"+ date.getFullYear());
