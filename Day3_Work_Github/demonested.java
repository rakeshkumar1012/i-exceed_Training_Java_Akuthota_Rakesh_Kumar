
class india{
    private String pm, capital;
    private double gdp;

    class karnataka{
        String cm;
        double population;
        karnataka(String cm, double population){
            this.cm = cm;
            this.population = population;
            this.display_ka();
        }

        public void display_ka(){
            System.out.println("CM name is "+cm);
            System.out.println("population is "+population);
        }


    }
} 

class demonested{
    public static void main(String args[]){
        india ind = new india();
        india.karnataka obj = ind.new karnataka("x",55555);    
        obj.display_ka();
        }
    }
