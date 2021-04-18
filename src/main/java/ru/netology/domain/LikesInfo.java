package ru.netology.domain;

public class LikesInfo {
    private int likesCount;
    boolean canLike;
    boolean canRemoveLike;
    boolean isLiked;
    private String likesImageURL;
    private boolean canSeeWhoLiked;

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanRemoveLike() {
        return canRemoveLike;
    }

    public void setCanRemoveLike(boolean canRemoveLike) {
        this.canRemoveLike = canRemoveLike;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getLikesImageURL() {
        return likesImageURL;
    }

    public void setLikesImageURL(String likesImageURL) {
        this.likesImageURL = likesImageURL;
    }

    public boolean isCanSeeWhoLiked() {
        return canSeeWhoLiked;
    }

    public void setCanSeeWhoLiked(boolean canSeeWhoLiked) {
        this.canSeeWhoLiked = canSeeWhoLiked;
    }
}
