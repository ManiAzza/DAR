package tp5;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
//            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
  //          System.out.println(service1.maj("azza"));
        //    MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
          //  System.out.println(service1.index("azza",'b'));
                MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.pal("azza"));
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }

    }
}
