package java.strategy.demo;

public interface ShareApp {
    /**
     * 分享标题
     * @return
     */
    String showTitle();

    /**
     * 分享内容
     * @return
     */
    String showContent();

    /**
     * 分享图片地址
     * @param platform
     * @return
     */
    String showImageUrl(final String platform);

    /**
     * 分享App下载链接
     * @param platform
     * @param userToken
     * @return
     */
    String getShareLink(final String platform, final String userToken);
}
