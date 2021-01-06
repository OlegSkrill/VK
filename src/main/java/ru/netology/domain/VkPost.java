package ru.netology.domain;

public class VkPost {

    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private boolean friendsOnly;
    private String copyright;
    private int countReposts;
    private boolean userReposted;
    private int countViews;
    private String countViewsImageUrl;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private String postponedId;


    private String postUrl;
    private int postId;
    private String dataPost;
    private boolean buttonSendPost;
    private String buttonSendPostImageUrl;
    private boolean buttonComplainOrSave;
    private String buttonComplainOrSaveImageUrl;
    private boolean buttonComplain;
    private String buttonComplainImageUrl;
    private boolean buttonSave;
    private String buttonSaveImageUrl;

//    + get/set на все поля


    private PostCommentsBlock postCommentsBlock;
    private PostGeoBlock postGeoBlock;
    private PostImageBlock postImageBlock;
    private PostLikesBlock postLikesBlock;
    private PostRepostsBlock postRepostsBlock;
    private PostSourceBlock postSourceBlock;
    private PostTextBlock postTextBlock;
}
