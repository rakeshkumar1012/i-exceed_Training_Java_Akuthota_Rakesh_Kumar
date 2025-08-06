interface animal{
    public void sound();
}

class dog implements animal{
    @Override
    public void sound(){
        System.out.println("Bow Bow");
    }
}

class cat implements animal{
    @Override
    public void sound(){
        System.out.println(" Meow");
    }
}

class demointerface1{
    public static void main(String[] args){
        cat objcat = new cat();
        dog objDog = new dog();
        objcat.sound();
        objDog.sound();
    }
}