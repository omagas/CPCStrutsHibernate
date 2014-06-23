<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<style>
		body, input{
			font-family: Calibri, Arial;
		}
		table#contact {
			border-collapse: collapse;
			width:550px;
		}
		th {
			height: 40px;
			background-color: #ffee55;
		}
	</style>
	<title>CPC Query</title>
</head>
<body>


<h1>Manager</h1>





<h2>Contacts</h2>
<table id="contact" border="1">
<tr>

	
	<th>Calc_Typ</th>
	<th>Calc_Desc</th>
	<th>Calc_Unit</th>
	<th>Eff_MK</th>

</tr>
<s:iterator value="calcRefTbList" var="calcRefTb">
	<tr>
		<td><s:property value="Calc_Typ"/></td>
		<td><s:property value="Calc_Desc"/></td>
		<td><s:property value="Calc_Unit"/></td>
		<td><s:property value="Eff_MK"/></td>

	</tr>	
</s:iterator>

</body>
</html>