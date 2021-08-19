import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
  public static void main(String[] args) throws IOException{
    try(InputStream in = new FileInputStream("data.dat")){  // 입력 스트림 생성
      int dat = in.read();  // 데이터 읽음
      System.out.println(dat);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }  
}