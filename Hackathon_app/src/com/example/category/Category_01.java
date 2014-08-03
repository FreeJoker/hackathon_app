package com.example.category;


import com.example.adapter.Single_FruitListAdapter;
import com.example.fruit_information.GoodsInformation;
import com.example.navigation.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Category_01 extends Activity {
	
   private ListView listView;
   @Override
protected void onCreate(Bundle savedInstanceState) {
	setContentView(R.layout.gridview_1_click);
	super.onCreate(savedInstanceState);
	listView=(ListView)findViewById(R.id.category_list);
	listView.setAdapter(new Single_FruitListAdapter(this));
	listView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			startActivity(new Intent(Category_01.this,GoodsInformation.class));
//			Intent intent=new Intent();
//			intent.setClass(this, GoodsInformation.class);
			
		}
	});
}
}
