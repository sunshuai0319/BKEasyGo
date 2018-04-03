            $(function(){
            	var b1=false;
        		$("[name='userName']").blur(function(){
	        		var value=$(this).val();
	        		alert(value);
	        		var data={"userName":value,"type":"Saler"};
	        		$.ajax({
	        		 url:"ajaxServlet?r="+Math.random(),
	        		 data:data,
	        		 datatype:"text",
	        		 type:"post",
	        		 async:false,
	        		 success:function(data){
	        		 	if(data=='error'){
	        		 		$("#resultuserName").html("√");
	        		 		b1=true;
	        		 	}else{
	        		 		$("#resultuserName").html("你输入的用户名不存在");
	        		 		$("#resultuserName").css("fontSize","12px");
	        		 		b1=false;
	        		 	}
	        		 },error:function(data,status){
	        		 	alert(status);
	        		 }
	        		
	        		});
	        	});
        		var b2=false;
        		$("[name='realName']").blur(function(){
	        		var value=$(this).val();
	        		var data={"name":value,"type":"Saler"};
	        		$.ajax({
	        		 url:"ajaxServlet",
	        		 data:data,
	        		 datatype:"text",
	        		 type:"post",
	        		 async:false,
	        		 success:function(data){
	        		 	if(data=='error'){
	        		 		$("#resultrealName").html("√");
	        		 		b2=true;
	        		 	}else{
	        		 		$("#resultrealName").html("你输入的用户名不存在");
	        		 		$("#resultrealName").css("fontSize","12px");
	        		 		b2=false;
	        		 	}
	        		 },error:function(data,status){
	        		 	alert(status);
	        		 }
	        		
	        		});
	        	});
        		var b3=false;
        		$("[name='email']").blur(function(){
	        		var value=$(this).val();
	        		var data={"email":value,"type":"Saler"};
	        		$.ajax({
	        		 url:"ajaxServlet",
	        		 data:data,
	        		 datatype:"text",
	        		 type:"post",
	        		 async:false,
	        		 success:function(data){
	        		 	if(data=='error'){
	        		 		$("#resultemail").html("√");
	        		 		b3=true;
	        		 	}else{
	        		 		$("#resultemail").html("你输入的用户名不存在");
	        		 		$("#resultemail").css("fontSize","12px");
	        		 		b3=false;
	        		 	}
	        		 },error:function(data,status){
	        		 	alert(status);
	        		 }
	        		
	        		});
	        	});
        		var b4=false;
        		$("[name='oldPwd']").blur(function(){
	        		var value=$(this).val();
	        		var data={"pwd":value,"type":"Saler"};
	        		$.ajax({
	        		 url:"ajaxServlet",
	        		 data:data,
	        		 datatype:"text",
	        		 type:"post",
	        		 async:false,
	        		 success:function(data){
	        		 	if(data=='error'){
	        		 		$("#resultoldPwd").html("√");
	        		 		b4=true;
	        		 	}else{
	        		 		$("#resultoldPwd").html("你输入的用户名不存在");
	        		 		$("#resultoldPwd").css("fontSize","12px");
	        		 		b4=false;
	        		 	}
	        		 },error:function(data,status){
	        		 	alert(status);
	        		 }
	        		
	        		});
	        	});
        		$("#submit").click(function(){
        			
        			return b1&&b2&&b3&&b4;
        		});
        		$("#submint1").click(function(){
        			return b1&&b2&&b3;
        		});
        	
        });