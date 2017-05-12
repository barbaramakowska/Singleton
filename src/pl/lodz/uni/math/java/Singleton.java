package pl.lodz.uni.math.java;

public class Singleton {
	private static Singleton instance = null;
//private static Singleton instance = new Singleton();
	private Singleton() {
		System.out.println("YES konstr");
	}

	//public static void getInstance() {
	//	System.out.println("yes getInstance");
		//return instance;
//	}

 public static Singleton getInstance() {
		System.out.println("yes getInstance");
		return instance;
	} 
	private int x;

	public void setX(int a) {
		this.x = a;
	}

	public int getX() {
		return x;
	}
//blok statyczny wywoluje sie raz na rzecz klasy
	static {
		System.out.println("yes static");
	}

//blok inicjujacy (do konstruktora)
	{
		System.out.println("yes blok inicjujacy");
	}
}

