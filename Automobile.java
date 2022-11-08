public class Automobile {
    /*Definisci gli attributi e i metodi per descrivere la classe Automobile.
    Gli oggetti della classe devono essere in grado di accendersi e spegnersi, 
    di far rifornimento di carburante (senza superare la capacità del serbatoio), 
    di aumentare e di scalare la marcia, di segnalare se è stato raggiunto il livello di riserva per la benzina.*/
    private boolean accesso=false;
    private static double maxSerbatoio;
    private double rifornimento;
    private int marcia;
    private boolean riserva=false;

    public Automobile(boolean accesso, double maxSerbatoio, double rifornimento, int marcia, boolean riserva){
        this.accesso = accesso;
        this.maxSerbatoio = maxSerbatoio;
        this.rifornimento = rifornimento;
        this.marcia = marcia;
        this.riserva = riserva;
    }
    public void setAccesso(boolean accesso) {
        this.accesso = accesso;
    }
    public void setRifornimento(double rifornimento) {
        this.rifornimento = rifornimento;
        if(rifornimento>maxSerbatoio)
    }
    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }
    public void setRiserva(boolean riserva) {
        this.riserva = riserva;
    }
    public boolean getAcceso(){
        return accesso;
    }
    
}
