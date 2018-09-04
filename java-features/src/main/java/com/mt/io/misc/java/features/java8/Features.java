/**
 * 
 */
package com.mt.io.misc.java.features.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

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
		defaultInterfaceMethdImpl();

		lambdaExp();
	}

	private static void lambdaExp() {
		List<String> list = Arrays.asList("peter", "anan", "mark", "susam");
		log(list);
		Collections.sort(list, (String a, String b) -> {
			return a.compareTo(b);
		});
		
		log(list);
		
		/*
		 * 函数体只有1行
		 */
		Collections.sort(list, (String a, String b) -> b.compareTo(a));
		
		log(list);
		
		/*
		 * 函数体只有1行
		 */
		Collections.sort(list, (a, b) -> b.compareTo(a));
		
		
		Formula formula = (a) -> a * 50;
		
		log(formula.calculate(100));

		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		log(converter.convert("123"));
		
		/*
		 * 静态方法引用
		 */
		converter = Integer::valueOf;
		log(converter.convert("456"));
		
		/*
		 * 实例方法引用
		 */
		String a = "789456987";
		converter = a::indexOf;
		log(converter.convert("456"));
	}

	static interface Converter<F, T>{
		T convert(F from);
	}
	/**
	 * 默认的接口方法实现
	 */
	private static void defaultInterfaceMethdImpl() {
		Formula formula = new Formula() {

			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}

		};

		log(formula.calculate(100));
		log(formula.sqrt(16));
	}

	interface Formula {
		double calculate(int a);

		default double sqrt(int a) {
			return Math.sqrt(a);
		}
	}

	static void log(Object msg) {
		System.out.println(msg);
	}
}
