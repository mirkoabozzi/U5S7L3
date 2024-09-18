package mirkoabozzi.U5S7L3.Adapter;

import java.time.LocalDate;
import java.time.ZoneId;

public class InfoAdapter extends UserData {
    private Info info;


    public InfoAdapter(String nomeCompleto, int eta, Info info) {
        super(nomeCompleto, eta);
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate dataNascita = this.info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return LocalDate.now().getYear() - dataNascita.getYear();
    }
}
