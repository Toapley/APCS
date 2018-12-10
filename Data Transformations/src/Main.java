import java.util.Arrays;

public class Main {
	public static final String TEXT_1 = "Star Wars: Episode VII The Force Awakens";
	public static final String TEXT_2 = "A long time ago in a galaxy far, far away...";
	public static final String TEXT_3 = "There's been an awakening. Have you felt it? The Dark side, and the Light.";
	public static final String TEXT_4 = "It's true. All of it. The Dark Side, the Jedi. They're real.";
	public static final String TEXT_5 = "The Force is strong in my family. My father has it. I have it. My sister has it. You have that power, too.";
	public static final String TEXT_6 = "I have to remind myself that some birds aren't meant to be caged. Their feathers are just too bright.";
	public static final String TEXT_7 = "Remember Red, hope is a good thing, maybe the best of things, and no good thing ever dies.";
	public static final String TEXT_8 = "Life is like a box of chocolates. You never know what you’re gonna get.";
	public static final String TEXT_9 = "I think this is the beginning of a beautiful friendship";
	public static final String TEXT_10 = "This is your last chance. After this, there is no turning back. "
			+ "You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe. "
			+ "You take the red pill, you stay in Wonderland and I show you how deep the rabbit hole goes.";

	public static final String[] TEXT_LIST = { TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5, TEXT_6, TEXT_7, TEXT_8, TEXT_9,
			TEXT_10 };

	public static String getFirstWord(String input) {

		int i = input.indexOf(' ');
		if (i == -1)
			return input;
		return input.substring(0, i);

	}

	public static String skipFirstWord(String input) {
		int i = input.indexOf(' ');
		if (i == -1)
			return "";
		return input.substring(i + 1);
	}

	public static String[] addToArray(String[] arr, String addString) {

		String tmp[] = Arrays.copyOf(arr, arr.length + 1);
		tmp[tmp.length - 1] = addString;
		return tmp;

	}

	public static boolean arrayContains(String[] arr, String findString) {
		for (String s : arr) {
			if (s.equals(findString))
				return true;
		}
		return false;
	}


	public static int maxWordLength(String[] list) {
		int max = Integer.MIN_VALUE;

		if (list.length == 0)
			return 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i].length() > max)
				max = list[i].length();
		}
		return max;
	}

	public static String[] splitString(String sentence) {

		String tmp[] = new String[0];
		sentence = sentence.trim();

		if (sentence.length() == 0)
			return tmp;

		while (true) {

			String tok = getFirstWord(sentence).trim();
			// System.out.println("Found " + tok);
			tmp = addToArray(tmp, tok);
			sentence = skipFirstWord(sentence).trim();

			if (sentence.length() == 0)
				break;
		}
		return tmp;
	}

	public static String[] intersectWords(String sentence1, String sentence2) {

		String s1[] = splitString(sentence1);
		String s2[] = splitString(sentence2);
		String tmp[] = new String[0];

		for (String s : s1) {
			if (arrayContains(s2, s) && !arrayContains(tmp, s)) {
				tmp = addToArray(tmp, s);
			}
		}

		return tmp;
	}

	// TODO: Note: the [0] index in the return array should always contain 0.
	public static int[] wordLengthsTally(String[] sentenceList) {

		// find max length
		int max = -1;
		for (String s : sentenceList) {
			String[] sTmp = splitString(s);
			for (String s2 : sTmp) {
				if (s2.length() > max)
					max = s2.length();
			}
		}

		int[] tmp = new int[max + 1];
		for (String s : sentenceList) {
			String[] sTmp = splitString(s);
			for (String s2 : sTmp) {
				tmp[s2.length()]++;
			}			

		}

		return tmp;

	}
	
	
	// Note:  Not fully done...
	public static String[] generateNGrams(String text, int size) {
		
		String words[] = splitString(text);
		
		String tmp[] = new String [0];

		for (int i = 1 ; i<=size;i++)
			tmp = generateSpecificGrams(words, tmp,i);	
						
		return tmp;
	}
	
	public static void main(String[] args) {
		/*
		 * There's no need to implement anything in main for this assignment You can use
		 * the unit test to validate your work
		 */
		
		System.out.println(Arrays.toString(Main.generateNGrams("a b c", 2)));

	}
	
	
	private static String[] generateSpecificGrams(String[] words, String arrayToAdd[], int gramSize) {
		
		
		for(int idx = 0; idx<words.length;idx++) {
			
			String s = words[idx];
			boolean flag = false;
			for(int j=2; j<=gramSize && idx + j -1 < words.length;j++) {
				s += " " + words[idx + j -1];
				if (j == gramSize) flag = true;
			}			
			
			if (flag || gramSize == 1) arrayToAdd = addToArray(arrayToAdd, s);
		}
		
		
		
		return arrayToAdd;
		
	}

}
