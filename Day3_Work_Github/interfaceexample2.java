interface BTM{
    public void BTM();
    default void BTM1(){
        System.out.println(" This is BTM");
    }
}

interface Madiwala extends BTM{
    public void Madiwala();
}

class bangalore implements Madiwala{
    bangalore(){

    }
    @Override
    public void BTM(){
        System.out.println("Welcome to BTM");
    } 
    @Override
    public void Madiwala(){
        System.out.println("Welcome to Madiwala ");
    }

}

class interfaceexample2{
    public static void main(String[] args){
        bangalore obj = new bangalore();
        obj.BTM1();
        obj.BTM();
        obj.Madiwala();
    }
}