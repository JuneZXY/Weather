package com.example.weather.moder;

public class Weather {
	private String dayOfWeek;//星期几
	private String date;//日期
	private String temperature;//温度
	private String weather;//天气
	private String wind;
	private String dressing_advice;
	
	public String getDressing_advice() {
		return dressing_advice;
	}
	public void setDressing_advice(String dressing_advice) {
		this.dressing_advice = dressing_advice;
	}
	public Weather(){
	}
	public Weather(String dayOfWeek, String date, String temperature,
			String weather,String wind,String dressing_advice) {
		super();
		this.dayOfWeek = dayOfWeek;
		this.date = date;
		this.temperature = temperature;
		this.weather = weather;
		this.wind=wind;
		//this.dressing_advice=dressing_advice;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	@Override
	public String toString() {
		return "Weather [dayOfWeek=" + dayOfWeek + ", date=" + date
				+ ", temperature=" + temperature + ", weather=" + weather
				+", wind="+wind+", dressing_advice="+dressing_advice+"]";
	}

}
