public class reverseString {
	public static void main(String[] args) {
	String str = "Kiran Bhat";
	String reverse =  "";
	for (int i  = str.length()-1; i>=0; i--) {
		reverse = reverse+str.charAt(i);	
		}
	System.out.println("Reverse of "+str+" is "+reverse);
	
	//Added while loop to calculate reverse of string
	int strlen=str.length()-1;
	String rev_new ="";
	while(strlen >=0){
		rev_new=rev_new+str.charAt(strlen);
		strlen--;
	}
	System.out.println("Reverse of "+str+" is "+rev_new);
	}
}
