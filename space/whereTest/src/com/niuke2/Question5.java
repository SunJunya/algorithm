package com.niuke2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
	@author:sunjunya
*/
public class Question5 {
	public static void main(String[] args) {
		String f="O";
		String m="A";
		System.out.println(chkBlood(f, m));
	}
	
	public static String[] chkBlood(String father, String mother) {
		Map<String, String> map=new HashMap<>();
		map.put("O,O","O");
		map.put("A,O", "A,O");
		map.put("A,A", "A,O");
		map.put("A,B", "A,B,AB,O");
		map.put("A,AB", "A,B,AB");
		map.put("B,O", "B,O");
		map.put("B,B", "B,O");
		map.put("B,AB", "A,B,AB");
		map.put("AB,O", "A,B");
		map.put("AB,AB", "A,B,AB");
		String key=father+","+mother;
		String value=map.get(key);
		if(value==null){
			key=mother+","+father;
			value=map.get(key);
		}
		
		String[] childen=value.split(",");
		Arrays.sort(childen);
		return childen;
    }
}
