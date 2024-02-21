package logicalprograms;

public class VowelConsonant2 {
	//2. Program to check Vowel or Consonant using switch statement

	public void myMethod() {

		char info1 = 'E';		//Input	
				
		switch (info1) {
		case 'A','E','I','O','U'  :System.out.println(info1 + " IS VOWELS");break;
		
		case 'a','e','i','o','u'  :System.out.println(info1 + " IS VOWELS");break;
		
		default : System.out.println(info1 + " IS CONSONANT");		
		}
	}

	public static void main(String[] args) {
		VowelConsonant2 obj = new VowelConsonant2();
		obj.myMethod();
	}

}
