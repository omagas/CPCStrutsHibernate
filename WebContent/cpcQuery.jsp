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
			background-color: #ddd;
		}
		body {
		  padding-top: 50px;
		}
		.header {
			text-align: center;
			font-weight:bold;
			color: #fff;
			background: #18bc9c;
		}
		.starter-template {
		  padding: 40px 15px;
		  text-align: center;
		}
		  td {
		    /*background-color: yellow;*/
		    text-align: center;
		}
		h1{
			font-weight: bold;
		}
	</style>
	<title>CPC Query</title>

</head>
<body>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript" language="JavaScript" src="<s:url value="/js/comm.js"/>"></script>

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
            <li class="active"><a href="query"><span class="glyphicon glyphicon-share-alt">  Home  </span></a></li>

          </ul>
        </div><!--/.nav-collapse -->
      </div>
</div>
<div class="header">
      <div class="starter-template">
      	<!--  img class="img-responsive" src="img/logo.png" alt="">-->
        <h1>蘇黎世產物保險</h1>
        <p class="lead">CPC 查詢保單收據列印功能</p>
      </div>
</div>
<div class="container">

<s:if test="%{appGtlMTbList.size()!=0}">
	<table class="table table-hover">
	<tr>	
		<th>保單序號</th>
		<th>SDS資料序號</th>
		<th>SDS資料版號</th>
		<th>需Email的保單</th>
		<th>需Email的收據</th>
		<th>經手人代號</th>
		<th>出單單位</th>
		<th>被保險人ID</th>
		<th>被保險人Email</th>	
		<th></th>
		<th></th>
	</tr>
	<s:iterator value="appGtlMTbList" var="appGtlMTb">
		<form action="#" method="post">
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
				<td><button  type="button" class="btn btn-primary">寄出</button></td>
				<!--  td><a class="linkDelete" >update</a></td-->
				
				<td><s:hidden id="hostPolicy" name="hostPolicyNo"/></td>
				
			</tr>
		</from>	   
	</s:iterator>
	</table>
</s:if>	
<s:else>
	<div class="alert alert-info" role="alert">查無相符資料，目前無保單收據需列印</div>
	<!-- div id="info2" style="color: green;">無相符資料</div> --> 
</s:else>	
 

</div>        




</body>
</html>

