package br.ufpr.cocafanta;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import br.ufpr.revendacarro.R;


public class MainActivity extends Activity {

	ListView list;
	CarModel[] cars = {
			new CarModel("Lotec C1000", R.drawable.lotecc1000 ,"Mercedes-Benz","cinza",3400000.00),
			new CarModel("Veyron 16.4",R.drawable.veyron164, "Veyron 16.4","preta com vermeho",1500000.00)
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);       
        ListCell adapter = new ListCell(MainActivity.this, cars);
        list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        	@Override
        	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
        		Toast.makeText(MainActivity.this, "Clicou na "+cars[+ arg2],
        				Toast.LENGTH_SHORT).show();
        	}

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
