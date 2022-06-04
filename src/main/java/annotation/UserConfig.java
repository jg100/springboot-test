package annotation;
import org.springframework.context.annotation.*;

@Configuration
public class UserConfig {
    /**
     * The method and annotations are equivalent to the
     * following xml in the xml config file
     *
     * <beans>
     *     <bean id="helloWorld" class="annotation"/>
     *     <beans/>
     * @return
     */
    @Bean
    public User user() {
        return new User();
    }

}
