//form表单提交事件
layui.use('form', function() {
	var form = layui.form;
	//监听提交
	form.on('submit(formDemo)', function(data) {
		layer.msg(JSON.stringify(data.field));
		return false;
	});
});
layui.use('laydate', function() {
	var laydate = layui.laydate;
	//开启公历节日
	laydate.render({
		elem: '#born',
		calendar: true
	});
});