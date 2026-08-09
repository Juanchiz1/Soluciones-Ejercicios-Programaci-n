class Badge {
    public String print(Integer id, String name, String department) {
       String frase="";
       if (department == null) {
            // Primero verificamos si department es null
            if (id == null) {
                frase = name + " - OWNER";
            } else {
                frase = "[" + id + "] - " + name + " - OWNER";
            }
        } else if (id == null) {
            frase = name + " - " + department.toUpperCase();
        } else {
            frase = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
       return frase;
    }
}
