package com.ShoppingApp.app;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class CartActivity extends ListActivity {
    /** Called when the activity is first created. */
    ArrayList<CartItem> newList = null;

    SimpleAdapter adpt = null;

    private Button btnSave = null;

    private EditText txtName = null;
    private EditText txtMobile = null;
    private CustomListAdapter newAdpt = null;
    private int i = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        newList = new ArrayList<CartItem>();

        newAdpt = new CustomListAdapter(this, R.layout.cart_item, newList);
        setListAdapter(this.newAdpt);

        txtName = (EditText)findViewById(R.id.itemName);
        txtMobile = (EditText)findViewById(R.id.itemPrice);
        btnSave = (Button)findViewById(R.id.deleteBtn);

        btnSave.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                newList = new ArrayList<CartItem>();
                CartItem info = new CartItem();
                info.SetItemName(txtName.getText().toString());
                info.SetPrice(Double.parseDouble(txtMobile.getText().toString()));
                newList.add(info);
//Thread.sleep(2000);

                if(newList != null && newList.size() > 0){
                    newAdpt.notifyDataSetChanged();
                    newAdpt.add(newList.get(0));
                    i++;
// for(int i=0;i<newList.size();i++)
//     newAdpt.add(newList.get(i));
                }

                newAdpt.notifyDataSetChanged();

            }
        });
    }
}
