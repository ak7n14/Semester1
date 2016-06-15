import java.util.HashMap;

public class Main{
	public static void main(String[] args){
		//Initialising new word group
		WordGroup word1= new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");

		WordGroup word2= new WordGroup("When you play play hard when you work dont play at all");
		//Converting string into an array
		String[] word1Array= word1.getWordArray();
		String[] word2Array= word2.getWordArray();

		System.out.println("Printing each word");
		//Iterating through word1Array and printing each word
		for(int i=0;i<word1Array.length;i++)
			System.out.println(word1Array[i]);

		System.out.println();
	//Iterating through word2Array and printing each word
		for(int i=0;i<word2Array.length;i++)
			System.out.println(word2Array[i]);

		word1.getWordSet(word2);
		System.out.println();

		for(int i=0 ; i<word1.getWordArray().length ; i++){
			System.out.println(word1.getWordArray()[i]);
		}
		//Created Hashmaps of Word1 and Word2 WordGroups
		HashMap<String, Integer>hashMap1=word1.getWordCounts();
		HashMap<String, Integer>hashMap2=word2.getWordCounts();

//Looping over hashmap1 and printing word and its count
		System.out.printf("\nHashMap1");
		for(String key:hashMap1.keySet())
			System.out.printf("\n %s %d", key, hashMap1.get(key));
//Looping over hashmap1 and printing word and its count
		System.out.printf("\nhashMap2");
		for(String key:hashMap2.keySet())
				System.out.printf("\n %s %d", key, hashMap2.get(key));
//Loop over the new HashSet to print a complete list of all words with the sum counts from each of the hashmaps.
		System.out.printf("\nTotal Hashmap:");
		for(String word: word1.getWordSet(word2))
			if(hashMap1.containsKey(word) && hashMap2.containsKey(word))
				System.out.printf("%s %d \n",word,hashMap1.get(word)+hashMap2.get(word));
			else if (hashMap1.containsKey(word))
				System.out.printf("%s %d \n",word,hashMap1.get(word));
			else
				System.out.printf("%s %d \n",word,hashMap2.get(word));
	}

}
