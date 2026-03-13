public class LogLevels {
    
    public static String message(String logLine) {
    String[] partes = logLine.split("]: ");
    String mensaje = partes[1].trim();
    return mensaje;
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("ERROR")){
             int inicio = logLine.indexOf('[') + 1;
    int fin = logLine.indexOf(']');
    String nivel = logLine.substring(inicio, fin);
    return nivel.toLowerCase();
            
        }else if(logLine.contains("WARNING")){
            int inicio = logLine.indexOf('[') + 1;
    int fin = logLine.indexOf(']');
    String nivel = logLine.substring(inicio, fin);
    return nivel.toLowerCase();
            
        }else if(logLine.contains("INFO")){
            int inicio = logLine.indexOf('[') + 1;
    int fin = logLine.indexOf(']');
    String nivel = logLine.substring(inicio, fin);
    return nivel.toLowerCase();
            
        }else {
        return "";
    }
        
    }

    public static String reformat(String logLine) {
          String[] partes = logLine.split("]: ");
    String mensaje = partes[1].trim();

    int inicio = logLine.indexOf('[') + 1;
    int fin = logLine.indexOf(']');
    String nivel = logLine.substring(inicio, fin).toLowerCase();

    return mensaje + " (" + nivel + ")";
    }
}
