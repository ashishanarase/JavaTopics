package mathematics;

public class mathematicex1 {

	public void swarub() {

		String velocity = "Ashish";
		String amar_sir = "_How are you guys ";

		int l = velocity.length();
		System.out.println(l);

		String a = velocity.trim();
		System.out.println(a);

		String b = amar_sir.trim();
		System.out.println(a.concat(b));

		String g = velocity.toUpperCase();
		System.out.println(g);

		String h = velocity.toLowerCase();
		System.out.println(h);

		char j = velocity.charAt(5);
		System.out.println(j);

		String k = velocity.substring(1,5);
		System.out.println(k);

		boolean s=g.equalsIgnoreCase(h);
		System.out.println(s);

		boolean z =g.equals(h);
		System.out.println(z);

		boolean x =velocity.startsWith("A");
		System.out.println(x);

		boolean y =velocity.endsWith("h");
		System.out.println(y);	
	}

	public static void main (String [] args) {

		mathematicex1 object = new mathematicex1();
		object.swarub();

	}
}
