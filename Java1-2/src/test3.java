import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test3{
  public static void main(String args[]){
    try{
      File file = new File("C:\\Users\\p-user\\programJAVA\\Java1-2\\input\\StarWars.txt");
      File outfile = new File("C:\\Users\\p-user\\programJAVA\\Java1-2\\output\\outStarWars.txt");
      
      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
        
        String str;
        int i;
        for(i=0;(str = br.readLine()) != null;i++){
          bw.write((i+1)+":"+str);
          bw.newLine();
        }

        br.close();
        bw.close();
      }else{
        System.out.println("ファイルが見つからないか開けません");
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
  }

  private static boolean checkBeforeReadfile(File file){
    if (file.exists()){
      if (file.isFile() && file.canRead()){
        return true;
      }
    }
    return false;
  }
}