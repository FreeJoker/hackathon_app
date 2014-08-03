package com.example.adapter;

import com.example.navigation.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Com_FruitListAdapter extends BaseAdapter {
	private Context mContext;

	public Com_FruitListAdapter() {

	}

	public Com_FruitListAdapter(Context context) {
           mContext=context;
	}
  
	@Override
	public int getCount() {
		
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
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

	private Integer[] images = { R.drawable.ic_combine_1, R.drawable.ic_combine_2,
			R.drawable.ic_combine_3, R.drawable.ic_combine_4,
			R.drawable.ic_combine_5, R.drawable.ic_combine_6,R.drawable.ic_combine_7
			};
	private String[] name = { "苹果+菠萝", "木瓜+圣女果", "柠檬+圣女果+火龙果", "梨+猕猴桃+橙", "水果沙拉","瘦身养颜组合","水润维C组合" };
	private String[] nutrition = { "[双拼]排毒养颜，美白皮肤，减肥，抑制痴呆",
			"[杭州]助消化，巩固牙龈，清新口气，润泽喉部", "[三拼]提神醒脑，补充能量，运动必备",
			"[三拼]泄热涤痰，宽胸开结，凉血止血，功效 ", "[沙拉]防癌抗癌 养颜 减肥 提高代谢", "[套餐]排毒养颜，美白皮必备肤，瘦身", "[套餐]祛脂降压,降低胆固醇,通便"};
	private String[] price = { "20元", "22元", "24元", "24元","30元","26元","26元"};
	private String[] point = { "10积分", " 12  积分", "14  积分", "18  积分", "16  积分", "16  积分", "15  积分" };

}
