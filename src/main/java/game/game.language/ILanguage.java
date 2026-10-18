package game.language;

import game.ui.IRenderer;

public interface ILanguage {
    void printStartMessage(IRenderer renderer, String deviceName);
    void printUnknownCommand(IRenderer renderer);
    void printWallMessage(IRenderer renderer);
    void printCoinCollected(IRenderer renderer, int score);
    void printAllCoinsCollected(IRenderer renderer);
    String getScoreLabel();
    String getFinalScoreMessage(int score);
    String getGameOverMessage(int score);
}