/**
 * 
 */
$(document).ready(function () {
	$( "button" ).click(function() {
		  //$( this ).slideUp();
		alert($("#hostPolicy").val());
		//$( this ).nextAll("td").slideUp();
		//$(this).before().slideUp();
		
		var arr = $(this).parent().parent().has( "input" );
		document.write(arr.html());
	});
	
});




