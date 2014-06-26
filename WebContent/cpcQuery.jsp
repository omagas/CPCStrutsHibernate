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

<h1>蘇黎世產險</h1>
<h2>CPC 查詢保單收據列印功能</h2>
<table id="contact" border="1">
<tr>

	
	<th>HostPolicyNo</th>
	<th>Data_id</th>
	<th>Data_id_Ver_No</th>
	<th>Email_Pcy_MK</th>
	<th>Email_Recpt_Mk</th>
	<th>Agnt_CD</th>
	<th>Issue_Brh_Cd</th>
</tr>
<s:iterator value="appGtlMTbList" var="appGtlMTb">
	<tr>
		<td><s:property value="hostPolicyNo"/></td>
		<td><s:property value="dataid"/></td>
		<td><s:property value="dataidverno"/></td>
		<td><s:property value="emailPcyMk"/></td>
		<td><s:property value="emailRecptMk"/></td>
		<td><s:property value="agentCd"/></td>
		<td><s:property value="issueBrhCd"/></td>
	</tr>
		
</s:iterator>
</table>

</body>
</html>

