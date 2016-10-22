package network.Response;

import android.widget.ImageView;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class LevelThreeDetails {

    public UnitDetails getUnits() {
        return units;
    }

    public void setUnits(UnitDetails units) {
        this.units = units;
    }

    @SerializedName("units")
    @Expose
    private UnitDetails units;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("title")
    @Expose
    private String title;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @SerializedName("link")
    @Expose
    private String link;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @SerializedName("description")
    @Expose
    private String description;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @SerializedName("language")
    @Expose
    private String language;

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    @SerializedName("lastBuildDate")
    @Expose
    private String lastBuildDate;

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    @SerializedName("ttl")
    @Expose
    private String ttl;

    public LocationDetails getLocation() {
        return location;
    }

    public void setLocation(LocationDetails location) {
        this.location = location;
    }

    @SerializedName("location")
    @Expose
    private LocationDetails location;

    public WindDetails getWind() {
        return wind;
    }

    public void setWind(WindDetails wind) {
        this.wind = wind;
    }

    @SerializedName("wind")
    @Expose
    private WindDetails wind;

    public AtmosphereDetails getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(AtmosphereDetails atmosphere) {
        this.atmosphere = atmosphere;
    }

    @SerializedName("atmosphere")
    @Expose
    private AtmosphereDetails atmosphere;

    public AstronomyDetails getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(AstronomyDetails astronomy) {
        this.astronomy = astronomy;
    }

    @SerializedName("astronomy")
    @Expose
    private AstronomyDetails astronomy;

    public ImageDetails getImage() {
        return image;
    }

    public void setImage(ImageDetails image) {
        this.image = image;
    }

    @SerializedName("image")
    @Expose
    private ImageDetails image;

    public LevelTwoDetails getItem() {
        return item;
    }

    public void setItem(LevelTwoDetails item) {
        this.item = item;
    }

    @SerializedName("item")
    @Expose
    private LevelTwoDetails item;
}
