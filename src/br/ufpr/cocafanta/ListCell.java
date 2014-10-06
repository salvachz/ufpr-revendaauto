package br.ufpr.cocafanta;

import java.text.NumberFormat;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.ufpr.revendacarro.R;


public class ListCell extends ArrayAdapter<CarModel> {
	private final Activity context;
	private final CarModel[] car;
	
	
	public ListCell(Context context, CarModel[] car) {
		super(context, R.layout.list_cell, car);
		this.context = (Activity) context;
		this.car = car;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent){
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView 		= inflater.inflate(R.layout.list_cell, null, true);
		TextView title	= (TextView) rowView.findViewById(R.id.txt);
		TextView subTitle= (TextView) rowView.findViewById(R.id.subtitle);
		ImageView imageView	= (ImageView) rowView.findViewById(R.id.img);
		title.setText(car[position].getModelo());
		subTitle.setText("US $ "+ car[position].getPreco().toString() );
		imageView.setImageResource(car[position].getFoto());
		return rowView;
		
	}

}
