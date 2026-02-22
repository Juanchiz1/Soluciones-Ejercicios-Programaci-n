public class JedliksToyCar {
    int distance=0;
    int battery=100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        
        StringBuilder sb= new StringBuilder("Driven ");
        sb.append(distance);
        sb.append(" meters");
        String resultado=sb.toString();
        return resultado;
    }

    public String batteryDisplay() {
        if(battery==0){
            StringBuilder sb= new StringBuilder("Battery empty");
            String resultado=sb.toString();
            System.out.println(resultado);
            return resultado;  
        }else{
        StringBuilder sb= new StringBuilder("Battery at ");
        sb.append(battery);
        sb.append("%");
        String resultado=sb.toString();
        return resultado;
        }
        
    }

    public void drive() {
        if(battery==0){
            StringBuilder sb= new StringBuilder("Battery empty");
            String resultado=sb.toString();
            System.out.println(resultado);
            
        }else{
            distance=distance+=20;
            distanceDisplay();
            battery=battery-=1;
            batteryDisplay();
            
        }
       
    }
}
