class one extends Thread {
    public void run(){
        for(var i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"Hello"+i);
        }
    }
}


class demothreadyield{
    public static void main(String[] args){
        one obj1 = new one();
        obj1.start();
        for(var i=0 ; i<5;i++){
            System.out.println("This is Main Thread ");
        }
    }
}