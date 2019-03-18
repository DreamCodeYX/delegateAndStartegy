package java.strategy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 分享策略
 */
public class ShareStrategy {
    //微信分享
    public static final String WECHAR_SHARE = "WecharShare";
    //QQ分享
    public static final String QQECHAR_SHARE = "QQShare";
    //默认分享方式
    public static final String DEFAULT_SHARE = WECHAR_SHARE;

    private  static Map<String,ShareApp> map  =  new HashMap<>();
    static{
        map.put(WECHAR_SHARE,new WechatShare());
        map.put(QQECHAR_SHARE,new QQShare());
    }
    public static  ShareApp get(String shareAppKey){
        if(!map.containsKey(shareAppKey)){
            return map.get(DEFAULT_SHARE);
        }
        return map.get(shareAppKey);
    }
}
