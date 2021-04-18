package ru.netology.domain;

public class CommentsInfo {
    private int commentsCount;
    boolean canComment;
    boolean canReply;
    boolean canDeleteComment;
    boolean canAttachFile;
    boolean canAttachImage;
    boolean canCloseCommentsCreate;
    boolean canOpenCommentsCreate;

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }

    public boolean isCanDeleteComment() {
        return canDeleteComment;
    }

    public void setCanDeleteComment(boolean canDeleteComment) {
        this.canDeleteComment = canDeleteComment;
    }

    public boolean isCanAttachFile() {
        return canAttachFile;
    }

    public void setCanAttachFile(boolean canAttachFile) {
        this.canAttachFile = canAttachFile;
    }

    public boolean isCanAttachImage() {
        return canAttachImage;
    }

    public void setCanAttachImage(boolean canAttachImage) {
        this.canAttachImage = canAttachImage;
    }

    public boolean isCanCloseCommentsCreate() {
        return canCloseCommentsCreate;
    }

    public void setCanCloseCommentsCreate(boolean canCloseCommentsCreate) {
        this.canCloseCommentsCreate = canCloseCommentsCreate;
    }

    public boolean isCanOpenCommentsCreate() {
        return canOpenCommentsCreate;
    }

    public void setCanOpenCommentsCreate(boolean canOpenCommentsCreate) {
        this.canOpenCommentsCreate = canOpenCommentsCreate;
    }
}
