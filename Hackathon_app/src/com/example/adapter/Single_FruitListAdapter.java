package com.example.adapter;

import com.example.navigation.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Single_FruitListAdapter extends BaseAdapter {
	private Context mContext;

	public Single_FruitListAdapter() {

	}

	public Single_FruitListAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {

		return images.length;
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

	private Integer[] images = { R.drawable.ic_fruit_1, R.drawable.ic_fruit_2,
			R.drawable.ic_fruit_3, R.drawable.ic_fruit_4,
			R.drawable.ic_fruit_5, R.drawable.ic_fruit_6,
			R.drawable.ic_fruit_7 ,R.drawable.ic_fruit_8};
	private String[] name = { "火龙果", "白瓜", "柑橘", "橙子", "红富士", "胡柚", "鸡蛋芒",
			"进口猕猴桃"};
	private String[] nutrition = { "[泰国]排毒养颜，美白皮肤，减肥，抑制痴呆",
			"[杭州]助消化，巩固牙龈，清新口气，润泽喉部", "[三亚]提神醒脑，补充能量，运动必备",
			"[江南]泄热涤痰，宽胸开结，凉血止血，功效 ", "[日本]防癌抗癌 养颜 减肥 提高代谢", "[福建]抗菌抗病毒 降血糖", "[东南亚]祛脂降压,降低胆固醇,通便", "[湖南]美白除斑,增强抵抗力"};
	private String[] price = { "19元", "12元", "6元", "3元","5元","12元","14元","18元"};
	private String[] point = { "6  积分", " 5  积分", "3  积分", "1  积分", "2  积分", "3  积分", "5  积分", "6  积分" };
}
