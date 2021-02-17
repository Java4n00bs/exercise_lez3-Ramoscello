package exercise0;


public class Persona {


  String nome, cognome;


  

  int eta ;
  int anno;
  int mese;

    public Persona(String nome, String cognome, int eta){

      this.nome=nome;
      this.cognome=cognome;
      this.eta=eta;

    }

    public String dettagli(){

      String d = "La Persona si chiama"  + this.nome + "" + this.cognome + "e ha" + this.eta +
      "è nata nell'anno" + this.anno  + "nel mese" + mese;
        return d;
    }
}
