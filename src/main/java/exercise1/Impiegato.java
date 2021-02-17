package exercise1;


public class Impiegato {

  
  int nome;
  int cognome;
  int salario;

  public Persona(String nome, String cognome, int eta){

        this.nome=nome;
        this.cognome=cognome;
        this.salario=salario;

  }

  public String dettagli(){
        
        String comevuoi = " l'impiegato " + nome + cognome + "prende al mese " + salario;
      
        return comevuoi;
    }

  public void aumentaSalario(int percentuale){

    int newsalario = this.salario + (this.salario/100 * percentuale)ù
    this.salario = newsalario
    
    this.salario = salario/percentuale;


      
  }

}   
