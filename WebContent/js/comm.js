/**
 * author Louie
 */



$(document).ready(function () {
	var mode="P"
	$( "button.btn" ).click(function() {
		  //$( this ).slideUp();
		
		if(mode=="dev"){alert($(this).parent().next().children().val());}//TEST
		var self=$(this).parent();
		var policyno=$(this).parent().next().children().val();
		//$( this ).nextAll("td").slideUp();
		//$(this).before().slideUp();
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "ajaxSubmit.action",
            async: true,
            data: {
                "policyno"  : policyno,
            },            
            success: function(result){
                // we have the response
                if (result.success) {
                	if(mode=="dev"){
                	alert("success:"+result.result); 	
                	var arr =self.parent();//TEST
                	console.log(arr.html());
                	}
                	self.parent().slideUp();
                	
                } else {
                    alert("not success:"+result.message);
                }


            },
            error: function(result){
                alert('Error: ' + result.message);
            }
        });
		
		
		//´ú¸Õ¥Î
		//var arr = $(this).parent().next().children();
		//document.write(arr.html());
	});
	
});




