//practice
var empty_obj = {}; // Create empty object
typeof(empty_obj); // -> object
var man = {name: "홍길동", age: 20, height: 180};
man.name // <- 길동이
man["name"] // -> 길동이
man.name = "몽룡쓰"; // -> 몽룡쓰
man["age"] = 18; // -> 18
man // -> Object{name: "몽룡쓰", age: 18, height: 180}