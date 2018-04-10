package com.where.test;

import java.util.ArrayList;
import java.util.List;

/**
	@author:sunjunya
*/
public class QuestionThree {

	public static void main(String[] args) {
		String[] strings={"nowcoder","hello","now"};
		String[] keys={"coder","now"};
		List<Integer> list=find(strings,keys);
		System.out.println(list);
	}

	private static List<Integer> find(String[] strings, String[] keys) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<strings.length;i++){
			for(int j=0;j<keys.length;j++){
				if(strings[i].contains(keys[j])){
					list.add(i);
					break;
				}
			}
		}
		return list;
	}

}
