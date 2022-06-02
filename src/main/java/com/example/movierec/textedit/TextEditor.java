package com.example.movierec.textedit;
/**
 *  Dependency injection types:
 *
 *  Constructor based:
 *  Accomplished when container invokes a class constructor
 *  with a number of arguments each representing a dependency
 *  on the other class
 *
 *  Setter based
 *  Accomplished by the container by calling the setter methods
 *  AFTER invoking a 0 arg constructor
 *
 *  Both can be mixed BUT good to use constructor args for
 *  mandatory dependencies and setters for optional dependencies.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
