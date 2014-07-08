package org.svenehrke.moduleapp.app;

import org.svenehrke.moduleapp.lib1.Greeter;

public class App {

	public static void main(String[] args) {

		String greeting = new Greeter().greet("sven");

		System.out.println("greeting = " + greeting);
	}
}
