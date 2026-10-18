package game.language;

import game.ui.IRenderer;

public class English implements ILanguage {

    @Override
    public void printStartMessage(IRenderer renderer, String deviceName) {
        renderer.showMessage("=== Collect the coins ($) - control: " + deviceName + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Unknown command.");
    }

    @Override
    public void printWallMessage(IRenderer renderer) {
        renderer.showMessage("Wall! You cannot go that way.");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("Coin collected! Score: " + score);
    }

    @Override
    public void printAllCoinsCollected(IRenderer renderer) {
        renderer.showMessage("You collected all the coins!");
    }

    @Override
    public String getScoreLabel() {
        return "Score";
    }

    @Override
    public String getFinalScoreMessage(int score) {
        return "Final score: " + score;
    }

    @Override
    public String getGameOverMessage(int score) {
        return "GAME OVER - Score: " + score;
    }
}