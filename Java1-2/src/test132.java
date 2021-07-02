import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test132{
  public static void main(String args[]){
    try{
      File file = new File("C:\\Users\\p-user\\programJAVA\\Java1-2\\input\\StarWars.txt");
      List<String> list = new ArrayList<>();
      
      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));

        
        String str;
        int i;
        for(i=0;(str = br.readLine()) != null;i++){
          list.add(str);
        }
        System.out.println(i);
        list.forEach(System.out::println);
        br.close();
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