layui.use('laydate', function() {
	var laydate = layui.laydate;
	//开启公历节日
	laydate.render({
		elem: '#checkDate',
		calendar: true
	});
});