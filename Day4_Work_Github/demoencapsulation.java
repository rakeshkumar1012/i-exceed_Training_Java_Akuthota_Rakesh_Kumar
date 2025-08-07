class encaps{
    private int id;
    private String emp_name, branch;

    encaps(int id , String emp_name, String branch){
        this.id = id;
        this.emp_name = emp_name;
        this.branch = branch;
    }

    public int getid(){
        return id;
    }
    public String getemp_name(){
        return emp_name;
    }
    public String getbranch(){
        return branch;
    }

    public void setid(int id){
        this.id=id;
    }
    public void  setemp_name(String emp_name){
        this.emp_name=emp_name;
    }
    public void setbranch(String branch){
        this.branch = branch;
    }

}

class demoencapsulation{
    public static void main(String[] args){
        encaps obj = new encaps(1,"Raghu","bangalore");
        System.out.println(obj.getid());
        System.out.println(obj.getemp_name());
        System.out.println(obj.getbranch());
        obj.setid(2); 
        System.out.println(obj.getid()); 
    }
}
