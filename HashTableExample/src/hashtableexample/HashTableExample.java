package hashtableexample;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<String, Employee> emplist = new Hashtable<String, Employee>();

        Employee e1 = new Employee();
        e1.setEmpid(1);
        e1.setEmpname("Rohit");
        e1.setDeptname("IT");

        emplist.put("e1", e1);

        for (Map.Entry m : emplist.entrySet()) {
            
            Employee t=(Employee) m.getValue();
            
            System.out.println(m.getKey() + " "+t.getEmpid()+" "+t.getEmpname()+" "+t.getDeptname());
        }
    }
}
