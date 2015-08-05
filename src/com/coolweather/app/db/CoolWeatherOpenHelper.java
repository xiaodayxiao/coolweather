package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	//Province�������
	public static final String CRATE_PROVINCE = "create table province(" +
			"id integer primary key autoincrement" +
			"province_name text" +
			"province_code text)";
	
	//City�������
	public static final String CRATE_CITY = "create table city(" +
			"id integer primary key autoincrement" +
			"city_name text" +
			"city_code text" +
			"province_id integer)";
	
	//County�������
	public static final String CREATE_COUNTY = "create table county(" +
			"id integer primary key autoincrement" +
			"county_name text" +
			"county_code text" +
			"city_id integer)";
	

	public CoolWeatherOpenHelper(Context context, String name,CursorFactory factory, int version) {
		super(context, name, factory, version);
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CRATE_PROVINCE);//����Province��
		db.execSQL(CRATE_CITY);//����City
		db.execSQL(CREATE_COUNTY);//����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
	}

}
