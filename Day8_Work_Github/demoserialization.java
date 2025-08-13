import java.io.*;
class employee implements Serializable{
    String name ,desig;
    int empid;
    double salary;

    employee(int empid, String name, String desig, double salary){
        this.empid = empid;
        this.name = name;
        this.desig = desig;
        this.salary = salary;
    }
}

class demoserialization{
    public static void main(String[] args)throws Exception{
        employee e1 = new employee(4742,"Rakesh", "Software Engineer - Trainee", 466000);
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(new File("mydataa.txt")));
        ob.writeObject(e1);
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("mydataa.txt")));
        employee e=(employee)oi.readObject();
	    System.out.println("Employee ID\t"+e.empid);
        System.out.println("Name of Employee\t"+e.name);
	    System.out.println("Designation\t"+e.desig);
	    System.out.println("Salary\t"+e.salary);
    }
}