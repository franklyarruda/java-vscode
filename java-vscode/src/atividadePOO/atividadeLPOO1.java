package atividadePOO;

public class atividadeLPOO1 {
    public static void main(String[] args) {
        
        carro c1 = new carro(" fiat ", " uno ");
        c1.printStatus();
        c1.acelerar(20);
        c1.printStatus();
        c1.acelerar(50);
        c1.printStatus();
        c1.acelerar(200);
        c1.frear(100);
        c1.printStatus();
        c1.frear(150);
        c1.printStatus();
        

    }
}
