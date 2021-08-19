import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDesrialization {
  public static void main(String[] args){
    try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("object.bin"))){
      SBox box1 = (SBox)oi.readObject();  // 객체 역직렬화
      System.out.println(box1.get());

      SBox box2 = (SBox)oi.readObject();
      System.out.println(box2.get());
    }
    catch(ClassNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
