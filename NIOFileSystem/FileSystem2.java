import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSystem2 {
  public static void main(String[] args){
    Path fp = Paths.get("data.dat");
    ByteBuffer wb = ByteBuffer.allocate(1024);
    wb.putInt(123);
    wb.putInt(456);
    wb.putDouble(1.23);
    wb.putDouble(4.56);

    try(
      FileChannel fc = FileChannel.open(fp, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE))
    {
      wb.flip();
      fc.write(wb);
      
      ByteBuffer rb = ByteBuffer.allocate(1024);
      fc.position(0);
      fc.read(rb);
      rb.flip();

      System.out.println(rb.getInt());
      System.out.println("position : " + rb.position());
      rb.position(Integer.BYTES * 2);
      System.out.println(rb.getDouble());
      System.out.println(rb.getDouble());
      rb.position(Integer.BYTES );
      System.out.println(rb.getInt());
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}