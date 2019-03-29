var req = new XMLHttpRequest();
req.open("GET", "./last_image_list.json");
req.onreadystatechange = function(){
	if(this.readyState == 4){
		//console.log(this.response); 
		//- 웹 보안 설정된 상태에서 해야 함!
		var data = JSON.parse(this.response);
		for(var i = 0; i < data.length; i++){
			var div = document.createElement("div");
			div.setAttribute("class", "image");
			div.onclick = function(){
				//비효율적인 코드임
				/*if(this.getAttribute("class").indexOf("image-selected") == -1){
					this.setAttribute("class", "image-selected");
				}
				else{
					this.setAttribute("class", "image");
				}*/
				this.classList.toggle("image-selected");//this=onclick
				
			}
			div.onmouseover = function(){
				//this=divElement

				var element = this;
				//이렇게 해주면 해결
				this.timerId = setTimeout(function(){
					//timerId를 this로 준다.
					//this=해당 엘리먼트가 아님, 따라서 함수의 scope를 생각해야함

					classList.add("image-magnified");
				}, 1000);
			}
			div.onmouseout = function(){
				clearTimeout(this.timerId);
				this.classList.remove("image-magnified");
			}
			var img = document.createElement("img");
			img.src = data[i];
			div.appendChild(img);
			document.body.appendChild(div);
		}
	}
}
req.send();

function selectAll(btn){
	var images = document.getElementsByClassName("image");
	for(var i = 0; images.length; i++){
		if(btn.value == "Unselect All"){
			images[i].classList.remove("image-selected");
		}else{
			images[i].classList.add("image-selected");
		}
	}
	if(btn.value == "Unselect All"){
		btn.value = "select All"
	}else{
		btn.value = "Unselect All"
	}
}

function slideShow(btn){
	var images = document.getElementsByClassName("image");
	var index = 0;
	images[0].classList.add("image-magnified");
	
	var intervalId = setInterval(function(){
		images[index].classList.remove("image-magnified");
		index++;
		if (index < images.length) {
			images[index].classList.add("image-magnified");	
		}
		else{
			clearInterval(intervalId);
		}
	}, 1000);
}
