package annotation;

import com.example.movierec.textedit.SpellChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor texteditor() {
        //Error
        return new TextEditor(spellchecker());
    }

    @Bean
    public SpellChecker spellchecker() {
        return new SpellChecker();
    }

}