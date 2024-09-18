package mirkoabozzi.U5S7L3;

import mirkoabozzi.U5S7L3.Adapter.Info;
import mirkoabozzi.U5S7L3.Adapter.InfoAdapter;
import mirkoabozzi.U5S7L3.Adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class U5S7L3Application {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(U5S7L3Application.class, args);


        UserData newUserData = new UserData("Mirko Abo", 34);

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        Info newInfo = new Info("Mirko", "Abozzi", data.parse("12/09/1990"));

        InfoAdapter infoAdapter = new InfoAdapter(newUserData.getNomeCompleto(), newUserData.getEta(), newInfo);

        System.out.println(infoAdapter.getNomeCompleto());
        System.out.println(infoAdapter.getEta());


    }

}
