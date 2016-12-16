package com.example.weather.adapter;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.weather.R;
import com.example.weather.moder.Weather;

public class WeatherAdapter extends ArrayAdapter<Weather> {
	private int resourceId;
	public WeatherAdapter(Context context, int textViewResourceId,
			List<Weather> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup viewgroup) {
		Weather weather=getItem(position);
		ViewHolder viewHolder=null;
		if(convertView==null){
			viewHolder=new ViewHolder();
			convertView=LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder.tvDayOfWeek=(TextView)
					convertView.findViewById(R.id.tvDayofWeek);
			viewHolder.tvDate=(TextView) convertView.findViewById(R.id.tvDate);
			viewHolder.tvTemperature=(TextView) convertView.findViewById(R.id.tvTemperature);
			viewHolder.tvWeather=(TextView) convertView.findViewById(R.id.tvWeather);
			viewHolder.tvWind=(TextView) convertView.findViewById(R.id.tvWind);
			viewHolder.tvDressing_advice=(TextView) convertView.findViewById(R.id.tvDressing_advice);
			convertView.setTag(viewHolder);
		}else{
			viewHolder=(ViewHolder) convertView.getTag();
		}
		viewHolder.tvDayOfWeek.setText(weather.getDayOfWeek());
		viewHolder.tvDate.setText(weather.getDate());
		viewHolder.tvTemperature.setText(weather.getTemperature());
		viewHolder.tvWeather.setText(weather.getWeather());
		viewHolder.tvWind.setText(weather.getWind());
		viewHolder.tvDressing_advice.setText(weather.getDressing_advice());
		return convertView;
	}
	private class ViewHolder{
		TextView tvDayOfWeek;
		TextView tvDate;
		TextView tvTemperature;
		TextView tvWeather;
		TextView tvWind;
		TextView tvDressing_advice;
	}
}
