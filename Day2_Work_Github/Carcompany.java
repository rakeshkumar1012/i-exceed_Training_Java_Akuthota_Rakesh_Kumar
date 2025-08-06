class car {
    String nameofCompany;
    boolean isAvailable;

    car(String nameofCompany, boolean isAvailable) {
        this.nameofCompany = nameofCompany;
        this.isAvailable = isAvailable;
        this.displaycompany();
    }

    public void displaycompany() {
        System.out.println("Company: " + nameofCompany);
        System.out.println("Available: " + isAvailable);
    }
}

class scorpio extends car {
    String carName, modelName, color;

    scorpio(String carName, String modelName, String color) {
        super("Mahindra", true);
        this.carName = carName;
        this.modelName = modelName;
        this.color = color;
        this.displaycar();
    }

    public void displaycar() {
        System.out.println("Car: " + carName + ", Model: " + modelName + ", Color: " + color);
    }
}

public class Carcompany{
    public static void main(String[] args) {
        scorpio obj = new scorpio("XUV", "500", "black");
    }
}
