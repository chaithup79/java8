package palindrome;

public class check {

	public static void main(String[] args) {

		String sentence = "This is a malayalam channel";
        String[] input = sentence.split(" ");
        for(String inp : input)
        {
        	if(isPalindrome(inp))
        	{
        		System.out.println(inp);
        	}
        }
		

	}

	public static boolean isPalindrome(String str) {
		int i1 = 0;
		int i2 = str.length() - 1;

		while (i2 > i1) {

			if(str.charAt(i1)!=str.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;

	}
}
