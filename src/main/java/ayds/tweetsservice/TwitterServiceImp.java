package ayds.tweetsservice;

import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.core.services.StatusesService;
import java.util.LinkedList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Response;

class TwitterServiceImp implements TwitterService {

    private StatusesService statusesService;

    TwitterServiceImp(StatusesService statusesService) {
        this.statusesService = statusesService;
    }

  public List<TweetResult> findTweets(String query) {
      List<Tweet> tweets;
      List<TweetResult> tweetsResult = new LinkedList<>();

     Call<List<Tweet>> tweetsFromService = statusesService.userTimeline(
              null, query, 20, null,
             null, false, false,
             false, false);

      try {
          Response<List<Tweet>> result = tweetsFromService.execute();
          tweets = result.body();
          TweetResult newTweet;

          for (Tweet tweet: tweets) {
              newTweet = new TweetResult(tweet.user.screenName, tweet.user.name, tweet.text, tweet.favoriteCount, tweet.retweetCount, tweet.createdAt);
              tweetsResult.add(newTweet);
          }

      } catch(Exception e) {
          System.out.println(e.getMessage());
      }
      return tweetsResult;
    }
}
