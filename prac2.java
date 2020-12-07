public class Main
{
	public static void main(String[] args) {
		String s="Hello";
		String s1="World";
		String s2= s+s1;
		StringBuilder sr = new StringBuilder();
		sr.append(s2);
		System.out.println(sr.reverse());
	}
}