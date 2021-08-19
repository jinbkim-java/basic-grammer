import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
  public static void main(String[] args){
    SBox box1 = new SBox("jinbkim");
    SBox box2 = new SBox("hjung");
    try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("object.bin"))){
      oo.writeObject(box1);  // 객체 직렬화
      oo.writeObject(box2);
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
