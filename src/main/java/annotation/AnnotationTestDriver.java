package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTestDriver {

    public static void main(String[] args) {
        ;

        //Loading multiple config classes
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        //Can multiple register classes through params or indivudally
        context.register(UserConfig.class);

        System.out.println("**** Output *****");

    }
}
