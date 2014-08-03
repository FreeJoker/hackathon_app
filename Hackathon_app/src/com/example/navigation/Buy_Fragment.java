package com.example.navigation;

import com.example.adapter.Rec_FruitListAdapter;
import com.example.adapter.GridViewAdapter;
import com.example.category.Category_01;
import com.example.category.Category_02;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;

public class Buy_Fragment extends Fragment {

	public static final String ARG_PLANET_NUMBER = "planet_number";

	public Buy_Fragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.buy, container, false);

		// GridView
		// gridView=(GridView)this.getActivity().findViewById(R.id.gridview);
		GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
		gridView.setAdapter(new GridViewAdapter(getActivity()));
		// gridView.setSelector(new ColorDrawable(Color.BLUE));
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					startActivity(new Intent(getActivity(), Category_01.class));
					break;
				case 1:
					startActivity(new Intent(getActivity(), Category_02.class));
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;

				}

			}
		});
		ListView listView = (ListView) rootView.findViewById(R.id.hot_rec_list);
		listView.setAdapter(new Rec_FruitListAdapter(getActivity()));
		return rootView;
	}
}
