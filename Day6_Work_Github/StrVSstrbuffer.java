class stringconcat{
    public String concat(){
        String str="Hello";
        
        for(var i=0;i<100000;i++){
            str+="i-exceed";
        }
        return str;
    }
    public String Stringbuff(){
        StringBuffer sb = new StringBuffer("Hello");
        for(var i=0;i<100000;i++){
            sb.append("i-exceed");
        }
        return sb.toString();
    }
    public String Stringbuild(){
        StringBuilder sbb = new StringBuilder("Hello");
        for(var i=0;i<100000;i++){
            sbb.append("i-exceed");
        }
        return sbb.toString();
    }
}
class strVSstrbuffer{
    public static void main(String[]  args){
        stringconcat sgc = new stringconcat();
        long stm  = System.currentTimeMillis();
        sgc.concat();
        System.out.println(System.currentTimeMillis()-stm);


        long stmb = System.currentTimeMillis();
        sgc.Stringbuff();
        System.out.println(System.currentTimeMillis()-stmb);

        long stmbb = System.currentTimeMillis();
        sgc.Stringbuild();
        System.out.println(System.currentTimeMillis()-stmbb);


    }
}
