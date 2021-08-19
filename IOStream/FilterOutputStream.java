import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilterOutputStream {
  public static void main(String[] args){
    // 출력 스트림 생성
    // 필터 스트림 생성 및 출력 스트림과 연결
    try(DataOutputStream out1 = new DataOutputStream(new FileOutputStream("data.dat"))){
      out1.writeInt(370);
      out1.writeDouble(3.14);
    }
    catch(IOException e){
      e.printStackTrace();
    }

    // 버퍼링 기능을 제공하는 필터 스트림
    try(BufferedOutputStream out2 = new BufferedOutputStream(new FileOutputStream("data2.dat"))){
      out2.write(77);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
