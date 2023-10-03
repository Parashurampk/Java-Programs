package Programs;/*

 ======================STRING PGMS===========================
public class String_Reverse {

	public static void main(String[] args) {

		String str = "hello there";
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--)  
		{
			rev = rev + str.charAt(i); 
		}
		System.out.println("Reversed word is :" + rev);
	}
}
===========================================================
public class String_ReverseSentence {

	public static void main(String[] args) {
		String s[] = "i am programer ".split(" ");
		String rstr = "";
		for (int i = s.length - 1; i >= 0; i--) {
			rstr += s[i] + " ";
		}
		System.out.println(rstr);
	}
}
===========================================================
public class String_ReverseEachWord_char {

	public static void main(String[] args) {

		String str[] = "hello there".split(" ");
		String rstr = "";

		for (String wd : str) {
			String rword = "";

			for (int i = wd.length() - 1; i >= 0; i--) {
				rword = rword + wd.charAt(i);
			}

			rstr = rstr + rword + " ";
		}
		System.out.println(rstr);
	}
}
===========================================================
package Programs2;
import java.util.Scanner;
public class String_AlphaNumeric_Seperate_Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String variable;
		System.out.print("Enter Variable:");
		variable = sc.next();
		Separate(variable);
	}
	public static void Separate(String str) {
		String number = "";
		String letter = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {

			char a = str.charAt(i);

			if (Character.isDigit(a)) {
				number = number + a;
			} else if (Character.isLetter(a)) {
				letter = letter + a;
			} else {
				symbol = symbol + a;
			}
		}
		System.out.println("Alphabets in string:" + letter);
		System.out.println("Numbers in String:" + number);
		System.out.println("Symbols in String:" + symbol);
	}
}
===========================================================
public class String_Pallindrome {
	public static void main(String[] args) {
		String str = "Radar", reverseStr = "";
		int strLength = str.length();
		{
			for (int i = (strLength - 1); i >= 0; --i) {
				reverseStr = reverseStr + str.charAt(i);
			}

			if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
				System.out.println(str + " is a Palindrome String.");
			} else {
				System.out.println(str + " is not a Palindrome String.");
			}
		}
	}
}
===========================================================
import java.util.HashSet;
import java.util.Set;
public class String_Duplicate_word {

	public static void main(String[] args) {
		String s1 = "Hi, I am Hritik and I am a programmer";
		String[] words = s1.split("\\W"); // splitting words using regex

		Set<String> set = new HashSet<>();
		{
			for (int i = 0; i < words.length - 1; i++) {

				for (int j = 1; j < words.length; j++) {
					
						if (words[i].equals(words[j]) && i != j) {
						set.add(words[i]);
					}
				}
			}
			System.out.println(set);
		}
	}
}
===========================================================
public class String_Occurrencecount {

	public static void main(String[] args) {

		String string = "Spring is but but so is winter";
		String word = "but";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			if (word.equals(temp[i]))
				count++;
		}
		System.out.println("The string is: " + string);
		System.out.println(count);
	}
}
===========================================================
public class String_Count_word {

	public static void main(String[] args) {

		String s = "Hello World";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
        --------------------OR------------------------------------------------------
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println("Total words :"+countWords);
	}
}
=====================CHARACTER PGMS=====================================
public class Character_Count {

	public static void main(String[] args) {

		String s1 = "The best of both worlds";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {      // Counts each character except space
			if (s1.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in a string: " + count);
	}
}
=====================================
import java.util.HashMap;
public class Character_Occurence {

	public static void main(String[] args) {

		String str = "SSDRRRTTYYTYTR";
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = str.length() - 1; i > 0; i--) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hMap);
	}
}
=====================================
public class Characters_Duplicate {

	public static void main(String[] args) {
		String str = "welcomelo";
		int cnt = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[j]);
					cnt++;
					break;
	}}}}}
==============Number PGMS====================
public class Number_CountDigits {

	public static void main(String[] args) {

		int num = 12345;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number of digits:" + count);
	}
}
================================================
public class Number_Duplicate {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
========================================================
public class Number_EvenAndOddCount {

	public static void main(String[] args) {
		
		int num=12345156;
		int even_count=0;
		int odd_count=0;
		
		while (num>0) {
			int rem=num%10;
			if (rem%2==0)
			{
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
		}
			System.out.println("Number of even Numbers: "+even_count);
			System.out.println("Number of odd Numbers: "+odd_count);
			
		}
	}
========================================================
public class Number_Factorial {

	public static void main(String[] args) {

		int num = 5;
		long factorial = 1;
		for (int i = 1; i < num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
      }
}
========================================================
import java.util.Scanner;
public class Number_Pallindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (org_num == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
==============================================
public class Number_Prime {
	public static void main(String[] args) {

		int num = 29;
		int count = 0;
		if (num > 1)
			for (int i = 1; i <= num; i++)
				if (num % i == 0)
					count++;
		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
=============================================
public class Number_Reverse {
	public static void main(String[] args) {
		int num = 987654;
		int rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println(rev);
	}
}
===============================================
public class Number_SumOfDigits {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of didgits is: "+sum);
	}
}
===============================================
public class Number_Swap {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		System.out.println("Before-----" + a + "  " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After-----" + a + "  " + b);
	}
}
===================ARRAY PGMS============================
public class Array_Max_MIn {
	public static void main(String[] args) {
		int[] items = { 10, 0, 30, 2, 7, 5, 90, 76, 100, 45, 55 };
		
		int max = items[0];
		int min = items[0];

		for (int i = 1; i < items.length; i++) {
		  if (items[i] > max) {
		    max = items[i];
		  }
		  else if (items[i] < min) {
		    min = items[i];
		  }
		}

		System.out.println(max);	
		System.out.println(min);

	}}
====================================================
import java.util.*;
public class Array_NegavtiveFirst_PositiveSecond {

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		move(arr);
		for (int e : arr)
			System.out.print(e + " ");
	}

	public static  void move(int[] arr) {
		Arrays.sort(arr);
	}
}
=====================================================
public class Array_Reverse {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
=================================================
import java.util.Arrays;
import java.util.Collections;
public class Array_Sort_ReverseOrder {
	public static void main(String[] args) {
	
			Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

			// Sorts arr[] in descending order using
			// reverseOrder() method of Collections class
			// in Array.sort() as an argument to it
			Arrays.sort(arr, Collections.reverseOrder());

			// Printing the array as generated above
			System.out.println("Modified arr[] : " + Arrays.toString(arr));
		}
	}
}
=================================================
public class Array_Sorting {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 78, 34, 1, 3};
		System.out.println("Array elements after sorting:");

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
}}}
=================================================
import java.util.Arrays;
public class Array_Sortingwith_Sort {

	public static void main(String[] args) {

		int[] arr = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {     //0<7
			System.out.println(arr[i]);
			
			
		}
	}
}
=================================================
public class Array_SumOfElements {
	public static void main(String[] args) {	
		int a[]= {5,7,9,16};
		int sum=0;
		for(int i=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is :"+sum);
	}
}
=================================================
import java.util.Arrays;
public class Arrays_Equals {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 20, 5, -95, 43, 17 };
		int[] arr2 = new int[] { 20, 5, -95, 43, 12 };
		System.out.println(Arrays.equals(arr1, arr2));
	}
}

========================================================



*/



