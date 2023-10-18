public class Word3 {
    public static boolean allDone(String word, String guess){
        int i = 0;
        while(i < word.length()){
            if(guess.indexOf(word.charAt(i)) == -1){
                return false;
            }
            i = i + 1;
        }
        return true;
    }
}
