class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int resultado;
    int battery=100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

     public void setSpeed(int speed){
         this.speed=speed;
     }

    public void setBatteryDrain(int batteryDrain){
        this.batteryDrain=batteryDrain;
    }

    public int getSpeed(){
        return speed;   
    }

    public int getBatteryDrain(){
        return batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery==0){
            return true;
        }else if(battery<distance){
            return false;
            
        }else if(battery<batteryDrain){
            return true;
        }
        else
            return false;
    }

    public int distanceDriven() {
       resultado=distance;
       return resultado;
    }

    public void drive() {

        if(battery==0){
        }else{
            distance+=speed;
             battery-=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car=new NeedForSpeed(50,4);
        return car;
        
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public void setDistance(int distance){
        this.distance=distance;
    }

    public int getDistance(){
        return distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       int maxDistance=(100/car.batteryDrain)*car.speed;
        return maxDistance >= distance;
}
}

