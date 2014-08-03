package com.example.fruit_information;

import com.example.adapter.ViewPagerAdapter;
import com.example.navigation.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class GoodsInformation extends Activity {
    ViewPager viewPager;
    int[] flags={R.drawable.huolongguo,R.drawable.huolongguo2,R.drawable.huolongguo3};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.viewpager_main);
		viewPager=(ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(new ViewPagerAdapter(this, flags));
		super.onCreate(savedInstanceState);
	}
}
