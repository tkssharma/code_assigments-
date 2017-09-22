package assigment;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
 
public class stringHandeling {
 
    public static void main(String args[]) {
        try
 
        {
            FileInputStream fstream = new FileInputStream("/Users/tarunsharma-xft/Desktop/logs.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
 
            Map<String, Integer> map = new HashMap<>();
 
            while ((strLine = br.readLine()) != null) {
                int firstIndex = strLine.indexOf("SprintsController#");
                // return back from here if no match in that line 
                if(firstIndex == -1) {
                    continue;
                }
                // get second index 
                int secondIndex = strLine.indexOf(" ", firstIndex);
                if(secondIndex == -1) {
                    continue;
                }
                // get the key and add it map with count 
                // keep inc count if occurrence matches 
                
                String key = strLine.substring(firstIndex + 18, secondIndex);
                System.out.println(key);
                if(map.containsKey(key)) {
                    int count = map.get(strLine.substring(firstIndex + 18, secondIndex));
                    map.put(strLine.substring(firstIndex + 18, secondIndex), count + 1);
                } else {
                    map.put(strLine.substring(firstIndex + 18, secondIndex), 1);
                }
            }
 
            for(String key : map.keySet()) {
                System.out.println(String.format("SprintsController => %s action ran %d times", key, map.get(key)));
            }
 
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
 
}
