package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class LevelFiveDetails {

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @SerializedName("count")
    @Expose
    private String count;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @SerializedName("created")
    @Expose
    private String created;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @SerializedName("lang")
    @Expose
    private String lang;

    public LevelFourDetails getResults() {
        return results;
    }

    public void setResults(LevelFourDetails results) {
        this.results = results;
    }

    @SerializedName("results")
    @Expose
    private LevelFourDetails results;
}
