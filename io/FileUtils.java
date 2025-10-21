import java.io.*; import java.nio.file.*; import java.util.*;
public class FileUtils {
    public static void writeText(Path p, String s) throws IOException { if(p.getParent()!=null) Files.createDirectories(p.getParent()); Files.writeString(p,s); }
    public static String readText(Path p) throws IOException { return Files.readString(p); }
    public static void writeCSV(Path p, List<String[]> rows) throws IOException { if(p.getParent()!=null) Files.createDirectories(p.getParent()); try (var w = Files.newBufferedWriter(p)) { for (String[] r : rows) { w.write(String.join(",", r)); w.newLine(); } } }
    public static List<String[]> readCSV(Path p) throws IOException { List<String[]> out=new ArrayList<>(); for(String line: Files.readAllLines(p)){ out.add(line.split(",")); } return out; }
    public static void main(String[] args) throws Exception { Path t=Paths.get("tmp/demo.txt"); writeText(t,"hello"); System.out.println(readText(t)); Path c=Paths.get("tmp/data.csv"); writeCSV(c, List.of(new String[]{"name","age"}, new String[]{"Alice","23"})); System.out.println(Arrays.deepToString(readCSV(c).toArray())); }
}
