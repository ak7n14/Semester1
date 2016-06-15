//Class to read from the text file provided
import java.util.*;
import java.io.*;
public class ZooConfigReader {
	private BufferedReader reader;
	private ArrayList<ArrayList<String>> fileLines;
	//Takes in the text file provided and reads through each line
	public ZooConfigReader(String fileName){
		fileLines=new ArrayList<ArrayList<String>>();;
		try{
			reader = new BufferedReader(new FileReader(fileName));
			if(fileReady()){
				String newLine;
				while((newLine = getLine())!=null){
					fileLines.add(new ArrayList<String> (Arrays.asList(newLine.split(":|,"))));
				}
				reader.close();
			}
		}catch (FileNotFoundException e){
			System.err.println("The file cannot be read into the buffer as it cannot be found.");
			e.printStackTrace();
		}catch (IOException e){
			System.err.println("Populating the ArrayList Failed.");
			e.printStackTrace();
		}
	}
	//Returns each line like an array
	public ArrayList<ArrayList<String>> getConfigInfo() {
		return fileLines;
	}
	//Reads each line
	public String getLine() throws IOException{
		return reader.readLine();
	}
	//Returns if the line is ready to read to read
	public boolean fileReady() throws IOException{
		return reader.ready();
	}
}
