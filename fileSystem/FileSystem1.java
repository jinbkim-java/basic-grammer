import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem1 {
  public static void main(String[] args){
    Path pt1 = Paths.get("/Users/jinbkim/code/");
    System.out.println(pt1);
    System.out.println(pt1.getRoot());
    System.out.println(pt1.getParent());
    System.out.println(pt1.getFileName());
    System.out.println();

    Path pt5 = Paths.get("");  // 현재 디렉토리 정보가 담긴 객체 생성
    String cdir;
    if (pt5.isAbsolute())
      cdir = pt5.toString();
    else
      cdir = pt5.toAbsolutePath().toString();
    System.out.println(cdir);
  }
}
