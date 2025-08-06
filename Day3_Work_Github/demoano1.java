interface samp {
    public void display(int id, String place);
}

class demoano1{
    public static void main(String [] args){
            samp obj = new samp(){
            @Override
            public void display(int id , String place){
                System.out.println("id number is "+id);
                System.out.println("Place is "+place);
            }
            
        };
        obj.display(5,"Koramangala");
    }
}

