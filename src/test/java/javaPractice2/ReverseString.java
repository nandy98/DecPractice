package javaPractice2;

public class ReverseString {

	public static void main(String[] args) {
		String str="Nandlal";

		String rev="";
		int n = str.length()-1;
		for(int i=n;i>=0;i--){

		rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
