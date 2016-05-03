import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNPublishResult;
import com.pubnub.api.models.consumer.PNStatus;

/**
 * Created by Max on 5/2/16.
 */
public class Playground1 {

    public static void main(String[] args) {

        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setSubscribeKey("demo-36");
        pnConfiguration.setPublishKey("demo-36");

        PubNub pubNub = new PubNub(pnConfiguration);

        pubNub.publish().message("hello!").async(new PNCallback<PNPublishResult>() {
            @Override
            public void onResponse(PNPublishResult result, PNStatus status) {
                int moose = 10;
            }
        });

    }

}
