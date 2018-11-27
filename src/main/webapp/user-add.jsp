<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Amaze后台管理系统模板HTML表单页面 - cssmoban</title>
  <meta name="description" content="这是一个form页面">
  <meta name="keywords" content="form">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
  <link rel="stylesheet" href="assets/css/admin.css">
</head>
<body>
<!-- content start -->
<div class="admin-content">

  <div class="am-cf am-padding">
    <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">权限管理</strong> / <small>添加新用户</small></div>
  </div>

  <div class="am-tabs am-margin" data-am-tabs>
    <ul class="am-tabs-nav am-nav am-nav-tabs">
      <li class="am-active"><a href="#tab1">用户信息</a></li>
    </ul>
			<form action="#" method="post">
				<div class="am-tabs-bd">
					<div class="am-tab-panel am-fade am-in am-active" id="tab1">
						<div class="am-g am-margin-top">
							<div class="am-u-sm-2 am-text-right">新用户名称</div>
							<div class="am-u-sm-10">
								<input type="text" class="am-form-field am-input-sm"
									placeholder="请输入新用户名称">
							</div>
						</div>
						<div class="am-g am-margin-top">
							<div class="am-u-sm-2 am-text-right">新用户密码</div>
							<div class="am-u-sm-10">
								<input type="text" class="am-form-field am-input-sm"
									placeholder="请输入新用户密码">
							</div>
						</div>
						<div class="am-g am-margin-top">
							<div class="am-u-sm-2 am-text-right">角色名称</div>
							<div class="am-u-sm-10">
								<select>
									<option value="option1">boss</option>
									<option value="option2">组长</option>
									<option value="option3">成员</option>
								</select>
							</div>
						</div>
						<div class="am-g am-margin-top">
							<div class="am-u-sm-2 am-text-right">主管人</div>
							<div class="am-u-sm-10">
								<select>
								    <option value="">无</option>
									<option value="option1">张三</option>
									<option value="option2">李四</option>
									<option value="option3">王五</option>
								</select>
							</div>
						</div>

						<div class="am-margin">
							<input type="submit" class="am-btn am-btn-primary am-btn-xs"></input>
							<input type="reset" class="am-btn am-btn-primary am-btn-xs"></input>
						</div>
					</div>
			</form>

		</div>
    </div>
  </div>

  
<!-- content end -->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="assets/js/app.js"></script>
</body>
</html>
