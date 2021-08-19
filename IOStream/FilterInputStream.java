import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FilterInputStream {
  public static void main(String[] args){
    // 입력 스트림 생성
    // 필터 스트림 생성 및 입력 스트림과 연결
    try(DataInputStream in1 = new DataInputStream(new FileInputStream("data.dat"))){
      int n1 = in1.readInt();
      double n2 = in1.readDouble();
      System.out.println(n1);
      System.out.println(n2);
    }
    catch(IOException e){
      e.printStackTrace();
    }

    try(BufferedInputStream in2 = new BufferedInputStream(new FileInputStream("data2.dat"))){
      int n = in2.read();
      System.out.println(n);
    }
    catch(IOException e){
      e.printStackTrace();
    }  
  }  
}
