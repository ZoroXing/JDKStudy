/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.syspro;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


/**
 * @author ZoroXing
 * 
 */
public class SystemProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pros = System.getProperties();
	
		traversalPros1(pros);
		System.out.println();
		System.out.println("****************************");
		System.out.println();
		traversalPros2(pros);
	}

	/*
	 * keySet.
	 * */
	public static void traversalPros1(Properties pros){
        Iterator<?> it = pros.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String value = pros.getProperty(key);
			System.out.println(key+" : "+value);
		}
	}
	
	/*
	 * entrySet.
	 * */
	public static void traversalPros2(Properties pros){
        Iterator<?> it = pros.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry)it.next();
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
}

/*
 * Windows System Properties :
 * 
 * java.runtime.name : Java(TM) SE Runtime Environment
 * sun.boot.library.path : D:\JDK\oracle\debug\JDK6u75\jre\bin
 * java.vm.version : 20.65-b04
 * java.vm.vendor : Sun Microsystems Inc.
 * java.vendor.url : http://www.fujitsu.com/
 * path.separator : ;
 * java.vm.name : Java HotSpot(TM) Client VM
 * file.encoding.pkg : sun.io
 * sun.java.launcher : SUN_STANDARD
 * user.country : CN
 * sun.os.patch.level : 
 * java.vm.specification.name : Java Virtual Machine Specification
 * user.dir : D:\Workspace\java\JDKStudy
 * java.runtime.version : 1.6.0_75-b08_Fujitsu_03-19-14_12:00_patch
 * java.awt.graphicsenv : sun.awt.Win32GraphicsEnvironment
 * java.endorsed.dirs : D:\JDK\oracle\debug\JDK6u75\jre\lib\endorsed
 * os.arch : x86
 * java.io.tmpdir : C:\Users\Empire\AppData\Local\Temp\
 * line.separator : 
 * 
 * java.vm.specification.vendor : Sun Microsystems Inc.
 * user.variant : 
 * os.name : Windows 7
 * sun.jnu.encoding : GBK
 * java.library.path : D:\JDK\oracle\debug\JDK6u75\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;D:/JDK/oracle/jdk1.7.0_15/bin/../jre/bin/client;D:/JDK/oracle/jdk1.7.0_15/bin/../jre/bin;D:/JDK/oracle/jdk1.7.0_15/bin/../jre/lib/i386;D:\Program\apache-maven-3.0.5\bin;D:\Program\ctags58;C:\cygwin\bin;C:\Program Files\Microsoft Visual Studio 10.0\VC\bin;D:\JDK\oracle\jdk1.7.0_15\bin;C:\Program Files\Mercurial;C:\Program Files\Git\bin;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Mercurial\;D:\Program\eclipse-jee-luna-R-win32;;.
 * java.specification.name : Java Platform API Specification
 * java.class.version : 50.0
 * sun.management.compiler : HotSpot Client Compiler
 * os.version : 6.1
 * user.home : C:\Users\Empire
 * user.timezone : 
 * java.awt.printerjob : sun.awt.windows.WPrinterJob
 * file.encoding : utf-8
 * java.specification.version : 1.6
 * java.class.path : D:\Workspace\java\JDKStudy\bin
 * user.name : Empire
 * java.vm.specification.version : 1.0
 * sun.java.command : com.nnu.syspro.SystemProperties
 * java.home : D:\JDK\oracle\debug\JDK6u75\jre
 * sun.arch.data.model : 32
 * user.language : zh
 * java.specification.vendor : Sun Microsystems Inc.
 * awt.toolkit : sun.awt.windows.WToolkit
 * java.vm.info : mixed mode
 * java.version : 1.6.0_75-debug
 * java.ext.dirs : D:\JDK\oracle\debug\JDK6u75\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
 * sun.boot.class.path : D:\JDK\oracle\debug\JDK6u75\jre\lib\resources.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\rt.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\sunrsasign.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\jsse.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\jce.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\charsets.jar;D:\JDK\oracle\debug\JDK6u75\jre\lib\modules\jdk.boot.jar;D:\JDK\oracle\debug\JDK6u75\jre\classes
 * java.vendor : FUJITSU LIMITED
 * file.separator : \
 * java.vendor.url.bug : http://www.fujitsu.com/
 * sun.io.unicode.encoding : UnicodeLittle
 * sun.cpu.endian : little
 * sun.desktop : windows
 * sun.cpu.isalist : pentium_pro+mmx pentium_pro pentium+mmx pentium i486 i386 i86 
 */

