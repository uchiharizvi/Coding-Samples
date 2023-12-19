package com.java.sample.core.strings.e001;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableDemo {

    private final int id;
    private final String name;
    private final HashMap<String, String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    //Constructor performing deep copy
    public ImmutableDemo(int id, String name, HashMap<String, String> testMap) {
        System.out.println("Performing Deep Copy for Object initialization");
        this.id = id;
        this.name = name;
        HashMap<String, String> tempMap = new HashMap<String, String>();
        String key;
        Iterator<String> it = testMap.keySet().iterator();
        while (it.hasNext()) {
            key = it.next();
            tempMap.put(key, testMap.get(key));
        }
        this.testMap = tempMap;

    }

    /**
            * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
    /**
     public FinalClassExample(int i, String n, HashMap<String,String> hm){
     System.out.println("Performing Shallow Copy for Object initialization");
     this.id=i;
     this.name=n;
     this.testMap=hm;
     }
     */

    /**
     * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
     * @param args
     */
}
