package ru.netology.domain;

public class Post {

    private int textField;
    private int pageId;
    private int ownerId;
    private int fromId;
    private int signerId;
    private int postponedId;
    private int createdBy;
    private int likeButtonCount;
    private int viewsCount;
    private int date;
    private String logoUrl;
    private String publicName;
    private String postType;
    private String postSource;
    private boolean favoriteButton;
    private boolean isPinned;
    private boolean isPostponed;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canPin;
    private LikesInfo likesInfo;
    private ShareInfo shareInfo;
    private CommentsInfo commentsInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;
    private MoreInfo moreInfo;
    private CopyrightInfo copyrightInfo;

    // +getters/setters
}
