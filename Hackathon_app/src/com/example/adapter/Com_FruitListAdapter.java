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
	private String[] name = { "ƻ��+����", "ľ��+ʥŮ��", "����+ʥŮ��+������", "��+⨺���+��", "ˮ��ɳ��","�����������","ˮ��άC���" };
	private String[] nutrition = { "[˫ƴ]�Ŷ����գ�����Ƥ�������ʣ����Ƴմ�",
			"[����]���������������������¿����������", "[��ƴ]�������ԣ������������˶��ر�",
			"[��ƴ]й�ȵ�̵�����ؿ��ᣬ��ѪֹѪ����Ч ", "[ɳ��]�������� ���� ���� ��ߴ�л", "[�ײ�]�Ŷ����գ�����Ƥ�ر���������", "[�ײ�]��֬��ѹ,���͵��̴�,ͨ��"};
	private String[] price = { "20Ԫ", "22Ԫ", "24Ԫ", "24Ԫ","30Ԫ","26Ԫ","26Ԫ"};
	private String[] point = { "10����", " 12  ����", "14  ����", "18  ����", "16  ����", "16  ����", "15  ����" };

}
