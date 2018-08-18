//通过体检编号查询用户信息
$(function () {

    /*显示信息并且计算价格*/
    $("#layui_btns").click(function () {
        var testNumber=$("input[name=testNumber]").val();
        //获取用户信息
        /*查询所有公司名称*/
        $.ajax({
            url: "http://localhost:8080/findTestNumberUserRegisterInfo.do",
            data: {"testNumber":testNumber},
            dataType: "text",
            success: function (data) {
                var userRegisterInfo = JSON.parse(data);
                $("#userName").val(userRegisterInfo.userName);
                $("#age").val(userRegisterInfo.age);
                $("#sex").val(userRegisterInfo.sex);
                $("#born").val(userRegisterInfo.born);
                ceil();
            }
        });


    });

    /*根据总价格计算找零*/
    $("#price").blur(function () {
        //获取实际金额
        var price = $("#price").val();
        //获取总价格
        var zong = $("#zong").html();
        if(price<zong){
            alert("金额不足,请重新填写");
            $("#zhao").val("");
        }
        if(price>zong){
            var ceilPrice = price - zong;
            $("#zhao").val(ceilPrice);
        }


    });

    /*计算价格进行提交信息 提交到收费明细*/
    $("#isOk").click(function () {
        
    });
});



layui.use('laydate',function() {
    var laydate = layui.laydate;
    var layer = layui.layer;
    //开启公历节日
    laydate.render({
        elem: '#checkDate',
        calendar: true,
        page:false
    });

});

function ceil(){
    //获取价格
    $.ajax({
        url: "http://localhost:8080/ceilPrice.do",
        data: {},
        dataType: "text",
        async:false,
        success: function (data) {
            var userRegisterInfo = JSON.parse(data);
            $("#zong").html(data);
        }
    });
}
