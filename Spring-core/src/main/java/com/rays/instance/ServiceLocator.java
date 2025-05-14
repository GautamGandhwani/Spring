package com.rays.instance;

public class ServiceLocator {

	private static ServiceLocator instance;

	private ServiceLocator() {
		System.out.println("instans");
	}

	public static ServiceLocator getInstance() {

		if (instance == null) {
			instance = new ServiceLocator();
			System.out.println("in method");
		}
		return instance;
	}
}