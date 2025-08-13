import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

class demofiscom3 {
    public static void main(String args[]) throws Exception {
        if (args.length < 2) {
            System.out.println("sample1.txt");
            return;
        }
        String filename = args[0];
        String content = args[1];
        System.out.println("Writing to file: " + filename);
        System.out.println("Content to be written: " + content);
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(filename);
            byte bystr[] = content.getBytes();
            fout.write(bystr);
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            if (fout != null) {
                fout.close(); 
            }
        }
        System.out.println("\nReading from file: " + filename);
        BufferedInputStream bin = null;
        try {
            bin = new BufferedInputStream(new FileInputStream(filename));
            int i = 0;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\nSuccessfully read from the file.");
        } catch (Exception e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } finally {
            if (bin != null) {
                bin.close(); 
            }
        }
    }
}
