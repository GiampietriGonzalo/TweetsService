package ayds.tweetsearcher.data.repository;

import com.twitter.sdk.android.core.models.Tweet;
import ayds.tweetsearcher.data.repository.external.servicesbroker.TwitterService;
import ayds.tweetsearcher.domain.TweetResult;
import ayds.tweetsearcher.domain.TweetsRepository;
import java.util.LinkedList;
import java.util.List;

class TweetsRepositoryImp implements TweetsRepository {

    private final TwitterService externalService;

    TweetsRepositoryImp(TwitterService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void findTweets(String query, SearchListener listener, SearchErrorListener errorListener) {
        List<Tweet> tweets = externalService.findTweets(query);
        List<TweetResult> tweetsResult = new LinkedList<>();
        if (tweets == null || tweets.isEmpty()) {
            errorListener.onError();
        } else {
            TweetResult newTweet;
            for (Tweet tweet: tweets) {
                newTweet = new TweetResult(tweet.user.name, tweet.text, tweet.favoriteCount, tweet.retweetCount, 10);
                tweetsResult.add(newTweet);
            }

            listener.onFound(tweetsResult);
        }
    }

}
