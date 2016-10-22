package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class LevelFourDetails {

    public LevelThreeDetails getChannel() {
        return channel;
    }

    public void setChannel(LevelThreeDetails channel) {
        this.channel = channel;
    }

    @SerializedName("channel")
    @Expose
    private LevelThreeDetails channel;
}
