package org.com.fisco;

import java.io.IOException;

public class WePDRService {

    static {
    	try {
			NativeUtil.loadLibraryFromJar("/librust.so");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static int add(int a, int b)
    {
    	return JavaDemo.add(a, b);
    }
    public static String hello(String str)
    {
    	return JavaDemo.hello(str);
    }
    public static Person getPerson(String name, int age)
    {
    	return JavaDemo.getPerson(name, age);
    }

}