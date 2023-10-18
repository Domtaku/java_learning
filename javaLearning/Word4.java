public class Word4 {
    public static String showLetter(String word, char letter){
        String string = "";
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                string += word.charAt(i);
            }
            else{
                string += "_";
            }
        }
        return string;
    }
}
