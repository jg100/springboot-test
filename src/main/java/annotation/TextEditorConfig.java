package annotation;

import com.example.movierec.textedit.SpellChecker;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor() {
        //Error
        return new TextEditor( spellChecker() );
    }

    @Bean
    public SpellChecker spellChecker() {
        return new SpellChecker();
    }

}