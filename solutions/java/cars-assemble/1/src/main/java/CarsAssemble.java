public class CarsAssemble {
    double productionRate;
    double production;
    double error;
    int productionRateMinute;
 

    public double productionRatePerHour(int speed) {
        if (speed>=1 && speed <=4){
            productionRate=speed*221;
        }else if(speed>=5 && speed<=8){
            production=0.9*221;
            productionRate=speed*production;
            
        }else if(speed==9){
             production=0.8*221;
            productionRate=speed*production;
        }else if(speed==10){
             production=0.77*221;
            productionRate=speed*production;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
       if (speed>=1 && speed <=4){
            productionRate=speed*221;
          int miInt = (int) Math.round(productionRate);
           productionRateMinute=miInt/60;
        }else if(speed>=5 && speed<=8){
            production=0.9*221;
            productionRate=speed*production;
           int miInt = (int) Math.round(productionRate);
           productionRateMinute=miInt/60;
            
        }else if(speed==9){
             production=0.8*221;
            productionRate=speed*production;
           int miInt = (int) Math.round(productionRate);
           productionRateMinute=miInt/60;
        }else if(speed==10){
             production=0.77*221;
            productionRate=speed*production;
           int miInt = (int) Math.round(productionRate);
           productionRateMinute=miInt/60;
           
        }
       
        return productionRateMinute;
    }
}
