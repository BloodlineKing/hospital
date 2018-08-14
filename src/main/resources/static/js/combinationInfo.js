layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});

layui.use('form', function(){
  var form = layui.form;
  
  //监听提交
  form.on('submit(formDemo)', function(data){
    layer.msg(JSON.stringify(data.field));
    return false;
  });
});

layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#info'
    ,url:'/demo/table/user/'
    ,cellMinWidth: 200 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
    ,cols: [[
      {field:'name', width:300, title: '体检项目'}
      ,{type:'checkbox',title:'好'}
      ,{field:'sex', width:300, title: '性别'}
     
    ]]
  });
});