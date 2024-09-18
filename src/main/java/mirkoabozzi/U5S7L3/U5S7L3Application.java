package mirkoabozzi.U5S7L3;

import mirkoabozzi.U5S7L3.Adapter.Info;
import mirkoabozzi.U5S7L3.Adapter.InfoAdapter;
import mirkoabozzi.U5S7L3.Adapter.UserData;
import mirkoabozzi.U5S7L3.Composite.Autore;
import mirkoabozzi.U5S7L3.Composite.Libro;
import mirkoabozzi.U5S7L3.Composite.Pagina;
import mirkoabozzi.U5S7L3.Composite.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class U5S7L3Application {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(U5S7L3Application.class, args);

        System.out.println("--------------------------------------ES.1--------------------------");

        UserData newUserData = new UserData("Mirko Abo", 34);

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        Info newInfo = new Info("Mirko", "Abozzi", data.parse("12/09/1990"));

        InfoAdapter infoAdapter = new InfoAdapter(newUserData.getNomeCompleto(), newUserData.getEta(), newInfo);

        System.out.println(infoAdapter.getNomeCompleto());
        System.out.println(infoAdapter.getEta());


        System.out.println("--------------------------------------ES.2--------------------------");
        Autore autore = new Autore("Mikro");
        Pagina pagina = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Sezione sezione = new Sezione("Sezione");
        Libro libro = new Libro("Libro", 12.99, autore);
        libro.setPagine(List.of(pagina, pagina2));
        libro.setSezioni(List.of(sezione));


        libro.stampa();
        libro.stampaNumeroPagine();


    }

}
