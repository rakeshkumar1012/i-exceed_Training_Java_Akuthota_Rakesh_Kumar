class sample extends Thread{
    /*sample(){
        new Thread(this).start();
    }*/
    public void run(){
        System.out.println("Inside the thread");
    }
}
class demothread{
    public static void main(String[] args){
        sample obj = new sample();
        obj.run();
        sample obj1 = new sample();
        obj1.start(); 
    }
}