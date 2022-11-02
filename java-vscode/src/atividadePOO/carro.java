package atividadePOO;

public class carro {

    private String marca, modelo;
    
    int velocidadeAtual;

    public carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }


    
    public void acelerar(int acelerar){
        
        velocidadeAtual = velocidadeAtual + acelerar;

            if(velocidadeAtual >= 200){
                velocidadeAtual = 200;
                System.out.println("velocidade maxima "+ velocidadeAtual + " km/h " ); 
        }
    }
    public void frear(int frear){
        
        velocidadeAtual = velocidadeAtual - frear;
        
        if(velocidadeAtual <= 0){
            velocidadeAtual = 0;
            System.out.println("carro parado");
        }
    }
    @Override
    public String toString() {
        return  "carro [marca= " + marca + ", modelo= " + modelo + ", velocidade= " + velocidadeAtual + "]";
    }

    public void printStatus(){
        System.out.println(toString());
    }
        
        


    
}
