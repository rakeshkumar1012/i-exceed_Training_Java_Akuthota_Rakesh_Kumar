import java.io.FileOutputStream;
import java.io.FileInputStream;

class demofiscom{
    public static void main(String[] args)throws Exception{
        FileOutputStream fo =new FileOutputStream("sampledemoop.txt");
        String f = "Hello There Welcome";
        byte str[] = f.getBytes();
        fo.write(str);
        fo.close();
        FileInputStream fi = new FileInputStream("sampledemoop.txt");
        int i=0;
        while((i=fi.read())!=-1){
            System.out.print((char)i);

        }



    }
}