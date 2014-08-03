package com.example.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.navigation.R;

public class Rec_FruitListAdapter extends BaseAdapter {
	private Context mContext;

	public Rec_FruitListAdapter() {

	}

	public Rec_FruitListAdapter(Context context) {
		mContext = context;

	}

	@Override
	public int getCount() {

		return name.length;
	}

	@Override
	public Object getItem(int position) {

		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = View.inflate(mContext, R.layout.fruit_list_item, null);
		RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.fruit_list);
		ImageView fruit_image = (ImageView) rl.findViewById(R.id.fruit_image);
		TextView fruit_name = (TextView) rl.findViewById(R.id.fruit_name);
		TextView fruit_nutrition = (TextView) rl
				.findViewById(R.id.fruit_nutrition);
		TextView fruit_price = (TextView) rl.findViewById(R.id.fruit_price);
		TextView fruit_point = (TextView) rl.findViewById(R.id.point);
		fruit_image.setImageResource(images[position]);
		fruit_name.setText(name[position]);
		fruit_nutrition.setText(nutrition[position]);
		fruit_price.setText(price[position]);
		fruit_point.setText(point[position]);
		return rl;
	}

	private Integer[] images = { R.drawable.ic_fruit_1, R.drawable.re_fruit_2,
			R.drawable.re_fruit_3, R.drawable.re_fruit_4 };
	private String[] name = { "泰国火龙果", "木瓜+草莓+苹果", "清爽活力组合", "精美礼盒套装" };
	private String[] nutrition = { "[泰国]排毒养颜，美白皮肤，减肥，抑制痴呆",
			"[杭州]助消化，巩固牙龈，清新口气，润泽喉部", "[三亚]提神醒脑，补充能量，运动必备", "[江南]逢年过节，送礼必备" };
	private String[] price = { "19元", "25元", "28元", "36元" };
	private String[] point = { "6  积分", "8  积分", "12  积分", "16  积分" };
}
