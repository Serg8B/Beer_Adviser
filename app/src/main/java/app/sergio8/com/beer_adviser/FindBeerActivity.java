package app.sergio8.com.beer_adviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    public void onClickFindBeer(View view){
        //get link for TextView
        TextView brands = (TextView) findViewById(R.id.TvBrands);
        //get link for Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get value item in Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand:brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        //output selected value
        brands.setText(brandsFormatted);
    }
}
