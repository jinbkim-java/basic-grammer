import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileSystem1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("File Name : ");
    Path src = Paths.get(sc.nextLine());

    System.out.print("Copy File Name : ");
    Path dst = Paths.get(sc.nextLine());

    ByteBuffer buf =  ByteBuffer.allocate(1024);
    try(
      FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ);
      FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE))
    {
      int num;
      while (true){
        num = ifc.read(buf);
        if (num == -1)
          break ;
        buf.flip();
        ofc.write(buf);
        buf.clear();
      }
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}