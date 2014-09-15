/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.serializable;
import java.io.*;

/**
 * @author xingjl.fnst
 * @dateTime 2014/09/09 17:23:47
 * @summary  http://hg.openjdk.java.net/jdk7u/jdk7u/jdk/log?rev=6966692
 */
public class Bug6966692 {

	public static void main(String[] args) throws Exception {
        attack(setup());
    }
	
    /** Returned data has Victim with two aaaa fields. */
    private static byte[] setup() throws Exception {
        Victim victim = new Victim();
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(victim);
        out.close();
        byte[] data = byteOut.toByteArray();
        String str = new String(data, 0); // hibyte is 0
        str = str.replaceAll("bbbb", "aaaa");
        str.getBytes(0, data.length, data, 0); // ignore hibyte
        return data;
    }
    
    
    private static void attack(byte[] data) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));
        Victim victim = (Victim)in.readObject();
        System.out.println("Bug6966692@@@ "+victim+" victim.aaaa@@@ "+victim.aaaa);
    }
}
