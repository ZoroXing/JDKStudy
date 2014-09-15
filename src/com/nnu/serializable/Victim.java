/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.serializable;
import java.io.*;

/**
 * @author xingjl.fnst
 * @dateTime 2014/09/09 17:25:00
 */
public class Victim implements Serializable {
    public volatile Object aaaa = "AAAA"; // must be volatile...
    private final Object aabb = new Show(this);
    public Object bbbb = "BBBB";
}
class Show implements Serializable {
    private final Victim victim;
    
    public Show(Victim victim) {
        this.victim = victim;
    }
    
    private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException
    {
        in.defaultReadObject();
        Thread thread = new Thread(new Runnable() { public void run() {
            for (;;) {
                Object a = victim.aaaa;
                if (a != null) {
                    System.out.println("Show@@@ "+victim+" victim.aaaa@@@ "+a);
                    break;
                }
            }
        }});
        thread.start();

        // Make sure we are running compiled whilst serialisation is done interpreted.
        try {
            Thread.sleep(1000);
        } catch (java.lang.InterruptedException exc) {
            Thread.currentThread().interrupt();
        }
    }
}
