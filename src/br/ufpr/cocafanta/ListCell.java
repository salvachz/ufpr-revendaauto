package br.ufpr.cocafanta;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


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
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView 		= inflater.inflate(R.layout.list_cell, null, true);
		TextView txtTitle	= (TextView) rowView.findViewById(R.id.txt);
		ImageView imageView	= (ImageView) rowView.findViewById(R.id.img);
		txtTitle.setText(car[position].getModelo());
		imageView.setImageResource(car[position].getFoto());
		return rowView;
		
	}

}
