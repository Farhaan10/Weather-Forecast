package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class LocationDetails {

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @SerializedName("city")
    @Expose
    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @SerializedName("country")
    @Expose
    private String country;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @SerializedName("region")
    @Expose
    private String region;
}
