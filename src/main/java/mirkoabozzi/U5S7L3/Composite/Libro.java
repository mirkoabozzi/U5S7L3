package mirkoabozzi.U5S7L3.Composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
@Getter
public class Libro implements Elemento {
    private String titolo;
    private double prezzo;
    private Autore autore;
    private List<Pagina> pagine;
    private List<Sezione> sezioni;

    public Libro(String titolo, double prezzo, Autore autore) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autore = autore;
    }

    @Override
    public void stampa() {
        System.out.println("Libro");
        System.out.println("Titolo " + titolo);
        System.out.println("Prezzo " + prezzo);
        System.out.println("Autore " + autore.getNome());
        System.out.println(pagine.stream().mapToInt(Pagina::getNumeroPagina).sum());
        System.out.println(sezioni.stream().mapToInt(Sezione::stampaNumeroPagine).sum());
    }

    @Override
    public int stampaNumeroPagine() {
        return 0;
    }
}
