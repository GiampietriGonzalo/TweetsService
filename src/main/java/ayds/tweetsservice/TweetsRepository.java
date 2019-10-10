package ayds.tweetsearcher.domain;

import java.util.List;

public interface TweetsRepository {

    void findTweets(String query, SearchListener listener, SearchErrorListener errorListener);

interface SearchListener {
    void onFound(List<TweetResult> tweets);
}

interface SearchErrorListener {
    void onError();
}
}
