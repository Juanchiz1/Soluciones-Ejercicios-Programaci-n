class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       if (knightIsAwake==true){
           return false;
        
       } else{
           return true;
          
       }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake==true || archerIsAwake==true || prisonerIsAwake==true ){
            return true;
            
        } else{
            return false;
           
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake==false && prisonerIsAwake==true ){
            return true;
            
        } else{
            return false;
            
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    // Caso 1: perro presente → basta con que el arquero esté dormido
    if (petDogIsPresent && !archerIsAwake) {
        return true;
    }

    // Caso 2: perro NO presente → prisionero despierto y ambos (caballero y arquero) dormidos
    if (!petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
        return true;
    }

    // En cualquier otro caso → no se puede liberar
    return false;
}

    
public static void main( String []args){
      System.out.println(canFastAttack(true));   // false
      System.out.println(canSpy(true, false, false)); // true
      System.out.println(canSignalPrisoner(false, true)); // true
      System.out.println(canFreePrisoner(false, true, false, false)); // true
}
   

}

