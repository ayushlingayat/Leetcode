public class Checkprefix {

    public static void printResult(int index){
        if(index != -1){
            System.out.println("Prefix found at position: " + index);
        } else {
            System.out.println("Prefix not found.");
        }
    }

    public static int isPrefixofWord(String sentence , String searchWord){
        // Split the sentence into words
        String[] sentences = sentence.split(" ");

        for(int i = 0; i < sentences.length; i++){
            if(sentences[i].startsWith(searchWord)){
                return i + 1; // 1-based index
            }
        }

        return -1;
    }

    public static void main(String args[]){
        String sentence = "i love eating burger";
        String searchWord = "burg";

        int result = isPrefixofWord(sentence, searchWord);
        printResult(result);
    }
}
