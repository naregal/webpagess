package com.prodapt.interfacepro;

public class TestDrawable {
public static void main(String[] args) {
		int width = 10;
		int hight = 25;
int base = width + hight;
		Drawable d2 = () -> {
			System.out.println(" triangle base is:" + base);
		};
		d2.design();
	}
}
