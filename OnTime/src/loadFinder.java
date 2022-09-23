import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class loadFinder {

    public static void main(String[] args) throws FileNotFoundException {
        String ending = ".txt";
        File file = new File("Loads_typed_out.txt");
        String directory = "Z:\\Files\\";
        ArrayList<String> Present = new ArrayList<String>();
        ArrayList<String> Missing = new ArrayList<String>();
 
        Scanner br = new Scanner(file);
		String str = br.nextLine();
		String[] splitLoads = str.split(",");
		
		for(int j=0;j<splitLoads.length;j++) {
			String filename = directory + splitLoads[j] + ending;
			File  f = new File(filename);
			if (f.exists())
				Present.add(splitLoads[j]);
	        else
	        	Missing.add(splitLoads[j]);
			
		}
		System.out.println("Present: ");
		System.out.println(Present);
		System.out.println("Missing: ");
		System.out.println(Missing);
        
    }
    } 
