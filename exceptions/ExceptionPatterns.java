import java.io.*; import java.nio.file.*;
public class ExceptionPatterns {
    public static String safeRead(Path p){ try { return Files.readString(p); } catch (IOException e){ return "ERROR:"+e.getMessage(); } }
    public static void mustRead(Path p) throws IOException { System.out.println(Files.readString(p)); }
    public static void main(String[] args){ System.out.println(safeRead(Paths.get("missing.txt"))); try { mustRead(Paths.get("missing.txt")); } catch (IOException e){ System.err.println("Caught: "+e.getClass().getSimpleName()); } }
}
