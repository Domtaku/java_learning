public class Word5 {
    public static String showLetters(String word, String guesses){
        String string = "";
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < guesses.length(); j++){
                if(word.charAt(i) == guesses.charAt(i)){
                    string += word.charAt(i);
                }
                else{
                    string += "_";
                }
            }
            }
        return string;
    }
}
