@FunctionalInterface
interface  example{
    public void show();
}

class functionalinterface{
    public static void main(String[] args){
        example exa = new example(){
            @Override
            public void show(){
                System.out.println("HELLO ALL");
            }
        };
        exa.show();

    }
}