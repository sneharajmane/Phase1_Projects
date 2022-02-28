package com.phase.project;

public class Testimp implements Diamond1,Diamond2 {
	
	
	public void show() {
		Diamond1.super.show();
		Diamond2.super.show();

	}

	public static void main(String[] args) {
		
		Testimp test = new Testimp();

		test.show();
	}

}
