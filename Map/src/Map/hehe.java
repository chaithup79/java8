package Map;

import java.util.Map;

public class hehe {

	public static void main(String[] args) {

		Map<Thread, StackTraceElement[]> allStackTraces = Thread.currentThread().getAllStackTraces();
		String input = "I love to code";

		String inputArray[] = input.split(" ");
		String result = "";
//	for(int i=0;i<inputArray.length;i++)
//	{
//		System.out.print(inputArray[i]);
//	}

		for (int i = 0; i < inputArray.length; i++) {
			result = result + capitalise(inputArray[i]);
		}
		System.out.println(result);

		System.out.println(allStackTraces.size());

	}

	public static String capitalise(String str) {

		String temp = str.substring(0, 1).toUpperCase();
		temp = temp + str.substring(1, str.length());
//		temp.concat(str.substring(1, str.length()));
//		System.out.print(temp);
		return temp;

	}
}
