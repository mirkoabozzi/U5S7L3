package mirkoabozzi.U5S7L3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pagina implements Elemento {
    private int numeroPagina;

    @Override
    public void stampa() {
        System.out.println("Pagina");
        System.out.println("Numero pagina " + numeroPagina);

    }

    @Override
    public int stampaNumeroPagine() {
        return 1;
    }
}
