function errFunc(){
	throw "error";
	console.log("this code will not be excuted");
}
function func(){


	try{
		console.log("try - 1");
		errFunc();
		console.log("try - 2");
	}
	catch(e){//catch가 없으면 가장 바깥 catch 까지 나감
		console.log("catch error in function : ", e);
	}
	finally{
		console.log("finally in function- this code will always be executed");	
	}
}
try{
	console.log("try - 1");
	func();
	console.log("try - 2");
}
catch(e){
	console.log("catch error : ", e);
}
finally{
	console.log("finally - this code will always be executed");	
}