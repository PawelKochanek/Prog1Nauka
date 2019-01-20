package pl.sda.recap;

public class WieleWatkow implements Runnable {
    private final String name;
    private final int numberOfRepeats;

    public WieleWatkow(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    public void run(){
        for (int i = 0; i < numberOfRepeats ; i++) {
            System.out.println("Hello name from <Wielewatkow name>" + name);
        }
    }

}
