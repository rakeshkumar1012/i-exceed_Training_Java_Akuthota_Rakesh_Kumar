class india{
    private final state statenameState ;
    String name, capital;
    india(String name, String capital ){
        statenameState = new state("Andhra Pradesh , Karnataka");
        this.capital = capital;
        this.name =name; 

    }
    public void display(){
        System.out.println("Name is "+name);
        System.out.println("Capital is "+capital);
        statenameState.display1();
    }
}
class state{
    String statename;
    state(String statename){
        this.statename=statename;
    }
    public void display1(){
        System.out.println("Statename is"+ statename);
    }
}

class composition{
    public static void main(String[] args){
        india ind = new india("India","New Delhi");
        ind.display();

    }
}
