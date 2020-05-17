package com.real.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    int positionCountry;
    TextView tvCountry,tvcases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent =getIntent();
        positionCountry=intent.getIntExtra("position",0);

        tvCountry=findViewById(R.id.tvBhitraCountry);
        tvcases=findViewById(R.id.tvBhitraCases);
        tvRecovered=findViewById(R.id.tvBhitraRecovered);
        tvCritical=findViewById(R.id.tvBhitraCritical);
        tvActive=findViewById(R.id.tvBhitraActive);
        tvTodayCases=findViewById(R.id.tvBhitraTodayCases);
        tvTotalDeaths=findViewById(R.id.tvBhitraDeaths);
        tvTodayDeaths=findViewById(R.id.tvBhitraTodayDeaths);

        tvCountry.setText(AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        tvcases.setText(AffectedCountries.countryModelsList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelsList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelsList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());


    }
}
