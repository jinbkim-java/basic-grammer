import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {
  public static void main(String[] args) throws IOException {
    try(OutputStream out = new FileOutputStream("data.dat")){  // 출력 스트림 생성
      out.write(7);  // 파일에 7 저장
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }  
}