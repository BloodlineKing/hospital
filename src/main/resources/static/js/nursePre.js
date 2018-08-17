function search() {

    var nameCode=document.getElementById("namecode").value;

    layui.use(['table', 'layer'], function () {
        var table = layui.table;
        var layer = layui.layer;
        var $ = layui.jquery;
        table.render({
            id: "info"// 设定表格的唯一ID进行标识
            , elem: '#userInfo'// 绑定table对应的元素
            , height: 'full-300'
            , url: '/getUserInfoByNameCode' // TODO: 此处写你实际数据来源
            , size: 'sm'
            , where:{namecode:nameCode}
            , page: false
            , cols:[
                [
                    {field:"testNumber",title:"体检编号"},
                    {field:"userName",title:"姓名"},
                    {field:"age",title:"年龄"},
                    {field:"born",title:"出生日期"},
                    {field:"sex",title:"性别"},
                    {field:"idCard",title:"身份证"},
                    {field:"maritalStatus",title:"婚否"},
                    {field:"telephone",title:"电话"},
                    {field:"address",title:"地址"},
                    {field:"nameCode",title:"拼音简码"},
					{field:"workNumber",title:"工作编号"},
					{field:"personType",title:"人员类别"},
					{field:"status",title:"类型"},
					{field:"belongtoUnits",title:"所属单位"}
                ]
            ]
            , done: function (res, curr, count) {// 表格渲染完成之后的回调
                LayUIDataTable.SetJqueryObj($);// 第一步：设置jQuery对象
                var currentRowDataList = LayUIDataTable.ParseDataTable(function (index, currentData, rowData) {
                    console.log(JSON.stringify(rowData));
                    localStorage.info=JSON.stringify(rowData);
                })
            }// end done
        });//end table.render
    });// end layui use
}