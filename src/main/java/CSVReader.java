import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CSVReader {

    public static final String delimiter = ",";

    private static void readTXTFile(String csvFileName) throws IOException {

        String line = null;
        BufferedReader stream = null;
        List<List<String>> csvData = new ArrayList<List<String>>();

        try {
            stream = new BufferedReader(new FileReader(csvFileName));
            while ((line = stream.readLine()) != null) {
                String[] splitted = line.split(",");
                List<String> dataLine = new ArrayList<String>(splitted.length);
                for (String data : splitted){
                    dataLine.add(data);

                }
            //    System.out.println(dataLine);
                csvData.add(dataLine);
            }
			System.out.println(csvData);

		}
        // } finally {
        // 	if (stream != null)
        // 		stream.close();
        // }
        catch (IOException ex) {
            ex.printStackTrace();
        }



    }
     public static void read(String csvFile) {
     	try {
     		File file = new File(csvFile);
     		FileReader fr = new FileReader(file);
     		BufferedReader br = new BufferedReader(fr);

     		String line = "";

     		String[] tempArr;
     		String[] temp;
     		while ((line = br.readLine()) != null) {
     			tempArr = line.split(delimiter);
     		//	System.out.print(line);
     			for (String tempStr : tempArr) {
     			System.out.print(tempStr + " ");
     			if(tempStr.length() > 2){
     				temp = tempStr.split(" ");
     		//		System.out.print(temp);
     		// System.out.println(tempStr.length());
     				}
     			}
     			System.out.println();
     		}
     		br.close();

     	} catch (IOException ex) {
     		ex.printStackTrace();
     	}

     }

    public static void main(String[] args) {
        // csv file to read
        String csvFile = "C:/Users/anwesh.nayak/Desktop/Bulk/BulkSubModification.csv";

		try {
			CSVReader.readTXTFile(csvFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
