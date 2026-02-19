class SqueakyClean {
    static String clean(String identifier) {
              char[] original = identifier.toCharArray();
        char[] resultado = new char[original.length]; // auxiliar (mismo tamaño máximo)
        int j = 0; // índice para resultado

        for (int i = 0; i < original.length; i++) {
            char c = original[i];

            if (c == ' ') {
                // reemplazar espacios por underscore
                resultado[j++] = '_';
            } else if (c == '-') {
                // si hay '-', saltamos el '-' y ponemos en mayúscula
                if (i + 1 < original.length) {
                    resultado[j++] = Character.toUpperCase(original[i + 1]);
                    i++; // ya consumimos el siguiente carácter
                }
                // si '-' está al final, simplemente lo ignoramos
            }else if( c=='4' || c=='3' || c=='0' || c=='1' || c=='7'){
                switch(c){
                    case '4':
                        resultado[j++]='a';
                        break;
                   case '3':
                        resultado[j++]='e';
                        break;
                  case '0':
                        resultado[j++]='o';
                        break;
                  case '1':
                        resultado[j++]='l';
                        break;
                  case '7':
                        resultado[j++]='t';
                        break;      
                         
                        
                }
                
            }
            else if (Character.isLetter(c)) {
                resultado[j++] = c;
            }
        }

        // construimos string usando solo las posiciones llenas
        return new String(resultado, 0, j);
    }
}
