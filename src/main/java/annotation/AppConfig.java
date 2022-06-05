package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  Injecting Bean Dependencies
 */

@Configuration
public class AppConfig {
    @Bean
    public Foo foo() {
        //Constructor injecting the dependency
        return new Foo(bar());
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

}
