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
	private String[] name = { "������", "�׹�", "����", "����", "�츻ʿ", "����", "����â",
			"����⨺���"};
	private String[] nutrition = { "[̩��]�Ŷ����գ�����Ƥ�������ʣ����Ƴմ�",
			"[����]���������������������¿����������", "[����]�������ԣ������������˶��ر�",
			"[����]й�ȵ�̵�����ؿ��ᣬ��ѪֹѪ����Ч ", "[�ձ�]�������� ���� ���� ��ߴ�л", "[����]���������� ��Ѫ��", "[������]��֬��ѹ,���͵��̴�,ͨ��", "[����]���׳���,��ǿ�ֿ���"};
	private String[] price = { "19Ԫ", "12Ԫ", "6Ԫ", "3Ԫ","5Ԫ","12Ԫ","14Ԫ","18Ԫ"};
	private String[] point = { "6  ����", " 5  ����", "3  ����", "1  ����", "2  ����", "3  ����", "5  ����", "6  ����" };
}
