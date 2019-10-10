package ayds.tweetsservice;

import java.util.List;

public interface TweetsRepository {

    void findTweets(String query);

interface SearchListener {
    void onFound(List<TweetResult> tweets);
}

interface SearchErrorListener {
    void onError();
}
}
