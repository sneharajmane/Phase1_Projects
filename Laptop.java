package com.phase.project;

public class Laptop {
	private Harddisk hd; // HAS A Relationship


public Laptop(Harddisk hd) {
		super();
		this.hd = hd;
	}
	public static void main(String[] args) {

		HardDisk hd = new Samsung();

		Laptop laptop1 = new Laptop(hd);

		System.out.println(laptop1.hd.size());
		System.out.println(laptop1.hd.speed());

		System.out.println(hd.HarddiskType());

		System.out.println(Harddisk.weight());


}

	}

}
