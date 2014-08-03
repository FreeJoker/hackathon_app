package com.example.adapter;


import com.example.navigation.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
	 private Context mContext;

	    public GridViewAdapter(Context c) {
	        mContext = c;
	    }

	    public int getCount() {
	        return mThumbIds.length;
	    }

	    public Object getItem(int position) {
	        return null;
	    }

	    public long getItemId(int position) {
	        return 0;
	    }

	    // create a new ImageView for each item referenced by the Adapter
//	    public View getView(int position, View convertView, ViewGroup parent) {
//	        ImageView imageView;	        
//	        if (convertView == null) {  // if it's not recycled, initialize some attributes
//	            imageView = new ImageView(mContext);
//	            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//	            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//	            imageView.setPadding(8, 8, 8, 8);
//	        } else {
//	            imageView = (ImageView) convertView;
//	           
//	        }
//
//	        imageView.setImageResource(mThumbIds[position]);
//	        return imageView;
//	    }
	    private Integer[] mThumbIds = {
	        R.drawable.ic_category_0,R.drawable.ic_category_1,
	        R.drawable.ic_category_2,R.drawable.ic_category_3,
	        R.drawable.ic_category_4,R.drawable.ic_category_5
	    };
	    private String [] mTexts={
	    	"零散·e果","果切·缤纷","家庭·特惠","礼盒·面子","特供·预定","线下·活动"	    		
	    };

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view=View.inflate(mContext, R.layout.gridview_item, null);
			RelativeLayout rl=(RelativeLayout)view.findViewById(R.id.relaGrid);
			ImageView imageView=(ImageView)rl.findViewById(R.id.chooseImage);
			TextView textView=(TextView)rl.findViewById(R.id.chooseText);
			imageView.setImageResource(mThumbIds[position]);
			textView.setText(mTexts[position]);
			return rl;
		}
}
