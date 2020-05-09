package com.song.common.utils;
/**
 * 日期工具类
 * @author 86183
 *
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	private static String getTim() {
		
		/*
		* 方法1：(10分)
		* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
		* 则返回的结果为2019-05-01 00:00:00
		*/
		Calendar cal= Calendar.getInstance();
	cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0,0,0);
	 Date beg= cal.getTime();
	 
	 SimpleDateFormat form= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	 return form.format(beg);
	 
	 
	}
	
	public static String getDateByInitMonth(String src) throws Throwable{
		/*
		给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
		* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
		* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
		*/
		Date date=null;
		
		date = new SimpleDateFormat("yyyy-MM-dd").parse(src);
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 999);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		
		
		format.parse(format.format(new Date(new Long(c.getTimeInMillis()))) );
		
		return format.format(date);	
		}
	
	
	
	
	public static void main(String[] args) throws Throwable {
		String tim = DateUtil.getDateByInitMonth("2020-5-9");
		System.out.println(tim);
	}
	 
	
}
