package java.strategy.demo;

public class WechatShare implements ShareApp {
    @Override
    public String showTitle() {
        return "微信分享标题";
    }

    @Override
    public String showContent() {
        return "微信分享内容";
    }

    @Override
    public String showImageUrl(String platform) {
        return "微信分享图片";
    }

    @Override
    public String getShareLink(String platform, String userToken) {
        return "微信分享链接地址";
    }
}
