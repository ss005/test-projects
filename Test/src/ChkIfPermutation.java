import java.util.HashSet;
import java.util.Set;

public class ChkIfPermutation {

	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "pleAo";

		System.out.println(isPermutation(s1, s2));
	}

	public static boolean isPermutation(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		Set<Character> set = new HashSet<>();

		for (Character character : s1.toCharArray()) {
			set.add(character);
		}

		for (Character character : s2.toCharArray()) {
			if (!set.contains(character))
				return false;
		}
		return true;
	}

}
