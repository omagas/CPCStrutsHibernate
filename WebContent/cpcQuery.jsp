<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
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
		body {
		  padding-top: 50px;
		}
		.starter-template {
		  padding: 40px 15px;
		  text-align: center;
		}
	</style>
	<title>CPC Query</title>
</head>
<body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>

        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#"><span class="glyphicon glyphicon-share-alt">  Home  </span></a></li>

          </ul>
        </div><!--/.nav-collapse -->
      </div>
</div>
<div class="container">

      <div class="starter-template">
        <h1>蘇黎世產物保險</h1>
        <p class="lead">CPC 查詢保單收據列印功能</p>
      </div>
<table class="table table-striped">
<tr>	
	<th>HostPolicyNo</th>
	<th>Data_id</th>
	<th>Data_id_Ver_No</th>
	<th>Email_Pcy_MK</th>
	<th>Email_Recpt_Mk</th>
	<th>Agnt_CD</th>
	<th>Issue_Brh_Cd</th>
	<th>Cust_ID</th>
	<th>Cust_Email</th>	
	<th></th>
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
		<td><s:property value="custid"/></td>
		<td><s:property value="custemail"/></td>
		<td><button type="button" class="btn btn-primary">已寄出</button></td>
	</tr>
		
</s:iterator>
</table>
</div>        




</body>
</html>

