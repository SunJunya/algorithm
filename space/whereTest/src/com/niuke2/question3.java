package com.niuke2;
/**
	@author:sunjunya
*/
public class question3 {

	public static void main(String[] args) {
		String string="A%sC%sE";
		char[] replace={'B','D','F'};
		System.out.println(formatString(string, string.length(), replace, replace.length));
	}
	 public static String formatString(String A, int n, char[] arg, int m) {
		 String[] strings=A.split("%s");
		 String B="";
		 int i;
		 for(i=0;i<strings.length;i++){
			 if(strings[i]==null){
				 B=B+arg[i];
			 }else{
				 B=B+strings[i]+arg[i];
			 }
		 }
		 if(i<arg.length){
			 String str=String.valueOf(arg, i, arg.length-i);
			B=B.concat(str);
		 }
		 
		return B;
	 }
	 
	 public static String formatString2(String A, int n, char[] arg, int m) {
		 	int i=0;
			while(A.contains("%s"))
			{
				A=A.replaceFirst("%s", String.valueOf(arg[i]));
				i++;
			}
			if(i<arg.length){
				String str=String.valueOf(arg, i, arg.length-i);
				A=A.concat(str);
			}
			return A;
	}		
}
