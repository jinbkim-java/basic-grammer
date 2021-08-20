import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileSystem3 {
  public static void main(String[] args) throws IOException{
    Path fp = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/simple.bin");
    fp = Files.createFile(fp);
    byte buf1[] = {0x10, 0x11, 0x12};
    Files.write(fp, buf1, StandardOpenOption.APPEND);
    byte buf2[] = Files.readAllBytes(fp);
    for (byte b : buf2)
      System.out.print(b + " ");
    System.out.println();

    fp = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/simple.txt");
    String str1 = "jinbkim";
    String str2 = "hjung";
    String str3 = "juhlee";
    List<String> list1 = Arrays.asList(str1, str2, str3);
    Files.write(fp, list1);
    List<String> list2 = Files.readAllLines(fp);
    System.out.println(list2);
  }
}