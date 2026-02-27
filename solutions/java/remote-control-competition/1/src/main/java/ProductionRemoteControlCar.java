class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distance;
    int numberOfVictories;

    public void drive() {
       distance+=10;
    }

    public int getDistanceTravelled(){
        return distance;
    }


    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories=numberOfVictories;
    }


     @Override
    public int compareTo(ProductionRemoteControlCar other) {
        // Orden descendente: el que tiene más victorias va primero
        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
        // Otra forma más explícita:
        // return other.numberOfVictories - this.numberOfVictories;
    }
}


