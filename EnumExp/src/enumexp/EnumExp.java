package enumexp;

public class EnumExp {
   
    enum e{
        
        a(10),b(20),c(30),d(40);        
    private int val;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    private e(int val)
    {
        this.val=val;
    }
    };

    public enum employees{
        
        mng("Pallavi"),dev("Zain");

        private String name;
        private employees(String name)
        {
            this.name=name;
        }
    
    };

    public static void main(String[] args) {
        // TODO code application logic here
       
        e e1;
        System.out.println(e.a.val);
        e.a.setVal(30);
        System.out.println(e.a.val);
        
        employees emp = null;        
        System.out.println(emp.mng.name);
        System.out.println(emp.dev.name);
       
    }
    
}
