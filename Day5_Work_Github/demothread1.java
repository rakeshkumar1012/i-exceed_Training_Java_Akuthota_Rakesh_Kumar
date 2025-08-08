class sample extends Thread{
    Thread t = new Thread(this);
    public void run(){
        t.setName("i-exceed");
        System.out.println("Inside the run method"+t.getName());

    }
}

class demothread1{
    public static void main(String[]  args){
      //System.out.println("Name is "+Thread.currentThread().getName());
	  sample obj=new sample();
	  obj.start();
    }
}