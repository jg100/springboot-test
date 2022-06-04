package annotation;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.context.annotation.*;

@Configuration
public class UserConfig {

    @Bean
    public UserConfig() {
        return new UserConfig();
    }

}
