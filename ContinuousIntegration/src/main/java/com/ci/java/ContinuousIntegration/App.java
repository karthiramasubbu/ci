package com.ci.java.ContinuousIntegration;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
    	String dateStr = "2014-01-26T05:59:59.000Z";
    	dateStr = dateStr.substring(0, 10);
    	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    	Date date = formatter.parse(dateStr);
    	System.out.println(date);
    	System.out.println("jenkins test");
    	
        
        
        
        
    }
}
