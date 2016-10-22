package network.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class Complete {

    public LevelFiveDetails getQuery() {
        return query;
    }

    public void setQuery(LevelFiveDetails query) {
        this.query = query;
    }

    @SerializedName("query")
    @Expose
    private LevelFiveDetails query;
}
