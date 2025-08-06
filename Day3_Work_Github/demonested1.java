
class india{
    private String pm="Modi", capital="Delhi";
    private double gdp=13.5;
    

    class karnataka{
        String cm;
        double population;
        
        karnataka(String cm, double population){
            

            this.cm = cm;
            this.population = population;
            
        }

        public void display_ka(){
            System.out.println("CM name is "+cm);
            System.out.println("population is "+population);
            System.out.println("PM name:"+pm);
            System.out.println("Capital is"+capital);
            System.out.println("gdp is:"+gdp);
        }


    }
} 

class demonested1{
    public static void main(String args[]){
        india ind = new india();
        india.karnataka obj = ind.new karnataka("x",55555);    
        
         obj.display_ka();
        //ind.display_ind();
        }
}
