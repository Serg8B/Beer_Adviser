package app.sergio8.com.beer_adviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert1 {
    List<String> getBrands(String color){
       List<String> brands = new ArrayList<String>();
       if (color.equals("amber")) {
           brands.add("Jack Amber");
           brands.add("Red Moose");
       } else {
           brands.add("Jail Pale Ale");
           brands.add("Gout Stout");
       }
       return brands;
    }
}
