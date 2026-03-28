class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()==true){
            return 10;
        }else{
            return 6;
        }
    }
    
}

// TODO: define the Wizard class

class Wizard extends Fighter{
    boolean spell=false;

    @Override
    boolean isVulnerable() {
        if(spell==true){
            return false;            
        }else{
            return true;
        }
        
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    private boolean prepareSpell(){
       spell=true;
        return true;
        }
        
        
    
    @Override
    int getDamagePoints(Fighter fighter) {
        if (spell==true){
            return 12;
        }else{
            return 3;
        }
}
}


