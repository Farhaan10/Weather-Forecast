package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class WindDetails {

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    @SerializedName("chill")
    @Expose
    private String chill;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @SerializedName("direction")
    @Expose
    private String direction;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @SerializedName("speed")
    @Expose
    private String speed;
}
