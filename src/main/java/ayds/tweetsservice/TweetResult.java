package ayds.tweetsservice;

public class TweetResult {
    private String tweetText;
    private String username;
    private String date;
    private int likesCount;
    private int retweetsCount;

    public TweetResult(String username, String tweetText, int likesCount, int retweetsCount, String date) {
        this.username = username;
        this.tweetText = tweetText;
        this.likesCount = likesCount;
        this.retweetsCount = retweetsCount;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getTweetText() {
        return tweetText;
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
