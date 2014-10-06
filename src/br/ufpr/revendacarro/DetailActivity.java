package br.ufpr.revendacarro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		Intent it = getIntent();
		if( it!=null){
			Bundle params = it.getExtras();
			if( params != null){
				CarModel  car = (CarModel)params.get("car");
				setContentView(R.layout.activity_detail);
				TextView title		= (TextView) findViewById(R.id.dt_model);
				TextView subTitle	= (TextView) findViewById(R.id.dt_price);
				TextView fabricator = (TextView) findViewById(R.id.dt_fabricator);
				TextView color 		= (TextView) findViewById(R.id.dt_color);
				ImageView imageView	= (ImageView) findViewById(R.id.dt_img);
				
				title.setText("Modelo: "+car.getModelo());
				subTitle.setText("Preço : US $ "+ car.getPreco().toString() );
				fabricator.setText("Fabricante: "+car.getFabricante());
				color.setText("Cor: "+car.getCor());
				imageView.setImageResource(car.getFoto());
			}
		}
	}
}
