package Unit01;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="7654";
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse of string is:"+rev);

	}

}
