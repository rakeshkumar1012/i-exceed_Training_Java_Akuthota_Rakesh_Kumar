class company {
    String nameofcom;
    String city;

    company(String nameofcom, String city) {
        this.nameofcom = nameofcom;
        this.city = city;
    }
}

class HR extends company {
    String nameofHR, empid;

    HR(String nameofcom, String city, String nameofHR, String empid) {
        super(nameofcom, city);
        this.nameofHR = nameofHR;
        this.empid = empid;
        System.out.println("Company: " + nameofcom + " | City: " + city + " | HR: " + nameofHR + " | EMP ID: " + empid);
    }
}

class Finance extends company {
    String nameofEMP, empid;

    Finance(String nameofcom, String city, String nameofEMP, String empid) {
        super(nameofcom, city);
        this.nameofEMP = nameofEMP;
        this.empid = empid;
        System.out.println("Company: " + nameofcom + " | City: " + city + " | EMP: " + nameofEMP + " | EMP ID: " + empid);
    }
}

public class CompanyStructure {
    public static void main(String[] args) {
        Finance obj = new Finance("i-exceed", "Bangalore", "Rakesh", "EMP4742");
        HR obj1 = new HR("i-exceed", "Bangalore", "XYZ", "EMP0001");
    }
}
