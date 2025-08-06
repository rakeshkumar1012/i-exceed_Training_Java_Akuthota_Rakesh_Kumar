import java.io.DataInputStream;

class Data_io {
    DataInputStream din = new DataInputStream(System.in);

    Data_io() {
        try {
            int str1 = Integer.parseInt(din.readLine());
            int str2 = Integer.parseInt(din.readLine());
            System.out.println(str1 + str2);
        } catch (Exception d) {
            System.out.println("Error reading input.");
        }
    }
}
