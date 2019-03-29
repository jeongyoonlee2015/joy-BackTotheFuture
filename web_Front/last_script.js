var req = new XMLHttpRequest();
req.open("GET", "./image_list.json");
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