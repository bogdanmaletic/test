package com.testStruct;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Naknadno cemo da ispravimo sve sto nam treba...
 * Sve ostalo cemo da svedemo na nacin na koji nam odgovara
 * BTW ovo bi inace trebalo da predstavlja jednu od realizacija
 * strukture koja bi nam omogucila da lagano citamo parametre terena.
 * Mada u posebnom delu projekta cemo napraviti glupavu verziju, pa verziju
 * sa matricama itd...
 * @author komp
 *
 */
public class MeshStruct extends LinkedList<BasicCell> {

	public MeshStruct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MeshStruct(Collection<? extends BasicCell> arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	void printSize() {
		System.out.println("Ok ovo je velicina.. " + this.size());
	}
	
}
