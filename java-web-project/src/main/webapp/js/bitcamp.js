var Bitcamp = {};

Bitcamp.ajax = function(url,settings) {
	
	if(settings ==undefined || settings=null){
		settings={};
	}
	
	// => settings 객체에 method가 정의되지 않았다면 기본값 'get'으로 설정한다.
	
	if(!settings.method){
		
		settings.method='GET';
	}
	
	//서버가 보낸 데이터의 형식을 알려주지 않으면 기본으로 일반 텍스트로 설정한다.
	if(!settings.dataType){
		settings.dataType = 'text';
	}
	
	var xhr = new XMLHttpRequest()
	  xhr.onreadystatechange = function() {
	    if (xhr.readyState != 4)
	    	return;
	    
	    if(xhr.staus !=200){
	    	
// 서버에서 오류가 발생했다면 error()함수를 호출한다.
	    	// 단 error라는 이름의 함수가 있을 때만 호출한다.
	    	if(settings.error){
	    		settings.error();
	    		
	    	}
	    	return;
	    }
	    	
	    
	    //서버로부터 정상적으로 응답을 받았다면 success 함수를 호출한다.
	    if(setting.success){
	    	if(settings.dataType =='json'){
	    		settings.success(JSON.parse(xhr.responseText));
	    	}else{
	    		settings.success(xhr.responseText);
	    	}
	    }
	  };
	  xhr.open(settings.method,url,true)
	  xhr.send()
};

Bitcamp.getJSON= function (url,success){
	Bitcamp.ajax(url,{
		"dataType": 'json',
		"success": success
	});
	
};

var $ = Bitcamp;



