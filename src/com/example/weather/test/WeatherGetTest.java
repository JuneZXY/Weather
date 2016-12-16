package com.example.weather.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.example.weather.util.HttpCallbackListener;
import com.example.weather.util.HttpUtil;

import android.test.AndroidTestCase;

public class WeatherGetTest  extends AndroidTestCase{
	 public void testGetData(){	 
		 String cityName;
		try {
			cityName = URLEncoder.encode("∫ ‘Û", "utf-8");
			String  weatherUrl="http://v.juhe.cn/weather/index?format=2&cityname="+cityName+"&key=8b992d06e5927368d39789bfdaf1ef14";
		
		 HttpUtil.sendHttpRequest(weatherUrl, new HttpCallbackListener() {
			
			public void onFinish(String response) {
				// TODO Auto-generated method stub
				System.out.println(response);
			}
			
			public void onError(Exception e) {
				// TODO Auto-generated method stub
				
			}
			});
		 }catch (Exception e) {
			// TODO: handle exception
		}
	
	 }
}
