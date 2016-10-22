package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class LevelTwoDetails {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("title")
    @Expose
    private String title;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @SerializedName("lat")
    @Expose
    private String lat;

    public String getLong() {
        return lan;
    }

    public void setLong(String lan) {
        this.lan = lan;
    }

    @SerializedName("long")
    @Expose
    private String lan;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @SerializedName("link")
    @Expose
    private String link;

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @SerializedName("pubDate")
    @Expose
    private String pubDate;

    public ConditionDetails getCondition() {
        return condition;
    }

    public void setCondition(ConditionDetails condition) {
        this.condition = condition;
    }

    @SerializedName("condition")
    @Expose
    private ConditionDetails condition;

    public List<WeatherDetails> getForecast() {
        return forecast;
    }

    public void setForecast(List<WeatherDetails> forecast) {
        this.forecast = forecast;
    }

    @SerializedName("forecast")
    @Expose
    private List<WeatherDetails> forecast;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @SerializedName("description")
    @Expose
    private String description;

    public LinkDetails getGuid() {
        return guid;
    }

    public void setGuid(LinkDetails guid) {
        this.guid = guid;
    }

    @SerializedName("guid")
    @Expose
    private LinkDetails guid;
}
