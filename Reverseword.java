public class Reverseword {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World from Java";
        String output = reverseEachWord(input);
        System.out.println("Reversed: " + output);
    }
}
    

