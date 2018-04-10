package com.where.test;
/**
	@author:sunjunya
*/
public class QuestionTwo {

	public static void main(String[] args) {
		String string="A%sC%sE";
		int n=string.length();
		String string1,string2;
		char[] c={'B','D','F'};
//		string1=myReplace(string,c);
		string2=mySpilt(string,c);
		
		System.out.println(string2);
		
		
	}

	private static String mySpilt(String string, char[] c) {
		StringBuffer reString=new StringBuffer();
		String[] strArr=string.split("%s");
		System.out.println(strArr.length);
		int i=0;
		for(String str:strArr){
			if(i<c.length){
				if(str.length()==0){
					reString.append(c[i]);
					i++;
				}
				else{
					reString.append(str+c[i]);
					i++;
				}
			}else{
				reString.append(str);
			}
			
		}
		if(i<c.length-1){
			String cString=String.valueOf(c, i, c.length-1-i);
			reString.append(cString);
		}
		return reString.toString();
	}

	private static String myReplace(String string, char[] c) {
		int index;
		int len=c.length;
		int i=0;
		while(string.contains("%s")&&i<len){
			String  replaceMent=String.valueOf(c[i]);
			string=string.replaceFirst("%s",replaceMent );
			i++;
			len--;
		}
		if(len>0){
			String stradd=String.copyValueOf(c, i, len);
			string =string+stradd;
		}
		return string;
	}

}
