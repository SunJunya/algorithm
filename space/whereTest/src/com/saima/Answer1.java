package com.saima;

import java.util.Scanner;

/**
	@author:sunjunya
*/
public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            long res = 0;
            for (int j = 0; j < s.length(); j ++) {
                res = res * 26 + s.charAt(j) - 'a';
            }
            System.out.println(res);
        }
        sc.close();
	}

}
