/*This program helps the On Time Logistic dispatchers find out which files are 
 * in the hard-drive and need to be uploaded to the HubGroup and STG Logistics 
 * portal. Need to create a UI to make it an application instead of relying on 
 * Eclipse to run the program. This UI would be more user friendly than eclipse
 * is
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class lol {

    public static void main(String[] args) throws FileNotFoundException {
    	/*We create the prefix and suffix that we will use to look for the load 
    	 * in the hard drive. We create 2 ArrayList, Present and Missing that 
    	 * we will use to store our loads.
    	 */
        String ending = ".pdf";
        File file = new File("Loads_typed_out.txt");
        String directory = "E:\\";
        ArrayList<String> Present = new ArrayList<String>();
        ArrayList<String> Missing = new ArrayList<String>();
 
        Scanner br = new Scanner(file);
		String str = br.nextLine();
		String[] splitLoads = str.split(",");
		
		
		/*This section goes through the entire text file and adds it to an array
		 * called split loads. Then we combine it with the directory and ending 
		 * suffix to see if the file exist inside the drive. (e.g: C:/ + 1234 + 
		 * .pdf gives you C:/1234.pdf.) If the file exist we put it in a the 
		 * ArrayList called Present and if it is missing it goes in Missing
		 * 
		 */
		for(int j=0;j<splitLoads.length;j++) {
			String filename = directory + splitLoads[j] + ending;
			File  f = new File(filename);
			if (f.exists())
				Present.add(splitLoads[j]);
	        else
	        	Missing.add(splitLoads[j]);	
		}
		
		/*
		 * This prints out the loads that are present and how many are in total
		 */
		System.out.println(splitLoads.length);
		System.out.println(Present.size());
		System.out.println("Present: ");
		System.out.println(Present);
    }
    } 
