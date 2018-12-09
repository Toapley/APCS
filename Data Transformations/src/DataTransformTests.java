import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Version #2 of unit tests
// Contact the teacher if any of these tests are not correct.
class DataTransformTests {

	@Test
	void testMaxWordLengthSimple() {

		// Create a test array
		String input[] = { "Beet" };
		int expected = 4;

		// Use assertEquals to compare numbers;
		assertEquals(expected, Main.maxWordLength(input));

	}

	@Test
	void testsplitStringHandout2() {

		// This is from the handout.
		String input = Main.TEXT_2;
		String expected[] = {"A","long","time","ago","in","a","galaxy","far,","far","away..."};
		
		// Use assertEquals to compare arrays
		assertArrayEquals(expected, Main.splitString(input) );
		
		assertEquals(7, Main.maxWordLength(Main.splitString(input)));

	}
	
	@Test
	void testwordLengthsTallyHandout1() {

		// This is from the handout.
		String input = Main.TEXT_1;
		String expected[] = {"Star","Wars:","Episode","VII","The","Force","Awakens"};
		
		// Use assertEquals to compare arrays
		assertArrayEquals(expected, Main.splitString(input) );

	}
	
	@Test
	void testWordLengthsTallyHandout() {

		// This is from the handout.
		String input[] = Main.TEXT_LIST;
		int expected[] = {0, 9, 25, 42, 43, 26, 13, 11, 4, 2, 3, 1 };

		// Use assertEquals to compare arrays
		assertArrayEquals(expected, Main.wordLengthsTally(input) );

	}

	@Test
	public void testIntersectWords_oneIntersection() {
		String sentence1 = "aaa bbb ccc";
		String sentence2 = "ccc ddd eee";
		String[] expected = { "ccc" };
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}

	@Test
	public void testIntersectWords_multipleIntersections() {
		String sentence1 = "this is cool";
		String sentence2 = "how cool is this";
		String[] expected = { "this", "is", "cool" };
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}
	

	@Test
	public void testIntersectWords_Handout() {
		String sentence1 = Main.TEXT_1;
		String sentence2 = Main.TEXT_9;
		String[] expected = {};
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}

	@Test
	public void testIntersectWords_intersectionsAreUnique() {
		String sentence1 = "this this is is is cool";
		String sentence2 = "how cool is this";
		String[] expected = { "this", "is", "cool" };
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}

	@Test
	public void testIntersectWords_noIntersections() {
		String sentence1 = "aaa bbb ccc";
		String sentence2 = "ddd eee fff";
		String[] expected = {};
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}

	@Test
	public void testIntersectWords_emptyStrings() {
		String sentence1 = "";
		String sentence2 = "";
		String[] expected = {};
		assertArrayEquals(expected, Main.intersectWords(sentence1, sentence2));
	}

	@Test
	public void testSplitString_oneWord() {
		String[] expected = { "abc" };
		assertArrayEquals(expected, Main.splitString("abc"));
	}

	@Test
	public void testSplitString_twoWords() {
		String[] expected = { "a", "b" };
		assertArrayEquals(expected, Main.splitString("a b"));
	}

	@Test
	public void testSplitString_moreWords() {
		String[] expected = { "a", "quick", "brown", "fox!" };
		assertArrayEquals(expected, Main.splitString("a quick brown fox!"));
	}

	@Test
	public void testSplitString_emptyString() {
		String[] expected = {};
		assertArrayEquals(expected, Main.splitString(""));
	}

	@Test
	public void testSplitString_extraSpaces() {
		String[] expected = { "a", "b", "c" };
		//Note:  if this test is failing for you, try adding some .trim calls
		//in your main logic to get rid of extra spaces.
		assertArrayEquals(expected, Main.splitString(" a  b   c   "));
	}

	@Test
	public void testMaxWordLength_oneWord() {
		String[] arr = { "abc" };
		assertEquals(3, Main.maxWordLength(arr));
	}

	@Test
	public void testMaxWordLength_twoWords() {
		String[] arr1 = { "a", "bc" };
		assertEquals(2, Main.maxWordLength(arr1));
		String[] arr2 = { "ab", "c" };
		assertEquals(2, Main.maxWordLength(arr2));
	}

	@Test
	public void testMaxWordLength_twoWordsSameLength() {
		String[] arr = { "abc", "def" };
		assertEquals(3, Main.maxWordLength(arr));
	}

	@Test
	public void testMaxWordLength_threeWords() {
		String[] arr1 = { "a", "bc", "def" };
		assertEquals(3, Main.maxWordLength(arr1));
		String[] arr2 = { "a", "bcd", "ef" };
		assertEquals(3, Main.maxWordLength(arr2));
		String[] arr3 = { "abc", "de", "fgh" };
		assertEquals(3, Main.maxWordLength(arr3));
	}

	@Test
	public void testMaxWordLength_emptyList() {
		String[] arr = {};
		assertEquals(0, Main.maxWordLength(arr));
	}

	@Test
	public void testMaxWordLength_emptyString() {
		String[] arr = { "" };
		assertEquals(0, Main.maxWordLength(arr));
	}

	@Test
	public void testWordLengthsTally() {

		String ONE = "a b c d";
		String TWO = "ab cd ef";
		String FOUR = "abc, defg";
		String SIX = "abcde!";
		String[] sentences = { ONE, TWO, FOUR, SIX };
		int expected[] = {0,4,3,0,2,0,1};
		assertArrayEquals(expected, Main.wordLengthsTally(sentences));

	}

	@Test
	public void testGenerateNGrams_extraCredit_() {
		String[] expected1 = { "a", "b", "c" };
		assertArrayEquals(expected1, Main.generateNGrams("a b c", 1));
		String[] expected2 = { "a", "b", "c", "a b", "b c" };
		assertArrayEquals(expected2, Main.generateNGrams("a b c", 2));
		String[] expected3 = { "a", "b", "c", "a b", "b c", "c d", "a b c", "b c d", "a b c d" };
		assertArrayEquals(expected3, Main.generateNGrams("a b c d", 4));
	}

	@Test
	public void testGenerateNGrams_extraCredit_limitWindowSize() {
		String[] expected1 = { "a", "b", "c", "a b", "b c", "a b c" };
		assertArrayEquals(expected1, Main.generateNGrams("a b c", 100));
	}

	@Test
	public void testGenerateNGrams_extraCredit_emptyInput() {
		String[] expected = {};
		assertArrayEquals(expected, Main.generateNGrams("", 5));
	}

	@Test
	public void testGenerateNGrams_extraCredit_invalidWindowSize() {
		String[] expected = {};
		assertArrayEquals(expected, Main.generateNGrams("a b c", 0));
		assertArrayEquals(expected, Main.generateNGrams("a b c", -1));
	}

}
