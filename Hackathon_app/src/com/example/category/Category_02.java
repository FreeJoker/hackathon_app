package com.example.category;


import com.example.adapter.Com_FruitListAdapter;
import com.example.navigation.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Category_02 extends Activity {
	
   private ListView listView;
   @Override
protected void onCreate(Bundle savedInstanceState) {
	setContentView(R.layout.gridview_2_click);
	super.onCreate(savedInstanceState);
	listView=(ListView)findViewById(R.id.category_list_2);
	listView.setAdapter(new Com_FruitListAdapter(this));
	
}
}
