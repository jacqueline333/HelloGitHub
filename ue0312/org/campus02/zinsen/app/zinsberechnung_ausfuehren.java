package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.zinsberechnung;

public class zinsberechnung_ausfuehren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		zinsberechnung k = new zinsberechnung(10); 
		
		System.out.println(k.zinsen(300, 5));

	}

}
