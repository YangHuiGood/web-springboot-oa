<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin user Examples</title>
<meta name="description" content="这是一个 user 页面">
<meta name="keywords" content="user">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png" href="assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="assets/css/amazeui.min.css" />
<link rel="stylesheet" href="assets/css/admin.css">
</head>
<body>
<<<<<<< HEAD
	<div class="am-cf admin-header">
		<!-- sidebar start -->
		<div class="admin-sidebar" >
			<ul class="am-list admin-sidebar-list">
				<li><a target="right" href="admin-index.jsp"><span
						class="am-icon-home"></span> 签到</a></li>
				<li class="admin-parent"><a class="am-cf"
					data-am-collapse="{target: '#collapse-nav'}"><span
						class="am-icon-file"></span> 任务管理 <span
						class="am-icon-angle-right am-fr am-margin-right"></span></a>
					<ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav">
						<li><a target="right" href="task-releaseform.jsp"
							class="am-cf"><span class="am-icon-pencil-square-o"></span>
								发布任务<span
								class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
						<li><a target="right" href="task-uncomplete.jsp"><span
								class="am-icon-table""></span> 待完成</a></li>
						<li><a target="right" href="task-unaccepted.jsp"><span
								class="am-icon-table"></span> 待接收</a></li>
						<li><a target="right" href="task-refused.jsp"><span
								class="am-icon-bug""></span> 已拒绝</a></li>
						<li><a target="right" href="task-completed.jsp"><span
								class="am-icon-check"></span> 已完成</a></li>
						<li><a target="right" href="task-released.jsp"><span
								class="am-icon-table"></span> 我发布的<span
								class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
					</ul></li>
				<li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
			</ul>
=======
<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar">
    <ul class="am-list admin-sidebar-list">
      <li><a target="right" href="admin-index.jsp"><span class="am-icon-home"></span> 签到</a></li>
      <!-- 任务管理 -->
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 任务管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav">
          <li><a target="right" href="task-releaseform.jsp" class="am-cf"><span class="am-icon-pencil-square-o"></span> 发布任务<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
          <li><a target="right" href="task-uncomplete.jsp"><span class="am-icon-table""></span> 待完成</a></li>
          <li><a target="right" href="task-unaccepted.jsp"><span class="am-icon-table"></span> 待接收</a></li>
          <li><a target="right" href="task-refused.jsp"><span class="am-icon-bug""></span> 已拒绝</a></li>
          <li><a target="right" href="task-completed.jsp"><span class="am-icon-check"></span> 已完成</a></li>
          <li><a target="right" href="task-released.jsp"><span class="am-icon-table"></span> 我发布的<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        </ul>
      </li>
      <!-- 权限管理 -->
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav1'}"><span class="am-icon-file"></span> 权限管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav1">
          <li><a target="right" href="popedom-table.jsp"><span class="am-icon-table""></span> 权限列表</a></li>
          <li><a target="right" href="popedom-add.jsp" class="am-cf"><span class="am-icon-pencil-square-o"></span> 添加权限<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
        </ul>
      </li>
      <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
    </ul>
>>>>>>> c54168282384aef4909a3ce2a492a8dab1936f64

			<div class="am-panel am-panel-default admin-sidebar-panel">
				<div class="am-panel-bd">
					<p>
						<span class="am-icon-bookmark"></span> 公告
					</p>
					<p>时光静好，与君语；细水流年，与君同。—— Amaze UI</p>
				</div>
			</div>

			<div class="am-panel am-panel-default admin-sidebar-panel">
				<div class="am-panel-bd">
					<p>
						<span class="am-icon-tag"></span> wiki
					</p>
					<p>Welcome to the Amaze UI wiki!</p>
				</div>
			</div>
		</div>
		<!-- sidebar end -->
	</div>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<!--<![endif]-->
	<script src="assets/js/app.js"></script>
</body>
</html>
