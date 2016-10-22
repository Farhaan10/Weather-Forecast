package com.example.farhaan.farhaanweather;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Farhaan on 22-10-2016.
 */
public class ForecastAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] dates;
    private final String[] highs;
    private final String[] lows;
    TextView date, high, low;

    public ForecastAdapter(Activity context, int resource, String[] dates, String[] highs, String[] lows) {
        super(context, resource, dates);
        this.context = context;
        this.dates = dates;
        this.highs = highs;
        this.lows = lows;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        final View rowView;
        rowView = inflater.inflate(R.layout.layout_row, null, true);
        date = (TextView) rowView.findViewById(R.id.text_date);
        date.setText(dates[position]);
        high = (TextView) rowView.findViewById(R.id.text_high);
        high.setText(highs[position]);
        low = (TextView) rowView.findViewById(R.id.text_low);
        low.setText(lows[position]);
        return rowView;
    }
}
