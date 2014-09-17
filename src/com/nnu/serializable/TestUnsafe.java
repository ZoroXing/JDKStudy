/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.serializable;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * @author xingjl.fnst
 * @dateTime 2014/09/16 16:48:17
 * @summary   如果尝试创建Unsafe类的实例，基于以下两种原因是不被允许的。
 *            1）、Unsafe类的构造函数是私有的；
 *            2）、虽然它有静态的getUnsafe()方法，但是如果你尝试调用Unsafe.getUnsafe()，会得到一个SecutiryException。
 *               这个类只有被JDK信任的类实例化。
 *            但是这总会是有变通的解决办法的，一个简单的方式就是使用反射进行实例化：
 */
public class TestUnsafe {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Field f = Unsafe.class.getDeclaredField("theUnsafe"); //Internal reference  
		f.setAccessible(true);  
		Unsafe unsafe = (Unsafe) f.get(null);  
		
		Student stu = new Student();
		System.out.println(stu.name);
		long offset = unsafe.objectFieldOffset(Student.class.getDeclaredField("name"));
		unsafe.putObject(stu, offset, "jian");
		System.out.println(stu.name);
	}
	
}

class Student{
	
	String name = "xing";
	int age = 100;
}
