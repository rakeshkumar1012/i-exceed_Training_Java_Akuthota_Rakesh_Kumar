interface one{

    public void methodone();
}
interface two{
    public void methodtwo();
}

class sample implements one,two{
    @Override
    public void methodone(){
        System.out.println("Inside Method one");
    }

    @Override
    public void methodtwo(){
        System.out.println("Inside method two");
    }
}
class demointerface{
    public static void main(String[] args){
        sample obj = new sample();
        obj.methodone();
        obj.methodtwo();
    }
}