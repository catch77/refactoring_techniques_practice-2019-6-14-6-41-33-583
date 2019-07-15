package com.tws.refactoring.extract_variable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    private static BannerRender bannerRender;

    @Before
    public void init() {
        bannerRender = new BannerRender();
    }

    @Test
    public void should_return_true_given_MAC_and_IE() {
        assertEquals("IE on Mac?", bannerRender.renderBanner("mac", "ie"));
    }

    @Test
    public void should_return_false_given_MAC_and_IE() {
        assertEquals("banner", bannerRender.renderBanner("windows", "cho"));
    }
}