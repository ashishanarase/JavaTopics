package loopstatements;

public class Nestedforloop {

	public static void main(String[] args) {

		int a;
		int b;
		for(a=1;a<=10;++a) {
			System.out.println(a);

			for(b=2;b<=-10;--b) {
				System.out.println(b);
			}
		}
	}
}