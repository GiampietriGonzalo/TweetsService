package ayds.tweetsservice;

import android.content.Context;

import com.twitter.sdk.android.core.Twitter;

public class ExternalServiceModule {

    private static ExternalServiceModule instance;

    private ExternalServiceModule() {}

    public static ExternalServiceModule getInstance() {
        if (instance == null) {
            instance = new ExternalServiceModule();
        }
        return instance;
    }

    public TwitterService getTwitterlService(Context context) {
        Twitter.initialize(context);
        return new TwitterServiceImp();
    }
}

