package com.example.farhaan.farhaanweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import network.Response.Complete;
import network.Response.ConditionDetails;
import network.Response.WeatherDetails;
import network.RetrofitProvider;
import rx.Subscriber;
import rx.schedulers.Schedulers;
import rx.android.schedulers.AndroidSchedulers;

public class MainActivity extends AppCompatActivity {

    TextView todayDate, weatherDetails, weatherSummary, high, low;
    ListView forecast_list;
    String[] dates = new String[10];
    String[] highs = new String[10];
    String[] lows = new String[10];
    ForecastAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todayDate = (TextView) findViewById(R.id.today_date);
        weatherDetails = (TextView) findViewById(R.id.weather_details);
        weatherSummary = (TextView) findViewById(R.id.weather_summary);
        high = (TextView) findViewById(R.id.today_high);
        low = (TextView) findViewById(R.id.today_low);
        forecast_list = (ListView) findViewById(R.id.forecast_list);

        RetrofitProvider.getInstance().provideApi().getComplete().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<Complete>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(Complete complete) {
                        ConditionDetails condition = complete.getQuery().getResults().getChannel().getItem().getCondition();
                        weatherDetails.setText(condition.getTemp() + " F");
                        weatherSummary.setText(condition.getText());
                        List<WeatherDetails> weather = complete.getQuery().getResults().getChannel().getItem().getForecast();
                        for (int i=0;i<weather.size();i++){
                            if(i==0){
                                todayDate.setText(weather.get(i).getDate());
                                high.setText(weather.get(i).getHigh());
                                low.setText(weather.get(i).getLow());
                            } else {
                                dates[i-1] = weather.get(i).getDate();
                                highs[i-1] = weather.get(i).getHigh();
                                lows[i-1] = weather.get(i).getLow();
                            }
                        }
                        adapter = new ForecastAdapter(MainActivity.this, R.id.text_date, dates, highs, lows);
                        forecast_list.setAdapter(adapter);
                    }
                });
    }
}
