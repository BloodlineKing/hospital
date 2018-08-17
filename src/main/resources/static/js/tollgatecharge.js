//通过体检编号查询用户信息
$(function () {
    $("#layui_btns").click(function () {
        var testNumber=$("input[name=testNumber]").val();
        //获取用户信息
        $.post("findTestNumberUserRegisterInfo.do",{"testNumber":testNumber},function (data) {

            var userRegisterInfo = JSON.parse(data);
            $("#userName").val(userRegisterInfo.userName);
            $("#age").val(userRegisterInfo.age);
            $("#sex").val(userRegisterInfo.sex);
            $("#born").val(userRegisterInfo.born);
        },"text");
    });

    $("#zong").click(function () {
        var testNumber=$("input[name=testNumber]").val();
        //获取用户信息
        $.post("showUserMedical.do",{"testNumber":testNumber},function (data) {
            var userRegisterInfo = JSON.parse(data);
            $("#zong").html(userRegisterInfo.zong);
        },"text");
    });
});

layui.use('laydate',function() {
    var laydate = layui.laydate;
    var layer = layui.layer;
    //开启公历节日
    laydate.render({
        elem: '#checkDate',
        calendar: true,
        page:false,
    });

});
