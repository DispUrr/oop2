package ru.netology.domain;

public class ShareInfo {
    private int shareCount;
    boolean canShare;
    boolean isShared;
    private String shareImageURL;

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean shared) {
        isShared = shared;
    }

    public String getShareImageURL() {
        return shareImageURL;
    }

    public void setShareImageURL(String shareImageURL) {
        this.shareImageURL = shareImageURL;
    }
}
