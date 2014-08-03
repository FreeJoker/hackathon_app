package com.example.adapter;

import com.example.navigation.R;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    int [] flags;
	public ViewPagerAdapter(Context context,int [] flags) {
	      this.context=context;
	      this.flags=flags;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return flags.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		
		return view==((RelativeLayout)object);
	}
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		ImageView image;
		inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView=inflater.inflate(R.layout.viewpager_item,container , false);
		image=(ImageView)itemView.findViewById(R.id.goods_image);
		image.setImageResource(flags[position]);
		((ViewPager)container).addView(itemView);
		return itemView;
	}
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    	((ViewPager) container).removeView((RelativeLayout) object);
    	
    }
}
