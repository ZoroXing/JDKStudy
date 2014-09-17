/**
 * Copyright (c) 2014 ZoroXing and/or its affiliates. All rights reserved.
 */
package com.nnu.sa;

import sun.jvm.hotspot.gc_interface.CollectedHeap;
import sun.jvm.hotspot.memory.ContiguousSpace;
import sun.jvm.hotspot.memory.DefNewGeneration;
import sun.jvm.hotspot.memory.EdenSpace;
import sun.jvm.hotspot.memory.GenCollectedHeap;
import sun.jvm.hotspot.memory.Universe;
import sun.jvm.hotspot.runtime.VM;
import sun.jvm.hotspot.tools.Tool;
/**
 * @author xingjl.fnst
 * @dateTime 2014/09/16 12:23:45
 */
public class TestSA extends Tool{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestSA sa = new TestSA();
        sa.start(args);
        sa.stop();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		VM vm = VM.getVM();
		Universe universe = vm.getUniverse();
		universe.print();
		
	    CollectedHeap heap = universe.heap();
	   
	    if ( heap instanceof GenCollectedHeap ){
	    	System.out.println("This is GenCollectedHeap.");
	    	
	    	GenCollectedHeap genHeap = (GenCollectedHeap) heap;  
	    	System.out.println("Generation:*****************************");
            int gens = genHeap.nGens();
	    	System.out.println("Gens Number:"+gens);
	    	for ( int i=0;i<gens;i++){
	    		System.out.println(genHeap.getGen(i));	
	    	}
	    	System.out.println(genHeap.perm());
	    	
	    	DefNewGeneration defNewGen = (DefNewGeneration)genHeap.getGen(0);
	    	EdenSpace engeSpace = defNewGen.eden();
	    	ContiguousSpace fromSpace = defNewGen.from();
	    	ContiguousSpace toSpace   = defNewGen.to();
	    	System.out.println("****************************************");
	    	
	    }
	}


}
