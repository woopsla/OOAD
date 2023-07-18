package org.acme;

class Foo {
	private String x = null;
	
	public Foo(String val) {
		x = val;
	}
	public int length() {
		System.out.println("Foo");
		return x.length();
	}
}

class Bar extends Foo {
	private int cache = 0;
	public Bar(String val) {
		super(val);
		cache = val.length();
	}
	
	public int length() {
		System.out.println("Bar");
		return cache;
	}
}

public class Demo {
	public static void main(String... args) {
		Foo foo = new Foo("this is a sample test string!");

		for (int i = 0; i < 5; i ++)
			System.out.println("length = " + foo.length());

		System.out.println("... Use Bar instead of Foo ...");

		foo = new Bar("this is a sample test string!");

		for (int i = 0; i < 5; i ++)
			System.out.println("length = " + foo.length());
	}
}
