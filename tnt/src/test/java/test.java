import org.springframework.context.support.ClassPathXmlApplicationContext;

import tt.t.service.Imp.ItestImpl;
import tt.t.service.Imp.Test02;
import tt.t.service.Imp.Test03;
import tt.t.service.Imp.Test04;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
//        ItestImpl itestImp = (ItestImpl) ac.getBean("ItestImp");
////        itestImp.sout();

//        Test02 test02 = (Test02) ac.getBean("Test02");

   /*     Test04 test04 = (Test04) ac.getBean("Test04");

        System.out.println(test04);*/
        Test04 test04 = (Test04) ac.getBean("Test04");
        test04.listAll();
    }
}
