package com.inherit.part02_inherit.after;

import java.util.Date;

public class Computer extends Product {
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	public Computer() {}
	
	public Computer(String brand, String pNumber, String pCode, String pName, int price, Date date, String cpu, int hdd,
			int ram, String os) {
		super(brand, pNumber, pCode, pName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
	@Override
	public String printInformation() {
		return super.printInformation()+","+this.cpu+","+this.hdd+","+this.ram+","+this.os;
	}
	
}
