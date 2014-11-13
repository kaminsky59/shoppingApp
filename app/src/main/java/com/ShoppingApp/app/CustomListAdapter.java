package com.ShoppingApp.app;

/**
 * Created by Eugene K on 11/12/2014.
 */

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CustomListAdapter extends ArrayAdapter<CartItem> {
    private Context appContext = null;
    private ArrayList<CartItem> cartItems = null;
    public CustomListAdapter(Context context, int textViewResourceId, ArrayList<CartItem> items){
        super(context,textViewResourceId,items);
        this.appContext = context;
        this.cartItems=items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) appContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.cart_item, null);
        }
        CartItem o = cartItems.get(position);
        if (o != null) {
            TextView name = (TextView) v.findViewById(R.id.itemName);
            TextView price = (TextView) v.findViewById(R.id.itemPrice);
            Button btnDelete = (Button)v.findViewById(R.id.deleteBtn);

            btnDelete.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    //Toast.makeText(appContext,”Hellow this is clicked”, Toast.LENGTH_LONG).show();

                }
            });

            if (name != null) {
                name.setText(o.GetItemName());                            }
            if(price != null){
                price.setText(String.valueOf(o.GetPrice()));
            }
        }
        return v;
    }
}

