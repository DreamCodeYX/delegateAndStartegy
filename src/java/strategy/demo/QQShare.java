package java.strategy.demo;

public class QQShare implements ShareApp {
    @Override
    public String showTitle() {
        return "QQ分享标题";
    }

    @Override
    public String showContent() {
        return "QQ分享内容";
    }

    @Override
    public String showImageUrl(String platform) {
        return "QQ分享图片";
    }

    @Override
    public String getShareLink(String platform, String userToken) {
        return "QQ分享链接地址";
    }
}
