package java.strategy.demo;

public class Share {
    private String  showTitle;
    private String  showContent;
    private String  showImageUrl;
    private String  getShareLink;
    public void shareMsg(){
        System.out.println(ShareStrategy.get("DEFAULT_SHARE").showTitle());
    }
    public void shareMsg(String shareKey){
        System.out.println(ShareStrategy.get(shareKey).showTitle());
    }
}
