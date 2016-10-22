package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class UnitDetails {

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @SerializedName("distance")
    @Expose
    private String distance;

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @SerializedName("pressure")
    @Expose
    private String pressure;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @SerializedName("speed")
    @Expose
    private String speed;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @SerializedName("temperature")
    @Expose
    private String temperature;
}
