class sample{
    sample(){

    }
    public void display(){
        System.out.println("Inside is Super class");
    }
}

class sample1 extends sample {
    sample1(){

    }
    public void display(){
        System.out.println("Inside derived class");
    }
}
class demooverride{
    public static void main(String[] args){
        sample ref;
        sample sup = new sample();
        sample1 der = new sample1();
        ref = der;
        ref.display();

    }
}