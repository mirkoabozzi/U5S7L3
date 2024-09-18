package mirkoabozzi.U5S7L3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Sezione implements Elemento {
    private String titolo;

    @Override
    public void stampa() {
        System.out.println("Sezione");
        System.out.println("Titolo sezione " + titolo);
    }

    @Override
    public int stampaNumeroPagine() {
        return 1;
    }
}


