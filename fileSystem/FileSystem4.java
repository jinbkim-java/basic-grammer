import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileSystem4 {
  public static void main(String[] args) throws IOException{
    Path src = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/FileSystem4.java");
    Path dst = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/copy.java");
    Path dst2 = Paths.get("/Users/jinbkim/code/basic-grammer/fileSystem/move.java");
    Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
    Files.move(dst, dst2, StandardCopyOption.REPLACE_EXISTING);
  }
}
