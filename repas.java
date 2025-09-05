import java.text.SimpleDateFormat;
import java.util.Date;

public class Repas {
    private int numero;      // Le numéro du repas
    private Date date;       // La date du repas
    

    // Constructeur
    public Repas(int numero, Date date) {
        this.numero = numero;
        this.date = date;
    }

    // Getter et Setter pour le numéro
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
       
     // Getter et Setter pour la date
       
    public int getDate() {
		return date;
		}
	
	public void setDate(Date date){
		this.date = date;
		}	
	
    }
}
