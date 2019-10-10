package ayds.tweetsservice;

public class TweetResult {
    private String description;
    private String username;
    private int likesCount;
    private int retweetsCount;
    private int commentsCount;

    public TweetResult(String username, String description, int likesCount, int retweetsCount, int commentsCount) {
        this.username = username;
        this.description = description;
        this.likesCount = likesCount;
        this.retweetsCount = retweetsCount;
        this.commentsCount = commentsCount;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public int getRetweetsCount() {
        return retweetsCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }
}

