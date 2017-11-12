package atlas.jjbc.dam.com.atlas;

import android.content.Intent;
import android.media.Image;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListCountries extends AppCompatActivity {
    String continent = "";
    boolean [] countries = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_countries);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            continent = (String) bundle.get("continent");
            countries = (boolean[]) bundle.get("seleccionados");
            generateCountries(continent, countries);
        }
    }

    public void generateCountries(String continent, boolean[] countries){
        ArrayList <String> nameCountries = new ArrayList<>();

        /*String [] aa = {"", "", ""};*/
//        switch(continent){
//            case "Europa":
//                nameCountries.add;
//                int [] imgPath = {R.drawable.spain, R.drawable.francia, R.drawable.italia};
//                aa = {""};
//                addConstraint(europaCountries,imgPath, countries);
//                break;
//            case "America":
//                String [] americaCountries = {"España", "Francia", "Italia"};
//                addConstraint(americaCountries, imgPath, countries);
//                break;
//        }
//    }

    public void addConstraint(String[] nameCountry, int[]imgPath, boolean[]countries){
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintCountries);
        ConstraintSet constraintSet = new ConstraintSet();
        TextView textViewTitle = new TextView(this);
        textViewTitle.setPadding(10, 10, 10,60);
        textViewTitle.setId(View.generateViewId());
        textViewTitle.setText(continent);
        textViewTitle.setTextSize(24);
        constraintLayout.addView(textViewTitle);
        constraintSet.connect(textViewTitle.getId(), ConstraintSet.TOP, constraintLayout.getId(), ConstraintSet.BOTTOM);
        int constraintParentText = textViewTitle.getId();
        int constraintParentImg = textViewTitle.getId();
        for(int i = 0; i < countries.length; i++){
            if(countries[i]){
                //addConstraint(i, nameCountry, imgPath, countries);
                TextView textView = new TextView(this);
                ImageView imageView = new ImageView(this);
                textView.setText(nameCountry[i]);
                imageView.setImageResource(imgPath[i]);
                textView.setPadding(10, 10, 10,60);
                imageView.setPadding(10, 60, 10,30);
                textView.setId(1000+ i);
                imageView.setId(2000 + i);
                constraintLayout.addView(textView);
                constraintLayout.addView(imageView);
                ConstraintLayout.LayoutParams imgContext = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
                imgContext.width = 300;
                imgContext.height = 300;
                imageView.setLayoutParams(imgContext);

                constraintSet.clone(constraintLayout);
                constraintSet.connect(textView.getId(), ConstraintSet.TOP, constraintParentImg, ConstraintSet.BOTTOM, 0);
                constraintSet.connect(imageView.getId(), ConstraintSet.TOP, constraintParentImg, ConstraintSet.BOTTOM,0);
                constraintParentText = textView.getId();
                constraintParentImg = imageView.getId();
                constraintSet.applyTo(constraintLayout);
            }
        }
    }
}
