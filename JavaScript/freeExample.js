var str = prompt("메뉴 번호를 입력해주세요.\n1. TV보기 \n2. 넷플릭스보기 \n3. 유튜브보기");
while(1){
	if (str == 1){
	alert("TVTVTV꿀잼");
	break;
}else if(str == 2){
	window.location.href = 'http://www.netflix.com';
		break;
}else if(str == 3){
	window.location.href = 'http://www.youtube.com';
		break;
}else{
	alert("다시 입력하세요.");
		break;
}
}