package mirkoabozzi.U5S7L3.Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
}
