/**
 * Created by dxd on 2017/6/18.
 * 运用于音乐系统前端主页
 */
jQuery().ready(
    function () {
        $(".l_f_show .content .original .s").each(function () {
            $(this).mouseenter(function () {
                $(".l_f_show .content .original .s.on").removeClass("on");
                $(this).addClass("on");
            })
        });
        $(".l_f_show .content .repeat .s").each(function () {
            $(this).mouseenter(function () {
                $(".l_f_show .content .repeat .s.on").removeClass("on");
                $(this).addClass("on");
            })
         $(".musicShow .l_s_show .item").each(function () {
             $(this).mouseenter(function () {
                 $(this).children(".logo").css("display","none");
                 $(this).children(".cover").css("display","block");
             });
             $(this).mouseleave(function () {
                 $(this).children(".logo").css("display","block");
                 $(this).children(".cover").css("display","none");
             })
         })
         $(".content .items .item").each(function () {
             $(this).mouseenter(function () {
                 $(this).children(".cover").css("display","block");
             })
             $(this).mouseleave(function () {
                 $(this).children(".cover").css("display","none");
             })
         })

    });

});