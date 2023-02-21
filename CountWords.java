public class CountWords {
    public static void main(String[]args){
        String words = "Beer Pain Music Playlist Blockdown";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }
}
