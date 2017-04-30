/**
 * File Name: AppBasics.java<br>
 * Abdulrab, Ala<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Apr 29, 2017
 */
package com.sqa.ala.helpers;

import java.util.*;

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String name) {
		System.out.println("Thanks for using my app " + name);
	}

	public static String greetUser(String appName) {
		// String name;
		System.out.println("welcome to the " + appName);
		System.out.println("Could I get your name:");
		return scanner.nextLine();
		// return name;
	}

	public static int requestInt(String question) {
		System.out.println(question);
		String input = scanner.nextLine();
		int value = Integer.parseInt(input);
		return value;
	}
}
