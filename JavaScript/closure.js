function makeCounterFunction(initVal){
	var count = initVal;
	function Increase(){  
		count++;
		console.log(count);
	}
	return Increase; // 함수를 반환하는 함수

}

//함수 두 번 호출, 변수에 icrease함수가 저장되도록

var counter1 = makeCounterFunction(0);
var counter2 = makeCounterFunction(10);

//함수 호출
counter1();
counter2();