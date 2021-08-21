import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilterInputStream {
  public static void main(String[] args){
    Path fp = Paths.get("data.dat");
    // 입력 스트림 생성
    // 필터 스트림 생성 및 입력 스트림과 연결
    try(DataInputStream in = new DataInputStream(Files.newInputStream(fp))){
      int n1 = in.readInt();
      double n2 = in.readDouble();
      System.out.println(n1);
      System.out.println(n2);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }  
}
