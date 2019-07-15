package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        if (isMAC(platform) && isIE(browser)) {
            return "IE on Mac?";
        }
        return "banner";
    }

    private boolean isMAC(String platform) {
        return platform.toUpperCase().contains("MAC");
    }

    private boolean isIE(String browser) {
        return browser.toUpperCase().contains("IE");
    }
}
