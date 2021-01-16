package ar.innerclass;

class Outside {
	int a = 0;
	
	class Inside {
		int b = 5;
	}
	
	static class StaticInside {
		int c = 10;
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
		Outside o = new Outside();
		Outside.Inside i = o.new Inside();
		System.out.println(o.a + " " + i.b);
		
		Outside.StaticInside si = new Outside.StaticInside();
		System.out.println(si.c);
	}

}
