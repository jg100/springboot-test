package annotation;

public class TextEditor {
    private SpellChecker sc;

    public TextEditor(SpellChecker sc) {
        this.sc = sc;
    }

    public void setSc(SpellChecker sc) {
        this.sc = sc;
    }

    public SpellChecker getSc() {
        return sc;
    }
}
