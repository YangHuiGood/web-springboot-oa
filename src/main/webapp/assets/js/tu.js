var chart = null;
// 获取 CSV 数据并初始化图表
//$.getJSON('https://data.jianshukeji.com/jsonp?filename=csv/analytics.csv&callback=?', function (csv) {
$.getJSON('/face/weekData', function (csv) {

	chart = Highcharts.chart('container', {
		data: {
			csv: csv
		},
		title: {
			text: '签到记录'
		},
		subtitle: {
			text: '数据来源: 每日签到'
		},
		xAxis: {
			title: {
				text:'签到日期'
			},
			tickInterval:24 * 3600 * 1000, // 坐标轴刻度间隔为一星期
			tickWidth: 1,
			gridLineWidth: 1,
			labels: {
				align: 'left',
				x: -8,
				y: -3
			},
			// 时间格式化字符
			// 默认会根据当前的刻度间隔取对应的值，即当刻度间隔为一周时，取 week 值
			dateTimeLabelFormats: {
				week: '%Y-%m-%d'
			}
		},
		yAxis: { // 放置在左边（默认在坐标）
			title: {
				text:'签到时间'
			},
			labels: {
				align: 'left',
				x: -5,
				y: 8,
				format: '{value:.,0f}'
			},
			showFirstLabel: false
		},
		legend: {
			align: 'left',
			verticalAlign: 'top',
			y: 10,
			floating: true,
			borderWidth: 0
		},
		tooltip: {
			shared: true,
			crosshairs: true,
			// 时间格式化字符
			// 默认会根据当前的数据点间隔取对应的值
			// 当前图表中数据点间隔为 1天，所以配置 day 值即可
			dateTimeLabelFormats: {
				day: '%Y-%m-%d'
			}
		},
		plotOptions: {
			series: {
				cursor: 'pointer',
				point: {
					events: {
						// 数据点点击事件
						// 其中 e 变量为事件对象，this 为当前数据点对象
						click: function (e) {
							$('.message').html(' 签到时间：' +Highcharts.dateFormat('%Y-%m-%d', this.x)+' '+this.y );
						}
					}
				},
				marker: {
					lineWidth: 1
				}
			}
		}
	});
});
