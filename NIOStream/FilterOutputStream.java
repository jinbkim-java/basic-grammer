import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilterOutputStream {
  public static void main(String[] args){
    Path fp = Paths.get("data.dat");
    // 출력 스트림 생성
    // 필터 스트림 생성 및 출력 스트림과 연결
    try(DataOutputStream out = new DataOutputStream(Files.newOutputStream(fp))){
      out.writeInt(370);
      out.writeDouble(3.14);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  } 
}