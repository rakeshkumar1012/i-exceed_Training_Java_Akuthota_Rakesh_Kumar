class sample{
    int a=5;
    static int b=10;

    public void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void dis(){
        System.out.println("a = "+new sample().a);
        System.out.println("b = " +b);
    }

}
class demostaticvar{
    public static void main(String args[]){
        sample obj = new sample();
        obj.display();
        obj.dis();
    }
}

