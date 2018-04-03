	function checkPage(page,max){
		if(page==0){
			alert("已经是第一页！！！");
			return false;
		}else if(page>max){
			alert("已经是最后一页！！！");
			return false;
		}else{
			return true;
		}
	}