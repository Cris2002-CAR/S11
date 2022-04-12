package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeTest {
	private Tree x;

	@Test
	public void setupScenary2() {
		x=new Tree();

		int key=7;
		int value=3;
		int key1=10;
		int value1=4;
		int key2=84;
		int value2=1;

		x.add(key, value);
		x.add(key1, value1);
		x.add(key2, value2);
	}
	@Test
	public void setupScenary3() {
		x=new Tree();
	}

	@Test
	public void addTree() {
		setupScenary3();
		int key=5;
		int value=3;

		x.add(key, value);
		Node y=x.triggerSearch(key);

		assertEquals(y.getKey(), key);
		assertEquals(y.getValue(), value);
	}

	@Test
	public void printTree() {
		setupScenary2();

		x.triggerInOrder();

	}

	@Test
	public void delete() {
		setupScenary2();

		int key=10;
		int value=78;

		x.add(key, value);
		x.triggerDelete(key);
		
		Node y=x.triggerSearch(key);
		assertEquals(y, null);
	}
}
