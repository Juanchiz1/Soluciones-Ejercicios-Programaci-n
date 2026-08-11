import java.util.Random;

class CaptainsLog {
    

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }
    

    char randomPlanetClass() {
        int indice = random.nextInt(10);
        return PLANET_CLASSES[indice];
    }

    String randomShipRegistryNumber() {
        int number=random.nextInt(9000);
        int numberReady=number+1000;
        return "NCC-"+numberReady;
    }

    double randomStardate() {
        double number=random.nextDouble()*1000;
        double numberReady=number+41000.0;
        return numberReady;
            
    }
}
