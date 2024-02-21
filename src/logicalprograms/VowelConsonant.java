package logicalprograms;

public class VowelConsonant {
	
	char a = 'A';
	char b = 'E';
	char c = 'I';
	char d = 'O';
	char e = 'U';

	char f = 'X';		//Input 

	public void nsm() {	
		if (f==a) {
			System.out.println("THE ALPHABET IS VOWEL");
		}
		else if (f==b){
			System.out.println("THE ALPHABET IS VOWEL");
		}
		else if(f==c){
			System.out.println("THE ALPHABET IS VOWEL");
		}
		else if(f==d){
			System.out.println("THE ALPHABET IS VOWEL");
		}
		else if(f==e){
			System.out.println("THE ALPHABET IS VOWEL");
		}
		else if(f>'A' || f<'Z'){
			System.out.println("THE ALPHABET IS CONSONANT");
		}
		else{
			System.out.println("INVALID INPUT");
		}
	}	
	public static void main(String[] args) {
		VowelConsonant obj = new VowelConsonant();
		obj.nsm();
		// a, e, i, o, u 
	}
}
