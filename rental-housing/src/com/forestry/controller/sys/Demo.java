package com.forestry.controller.sys;

import org.openjdk.jol.info.ClassLayout;

public class Demo {

	Object object = new Object();
	Fruit f = new Fruit();

	public static void main(String[] args) {
		 System.out.print(ClassLayout.parseClass(Fruit.class).toPrintable());
		 System.out.print(ClassLayout.parseClass(Object.class).toPrintable());
		
		 String[] strArray = new String[0];
		 System.out.println(ClassLayout.parseClass(strArray.getClass()).toPrintable());
/*
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			newApple();
		}
		System.out.println("take time:" + (System.currentTimeMillis() - startTime) + "ms");*/
	}

	public static void newApple() {
		new Apple();
	}

}

class Fruit extends Object {

	private int size;

}

class Apple extends Fruit {
	private int size;
	private String name;
	private Apple brother;
	private long create_time;

}
