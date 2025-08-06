class demostat{
    static int x;
    demostat(){
        x++;
        System.err.println(x);
    }
    public static void main(String[] args){
        demostat obj = new demostat();
        
    }
}