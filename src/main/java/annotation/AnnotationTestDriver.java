package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestDriver {

    public static void main(String[] args) {
        //Same as importing the xml but instead java based. Loading single config class
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = (User) context.getBean(User.class);

        //Loading multiple config classes
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
        //Can multiple register classes through params or indivudally
        cxt.register(UserConfig.class);





        System.out.println("**** Output *****");
        System.out.println(user.getName());

    }
}
