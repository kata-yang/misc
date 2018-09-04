/**
 * 
 */
package com.mt.io.misc.java.features.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author yanglei, ylei.yanglei@outlook.com
 * @version 1.0.1, 2018年9月4日
 * @since 2018年9月4日
 * 
 */
public class Features {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();

		int[] b = {1,2,3,4,5};
		
		/*String name="123";
		String age = "456";
		
		String[] c = {name:"xxx", age:""};*/

		
		switchCase("add");
	}

	static void switchCase(String action) {

		switch (action) {
			case "add":
				log(String.format("add action: %s", action));
				break;
			case "update":
				log(String.format("update action: %s", action));
				break;
			case "query":
				log(String.format("query action: %s", action));
				break;
			case "delete":
				log(String.format("delete action: %s", action));
				break;
			default:
				log(String.format("unknown action: %s", action));
		}
	}
	
	static void log(String msg){
		System.out.println(msg);
	}
}
