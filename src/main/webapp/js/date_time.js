function getNow(){
	var date=new Date();
	var year=date.getFullYear();
	var month=date.getMonth()+1;
	var day=date.getDate();
	var hour=date.getHours();
	var minute=date.getMinutes();
	var second=date.getSeconds();
	var result=year+"年"+month+"月"+day+"日     "+hour+"点"+minute+"分"+second+"秒";
	document.getElementById("timeSpan").innerHTML=result;
}
window.setInterval("getNow()",1000);