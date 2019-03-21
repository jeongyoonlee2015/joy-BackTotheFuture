function f(){
	console.log(this); // 예약어
	//일반적인 함수를 호출할 때 해당 함수 내부에서 사용된 this는 전역객체에 바인딩
	console.log("f is called");
}

var o = {name: "object", method: f};

f();
o.method();