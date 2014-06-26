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

	
	<th>TourCustCnt</th>
	<th>TourCntyCd</th>
	<th>TourAreaCd</th>
	<th>HostPolicyNo</th>

</tr>
<s:iterator value="appGtlMTbList" var="appGtlMTb">
	<tr>
		<td><s:property value="TourCustCnt"/></td>
		<td><s:property value="TourCntyCd"/></td>
		<td><s:property value="TourAreaCd"/></td>
		<td><s:property value="HostPolicyNo"/></td>

	</tr>	
</s:iterator>

</body>
</html>