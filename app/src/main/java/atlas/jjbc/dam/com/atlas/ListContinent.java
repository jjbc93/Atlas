package atlas.jjbc.dam.com.atlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListContinent extends AppCompatActivity {
    ListView listView;
    String [] continents = {"Europa", "America", "Asia", "Africa", "Oceania"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_continent);
        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, continents);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nameContinent = (String) listView.getItemAtPosition(i);
                Intent intent = new Intent(getApplicationContext(), Continent.class);
                intent.putExtra("continent", nameContinent);
                startActivity(intent);
            }
        });
    }
}
