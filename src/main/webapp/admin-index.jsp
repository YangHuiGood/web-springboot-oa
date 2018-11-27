<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<link rel="icon"
	href="https://static.jianshukeji.com/highcharts/images/favicon.ico">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
/* css 代码  */
</style>
<script src="https://img.hcharts.cn/highcharts/highcharts.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/exporting.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/data.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/series-label.js"></script>
<script src="https://img.hcharts.cn/highcharts/modules/oldie.js"></script>
<script src="https://img.hcharts.cn/highcharts-plugins/highcharts-zh_CN.js"></script>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/face.js"></script>
<script src="assets/js/face2.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
<script src="assets/js/jquery.webcam.min.js"></script>
<script src="assets/js/bootstrap.js"></script>
<link rel="stylesheet" href="assets/css/amazeui.min.css" />
<link rel="stylesheet" href="assets/css/admin.css">
<link rel="stylesheet" href="assets/css/bootstrap.css">
<script src="/assets/js/tu.js"></script>
<style type="text/css">
#photos {
	width: 320px;
	height: 240px;
	float: right;
}

#webcam {
	width: 320px;
	height: 240px;
	float: right;
}
</style>

</head>
<body>
	<div id="container" style="min-width: 200px; height: 650px"></div>
	<div class="message"></div>
	<div  align="center">
		<!-- 按钮触发模态框 -->
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#myModal">人脸注册</button>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" style="width: 1200px; height: 500px">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>

						<div class="am-cf am-padding">
							<div class="am-fl am-cf">
								<h4 class="modal-title" id="myModalLabel">
									<strong class="am-text-primary am-text-lg">人脸注册</strong> / <small>Face
										information</small>
								</h4>
							</div>
						</div>

					</div>
					<!-- content start -->
					<div class="admin-content" align="left">
						<div style="float: right; margin-right: 50px; margin-top: 20px">
							<div align="center" style="float: right;">
								<div id="webcam"></div>

								<div id="photos">
									<img src="" id="img">
								</div>
								<br> <input type="button" value="删除" class="btn btn-danger"
									id="delBtn" onclick="delPhoto();" style="margin-top: 10px" />
								<input type="button" value="拍照" class="btn btn-info"
									id="saveBtn" onclick="savePhoto();" style="margin-top: 10px" />
							</div>
						</div>

						<div style="float: left; margin-left: 50px">
							<form class="am-form am-form-horizontal">
								<div class="am-form-group" style="width: 300px">
									<label for="user-name" class="am-form-label">姓名/Name</label>
									<div>
										<input type="password" id="user-name" placeholder="姓名 / Name"
											width="10px"> <small>输入你的名字，让我们记住你。</small>
									</div>
								</div>

								<div class="am-form-group" style="width: 300px">
									<label for="user-email" class="am-form-label">电子邮件/Email</label>
									<div>
										<input type="email" id="user-email"
											placeholder="输入你的电子邮件 / Email"> <small>邮箱你懂得...</small>
									</div>
								</div>
								<div class="am-form-group" style="width: 300px">
									<label for="user-phone" class="am-form-label">电话/Telephone</label>
									<div>
										<input type="email" id="user-phone"
											placeholder="输入你的电话号码 / Telephone">
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- content end -->
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary">提交注册</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

		<!-- 按钮触发模态框 -->
		<button class="btn btn-primary btn-lg" data-toggle="modal"
			data-target="#myModal2">人脸签到</button>
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal2" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" style="width: 600px; height: 500px">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>

						<div class="am-cf am-padding">
							<div class="am-fl am-cf">
								<h4 class="modal-title" id="myModalLabel">
									<strong class="am-text-primary am-text-lg">人脸签到</strong> / <small>Face
										Sign</small>
								</h4>
							</div>
						</div>

					</div>
					<!-- content start -->
					<div class="admin-content">
						<div style="margin-top: 20px">
							<div align="center" style="float: center;">
								<div id="webcam2"></div>

								<div id="photos2">
									<img src="" id="img2">
								</div>
								<input type="button" value="拍照签到" class="btn btn-info  btn-primary btn-lg"
									id="saveBtn" onclick="savePhoto2();" style="margin-bottom: 15px" />
							</div>
						</div>

					</div>
					<!-- content end -->

				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>