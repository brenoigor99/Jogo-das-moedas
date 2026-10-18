package game.language;

import game.ui.IRenderer;

public class Portuguese implements ILanguage {

    @Override
    public void printStartMessage(IRenderer renderer, String deviceName) {
        String translatedDevice = deviceName.equalsIgnoreCase("Keyboard") ? "Teclado" : deviceName;
        renderer.showMessage("=== Colete as moedas ($) - controle: " + translatedDevice + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Comando desconhecido.");
    }

    @Override
    public void printWallMessage(IRenderer renderer) {
        renderer.showMessage("Parede! Você não pode ir por aí.");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("Moeda coletada! Pontuação: " + score);
    }

    @Override
    public void printAllCoinsCollected(IRenderer renderer) {
        renderer.showMessage("Você coletou todas as moedas!");
    }

    @Override
    public String getScoreLabel() {
        return "Pontuação";
    }

    @Override
    public String getFinalScoreMessage(int score) {
        return "Pontuação final: " + score;
    }

    @Override
    public String getGameOverMessage(int score) {
        return "FIM DE JOGO - Pontuação: " + score;
    }
}