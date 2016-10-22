package network;

import network.Response.Complete;
import network.Response.LevelFiveDetails;
import retrofit2.adapter.rxjava.Result;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Farhaan on 22-10-2016.
 */
public interface MyRestAPI {

    @GET("/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22chicago%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    public Observable<Complete> getComplete();
}
