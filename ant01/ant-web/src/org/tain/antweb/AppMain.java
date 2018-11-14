package org.tain.antweb;

public class AppMain {

	public static void main(String[] args) {
		System.out.println(">>>>> " + new Object() {}.getClass().getEnclosingClass().getName());
	}
}
