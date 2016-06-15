//Importing Library funtionf
import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {
    public String words;
    //Constructor To initilize values
    public WordGroup (String getWords){
        words = getWords.toLowerCase();
    }
    //Function used to convert strings to array of words
    public String[] getWordArray(){
        return words.split(" ");
    }
    //Function used to put words from wordgroup to HashMap
    public HashSet<String> getWordSet(WordGroup A){
        HashSet<String> set = new HashSet<String>();
        for (int i=0 ; i<this.getWordArray().length;i++){
            set.add(this.getWordArray()[i]);
        }
 	for (int i=0 ; i<A.getWordArray().length;i++){
            set.add(A.getWordArray()[i]);
        }
        return set;
    }
    //Function to return the word with number of times it is occuring in the HashMap
 	public HashMap<String, Integer> getWordCounts() {
  		HashMap<String, Integer> map = new HashMap<String, Integer>();
  		for(int i = 0; i<getWordArray().length;i++)
  			if (map.containsKey(getWordArray()[i]))
  				map.put(getWordArray()[i],map.get(getWordArray()[i])+1);
  			else
  				map.put(getWordArray()[i],1);
  		return map;
   }
 }
