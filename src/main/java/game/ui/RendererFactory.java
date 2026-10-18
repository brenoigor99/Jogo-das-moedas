package game.ui;

import game.enums.RendererEnum;
import game.utils.IFactory;
import game.language.ILanguage;

public class RendererFactory implements IFactory<IRenderer, RendererEnum> {

    private ILanguage language;

    public RendererFactory(ILanguage language) {
        this.language = language;
    }

    @Override
    public IRenderer create(RendererEnum key) {
        return switch (key) {
            case TERMINAL -> new TerminalRenderer(language);
            case GUI -> new GUIRenderer();
        };
    }
}