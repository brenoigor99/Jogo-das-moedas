package game.language;

import game.ui.IRenderer;

public class Spanish implements ILanguage {

    @Override
    public void printStartMessage(IRenderer renderer, String deviceName) {
        String translatedDevice = deviceName.equalsIgnoreCase("Keyboard") ? "Teclado" : deviceName;
        renderer.showMessage("=== Recoge las monedas ($) - control: " + translatedDevice + " ===");
    }

    @Override
    public void printUnknownCommand(IRenderer renderer) {
        renderer.showMessage("Comando desconocido.");
    }

    @Override
    public void printWallMessage(IRenderer renderer) {
        renderer.showMessage("¡Pared! No puedes ir por ahí.");
    }

    @Override
    public void printCoinCollected(IRenderer renderer, int score) {
        renderer.showMessage("¡Moneda recogida! Puntuación: " + score);
    }

    @Override
    public void printAllCoinsCollected(IRenderer renderer) {
        renderer.showMessage("¡Has recogido todas las monedas!");
    }

    @Override
    public String getScoreLabel() {
        return "Puntuación";
    }

    @Override
    public String getFinalScoreMessage(int score) {
        return "Puntuación final: " + score;
    }

    @Override
    public String getGameOverMessage(int score) {
        return "FIN DEL JUEGO - Puntuación: " + score;
    }
}