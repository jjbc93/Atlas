package atlas.jjbc.dam.com.atlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Continent extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent);
        textView = (TextView) findViewById(R.id.continenttName);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String continent = (String) bundle.get("continent");
            textView.setText(continent);
            generateContinent(continent);
        }
    }

    public void generateContinent(String nameContinent){
        textView = (TextView) findViewById(R.id.continentDescription);
        ImageView imageView = (ImageView) findViewById(R.id.continentImage);
        String description = "";
        String imgUrl;
        switch (nameContinent){
            case "Europa":
                 description = "Europa es uno de los continentes que conforman el supercontinente" +
                " euroasiático, situado entre los paralelos 36º y 70º de latitud norte.";
                textView.setText(description);
                imageView.setImageResource(R.drawable.europa);
                break;
            case "Africa":
                description = "África es el tercer continente por su extensión, tras Asia y América." +
                " Está situado entre los océanos Atlántico, al oeste, e Índico, al este";
                textView.setText(description);
                imageView.setImageResource(R.drawable.africa);
                break;
            case "America":
                description = "América es el segundo continente más grande de la Tierra, después de " +
                "Asia. Ocupa gran parte del hemisferio occidental del planeta";
                textView.setText(description);
                imageView.setImageResource(R.drawable.america);
                break;
            case "Asia":
                description = "Asia es el continente más extenso y poblado de la Tierra. Con cerca " +
                "de 44 millones de km², supone el 8,70 % del total de la superficie terrestre " +
                "y el 29,45 % de las tierras emergidas y, con 4 140 000 ...";
                textView.setText(description);
                imageView.setImageResource(R.drawable.asia);
                break;
            case "Oceania":
                description = "Oceanía es un continente insular de la Tierra constituido por la plataforma " +
                "continental de Australia, las islas de Nueva Guinea, Nueva Zelanda y los " +
                "archipiélagos coralinos y volcánicos de Melanesia, Micronesia y Polinesia";
                textView.setText(description);
                imageView.setImageResource(R.drawable.oceania);
                break;
        }
    }
}
