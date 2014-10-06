package br.ufpr.revendacarro;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import br.ufpr.revendacarro.R;

public class MainActivity extends Activity {

	ListView list;
	CarModel[] cars = {
			new CarModel("Lotec C1000", R.drawable.lotecc ,"Mercedes-Benz","cinza",3400000.00),
			new CarModel("Veyron 16.4",R.drawable.veyron164, "Bugatti","preta com vermeho",1500000.00),
			new CarModel("Veyron 16.4 Grand Sport",R.drawable.veyron164grandsport, "Bugatti","branco",1120000.00),
			new CarModel("Venom 1000 Twin Turbo",R.drawable.venom1000twinturbo, "Hennessey","verde",290000.00),
			new CarModel("Ultimate Aero TT",R.drawable.ultimateaerott, "SSC","laranja",770000.00),
			new CarModel("GT9-R",R.drawable.gt9r, "Porche","azul",920000.00),
			new CarModel("911 GT2 GTurbo 1200",R.drawable.gt2gturbo, "Porche","preto",300000.00),
			new CarModel("Agera R",R.drawable.agerar, "Koenigsegg","azul",1530000.00),
			new CarModel("Veyron 16.4 Super Sport",R.drawable.veyron1supersport, "Bugatti","preto",2350000.00),
			new CarModel("Venom GT",R.drawable.venomgt2014, "Hennessey","prata",1200000.00)
			
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
        		Intent it = new Intent(getBaseContext(), DetailActivity.class);
        		Bundle params = new Bundle();
        		params.putSerializable("car",cars[arg2]);
        		it.putExtras(params);
        		startActivity(it);
        		
        		
        		
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
