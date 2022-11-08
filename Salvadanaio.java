public class Salvadanaio {
    //Definisci gli attributi per descrivere la classe Salvadanaio.
    //Scrivi i metodi per aggiungere una moneta e per rompere il salvadanaio. 
    //Se il salvadanaio è rotto, è possibile conoscere il numero di monete contenute e l’ammontare della cifra.
    private int contaMonete;
    private double valoreMoneta;
    private boolean rotto=false;
    public Salvadanaio(int contaMonete, double valoreMoneta, boolean rotto){
        this.contaMonete = contaMonete;
        this.valoreMoneta = valoreMoneta;
        this.rotto = rotto;
    }
    public void aggiungiMoneta(double moneta){
        valoreMoneta+=moneta;
        contaMonete+=+1;
    }
    public void salvadanaioRotto(){
        if(rotto==true){
            System.out.println("Ci sono : "+contaMonete+" monete di cui l'ammontare è: " + valoreMoneta);
        }
    }
    private int getContaMonete() {
        return contaMonete;
    }
    private double getValoreMoneta() {
        return valoreMoneta;
    }
    public boolean getRotto() {
        return rotto;
    }
    private void setContaMonete(int contaMonete) {
        this.contaMonete = contaMonete;
    }
    public void Rompi(boolean rotto) {
        this.rotto = rotto;
    }
    private void setValoreMoneta(double valoreMoneta) {
        this.valoreMoneta = valoreMoneta;
    }
    
}
