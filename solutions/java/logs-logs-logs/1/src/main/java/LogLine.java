public class LogLine {
     private String logLine;

    public LogLine(String logLine) {
        this.logLine=logLine;
    }

    public LogLevel getLogLevel() {
          int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = logLine.substring(start + 1, end);
        
        // Convertir el texto al enum correspondiente
        switch (level) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;  // Para la tarea 2, pero por ahora puedes lanzar excepción
        }
    }

    public String getOutputForShortLog() {
    LogLevel level = this.getLogLevel();
    
    // 2. Extraer el mensaje (todo después de "]: ")
    int separatorIndex = logLine.indexOf("]: ");
    String message = logLine.substring(separatorIndex + 3);
    
    // 3. Combinar número codificado + ":" + mensaje
    return level.getEncodedValue() + ":" + message;
    }
}
