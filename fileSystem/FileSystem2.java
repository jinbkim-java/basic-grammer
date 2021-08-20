import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem2 {
  public static void main(String[] args) throws IOException {
    Path fp = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/empty.txt");
    fp = Files.createFile(fp);
    System.out.println("fp : " + fp);

    Path dp1 = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/empty");
    dp1 = Files.createDirectory(dp1);
    System.out.println("dp1 : " + dp1);

    Path dp2 = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem2/empty2");
    dp2 = Files.createDirectories(dp2);
    System.out.println("dp2 : " + dp2);
  }
}