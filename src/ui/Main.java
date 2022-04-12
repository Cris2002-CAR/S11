package ui;

/*
 * Grupo:
 * Cristian Cardona
 * Jesus Garces
 */

import model.Node;
import model.Tree;

public class Main {

	public static Tree t = new Tree();
	
	public static void main(String[] args) {
		
		t.add(10, "A");
		t.add(-2, "B");
		t.add(4, "C");
		t.add(15, "D");
		t.add(20, "E");
		t.add(-60, "F");
		
		t.triggerInOrder();
		System.out.println();
		t.triggerDelete(4);
		t.triggerDelete(20);
		t.triggerInOrder();
		System.out.println();
		t.add(12, "R");
		t.add(32, "H");
		t.triggerInOrder();
		System.out.println();
		
		
		
	}

}
