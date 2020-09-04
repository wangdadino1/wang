
var index={};
layui.use(['element','jquery','flow','layer'],function () {
    var $ = layui.jquery
        ,element = layui.element//Tab的切换功能，切换事件监听等，需要依赖element模块
        ,flow = layui.flow
        ,layer = layui.layer;
    //按屏加载图片
    flow.lazyimg({
        elem: '#LAY_demo3 img'
        ,scrollElem: '#LAY_demo3' //一般不用设置，此处只是演示需要。
    });
    index.boFang = function(url) {
        var key1="https://cdn.yangju.vip/k/?url=";
        var key2="http://api.yueliangjx.com/?url=";
        var key3="https://jx.km58.top/jx/?url=";
        var key4="https://api.smq1.com/?url=";
        window.open(key2+url);
    }
})