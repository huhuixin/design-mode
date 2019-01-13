package com.hhx.design.pattern.observer;

/**
 * 观察者模式
 *
 * @author hhx
 */
public class Main {

    public static void main(String[] args) {

        //注册了三个用户，ZhangSan、LiSi、WangWu。公众号发布了一条消息"PHP是世界上最好用的语言！"，订阅用户都收到了消息。
        //用户ZhangSan看到消息后颇为震惊，果断取消订阅，这时公众号又推送了一条消息，此时用户ZhangSan已经收不到消息，其他用户
        //还是正常能收到推送消息。
        User zs = new User("zhangsan");
        User ls = new User("lisi");
        User ww = new User("wangwu");

        WechatMessage wechatMessage = new WechatMessage();
        wechatMessage.registerObserver(zs);
        wechatMessage.registerObserver(ls);
        wechatMessage.setInfo("PHP是最好的语言");
        //微信公众号发布文章： PHP是最好的语言
        //zhangsan 收到推送消息： PHP是最好的语言
        //lisi 收到推送消息： PHP是最好的语言
        wechatMessage.removeObserver(ls);
        wechatMessage.registerObserver(ww);
        wechatMessage.setInfo("Java是最好的语言");
        //微信公众号发布文章： Java是最好的语言
        //zhangsan 收到推送消息： Java是最好的语言
        //wangwu 收到推送消息： Java是最好的语言
    }
}
