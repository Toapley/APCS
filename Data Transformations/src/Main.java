
public class Main
{
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
    
    public static final String[] TEXT_LIST = {TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5, TEXT_6, TEXT_7, TEXT_8, TEXT_9, TEXT_10};

    public static void main(String[] args)
    {
        /* There's no need to implement anything in main for this assignment
         * You can use the unit test to validate your work
         */

    }
    
    public static int maxWordLength(String[] list) {
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i<list.length; i++) {
    		if (list[0].length() > max) 
    			max = list[0].length();
    	}
    	return max;
    }
    
    
    public static String[] splitString(String sentence) {
    	return new String[5];
    }
    
    public static String[] intersectWords( String sentence1, String sentence2) {
    	return new String[5];
    }
    
    //TODO: Note:  the [0] index in the return array should always contain 0.
    public static int[] wordLengthsTally(String[] sentenceList) {
    	return new int[5];
    }
    
    public static String[] generateNGrams(String text, int size)  {
    	return new String[5];
    }
    
    

}
