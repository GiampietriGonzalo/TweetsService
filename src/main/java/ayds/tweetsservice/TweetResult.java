package ayds.tweetsservice;

public class TweetResult {
    private String description;
    private String username;
    private String accountName;
    private String date;
    private int likesCount;
    private int retweetsCount;

    public TweetResult(String username, String accountName, String description, int likesCount, int retweetsCount, String date) {
        this.username = username;
        this.accountName = accountName;
        this.description = description;
        this.likesCount = likesCount;
        this.retweetsCount = retweetsCount;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getAccountName() {
        return accountName;
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

    public String getDate() {
        return date;
    }
}