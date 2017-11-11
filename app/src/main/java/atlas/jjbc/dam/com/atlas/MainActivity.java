package atlas.jjbc.dam.com.atlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateCredits(View view){
        Intent intent = new Intent(this, CreditActivity.class);
        startActivity(intent);
    }

    public void initApp(View view){
        Intent intent = new Intent(this, ListContinent.class);
        startActivity(intent);
    }
}
