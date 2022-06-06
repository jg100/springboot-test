package annotation;

import com.example.movierec.textedit.SpellChecker;

public class TextEditor {
    private SpellCheck sc;

    public TextEditor(SpellChecker spellChecker) {
        this.sc = spellChecker;
    }

    public void setSc(SpellCheck sc) {
        this.sc = sc;
    }

    public SpellCheck getSc() {
        return sc;
    }
}
