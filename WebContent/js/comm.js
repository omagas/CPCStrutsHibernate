/**
 * 
 */



$(document).ready(function () {
	$( "button" ).click(function() {
		  //$( this ).slideUp();
		alert($(this).parent().next().children().val());
		var policyno=$(this).parent().next().children().val();
		//$( this ).nextAll("td").slideUp();
		//$(this).before().slideUp();
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "ajaxSubmit.action",
            //contentType: 'application/json',
            async: true,
            //data: "policyno=" + policyno,
            data: {
                "policyno"  : policyno,
            },            
            success: function(result){
                // we have the response
                if (result.success) {
                	alert("01"+result.message);
                } else {
                    alert("02"+result.message);
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




