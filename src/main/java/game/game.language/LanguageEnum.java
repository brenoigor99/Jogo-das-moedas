package game.language;

public enum LanguageEnum {
    ENGLISH,
    PORTUGUESE,
    SPANISH;

    public static LanguageEnum from() {
        return ENGLISH;
    }

    public static LanguageEnum from(String value) {
        if (value == null || value.isBlank()) {
            return from();
        }
        return switch (value.trim().toLowerCase()) {
            case "portuguese", "português", "pt" -> PORTUGUESE;
            case "spanish", "español", "es" -> SPANISH;
            case "english", "en" -> ENGLISH;
            default -> {
                System.out.println("Opção de idioma inválida: '" + value + "'. A usar idioma padrão (ENGLISH).");
                yield ENGLISH;
            }
        };
    }
}