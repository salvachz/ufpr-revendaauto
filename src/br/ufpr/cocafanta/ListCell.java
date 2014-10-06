package br.ufpr.cocafanta;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListCell extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] refri;
	private final Integer[] imageId;
	
	public ListCell(Context context, String[] refri, Integer[] imageId) {
		super(context, R.layout.list_cell, refri);
		this.context = (Activity) context;
		this.refri = refri;
		this.imageId = imageId;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView 		= inflater.inflate(R.layout.list_cell, null, true);
		TextView txtTitle	= (TextView) rowView.findViewById(R.id.txt);
		ImageView imageView	= (ImageView) rowView.findViewById(R.id.img);
		txtTitle.setText(refri[position]);
		imageView.setImageResource(imageId[position]);
		return rowView;
		
	}

}
