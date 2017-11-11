package atlas.jjbc.dam.com.atlas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import atlas.jjbc.dam.com.atlas.MainActivity;

/**
 * Created by Juanjo on 11/11/2017.
 */

public class CreditActivity extends Activity {

//    EditText myEditText = (EditText) findViewById(R.layout.credits);
//    myEditText .setEnabled(false);
    @Override
    protected void onCreate(Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        setContentView(R.layout.credits);
    }
}
