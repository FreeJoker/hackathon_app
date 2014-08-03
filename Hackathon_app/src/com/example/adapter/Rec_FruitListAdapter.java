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
	private String[] name = { "̩��������", "ľ��+��ݮ+ƻ��", "��ˬ�������", "���������װ" };
	private String[] nutrition = { "[̩��]�Ŷ����գ�����Ƥ�������ʣ����Ƴմ�",
			"[����]���������������������¿����������", "[����]�������ԣ������������˶��ر�", "[����]������ڣ�����ر�" };
	private String[] price = { "19Ԫ", "25Ԫ", "28Ԫ", "36Ԫ" };
	private String[] point = { "6  ����", "8  ����", "12  ����", "16  ����" };
}
