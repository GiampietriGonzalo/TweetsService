package ayds.tweetsservice;

import java.util.List;

public interface TwitterService {
    List<TweetResult> findTweets(String query) ;
}
