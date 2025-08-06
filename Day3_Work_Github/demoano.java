abstract class sample{
    abstract public void display();

}
class demoano{
    public static void main(String args[]){
        sample1 obj = new sample1(){
            @Override
            public void display(){
                System.out.println("Inside the anonymus class ");
            }
        };
        obj.display();
    }
}