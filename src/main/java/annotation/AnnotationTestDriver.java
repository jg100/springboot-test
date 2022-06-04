package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestDriver {

    public static void main(String[] args) {
        //Same as importing the xml but instead java based
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = (User) context.getBean(User.class);

        System.out.println("**** Output *****");
        System.out.println(user.getName());

    }
}
