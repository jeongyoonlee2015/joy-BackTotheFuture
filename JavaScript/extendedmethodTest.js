function f(){
	console.log(this);
	console.log("f is called");
}

function setName(name){
	this.name = name;
}

var o = {name: "", method:f, setName:setName};
var o2 = {name:"", setName:setName};
o.setName("object1");
o2.setName("object2");

console.log(o, o2);

//method를 호출 할 때 this의 값은 인스턴스화 된 객체를 참조한다.