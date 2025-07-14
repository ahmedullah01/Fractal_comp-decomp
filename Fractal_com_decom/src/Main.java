import Compressor.compression_decompression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public class Main {
public static void main(String[] args) throws Exception{

    byte[] orignal = Files.readAllBytes(Paths.get("C:\\Users\\HP\\Downloads\\check.txt"));
    compression_decompression imp = new compression_decompression();
    byte[] compress = imp.compress(orignal);
    byte[] decompress = imp.decompress(compress);
    System.out.println("orignal byte " + orignal.length);
    System.out.println("compress byte " + compress.length );
    System.out.println(Arrays.equals(orignal,decompress));
}

}
