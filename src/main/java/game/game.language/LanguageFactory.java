package game.language;

import game.IFactory;

public class LanguageFactory implements IFactory<ILanguage, LanguageEnum> {
    @Override
    public ILanguage create(LanguageEnum key) {
        if (key == null) {
            return new English();
        }
        return switch (key) {
            case PORTUGUESE -> new Portuguese();
            case SPANISH -> new Spanish();
            case ENGLISH -> new English();
        };
    }
}