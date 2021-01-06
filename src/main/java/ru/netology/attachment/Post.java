package ru.netology.attachment;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int friendsOnly;
    private String copyright;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private PostSourse postSourse;
    private AttachInfo attachInfo;
    private LikeInfo likeInfo;
    private CommentsInfo commentsInfo;
    private RepostInfo repostInfo;
    // + get/set на все поля
}
