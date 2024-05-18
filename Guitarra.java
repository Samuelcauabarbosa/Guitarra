public class Guitarra {
    private String marca;
    private String modelo;
    private int numCordas;
    
    public Guitarra(String marca, String modelo, int numCordas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numCordas = numCordas;
    }
    
    public void tocar() {
        System.out.println("Tocando a guitarra " + marca + " " + modelo);
    }
    
    public void afinar() {
        System.out.println("Afinando a guitarra " + marca + " " + modelo);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getNumCordas() {
        return numCordas;
    }
    
    public static void main(String[] args) {
        Guitarra minhaGuitarra = new Guitarra("Fender", "Stratocaster", 6);
        minhaGuitarra.tocar();
        minhaGuitarra.afinar();
    }
}
