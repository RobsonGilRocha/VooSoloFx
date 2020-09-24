package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Controller {
    @FXML
    private TextField tfTextoNome;
    @FXML
    private TextField tfTextoSobreNome;
    @FXML
    private DatePicker tfTextoNascimento;
    @FXML
    private TextArea tfTextoFinalA;


    @Override
    public String toString() {
        return tfTextoNascimento.toString();
    }

    int vezes = 0;

    public <date> void onBotaoA() {
        Pessoa pessoa = new Pessoa();
        LocalDate date = tfTextoNascimento.getValue();
        System.err.println("Selected date: " + date);
        LocalDate isoDate = tfTextoNascimento.getValue();
        ChronoLocalDate chronoDate =
                ((isoDate != null) ? tfTextoNascimento.getChronology().date(isoDate) : null);
        System.err.println("Selected date: " + chronoDate);


        pessoa.setNome(tfTextoNome.getText());
        pessoa.setsNome(tfTextoSobreNome.getText());
        pessoa.setNascimento(tfTextoNascimento.getValue());
        tfTextoFinalA.setText(pessoa.whatYou());
        vezes = vezes + 1;
        if(vezes != 1){
            System.out.print("Apertou o botão "+vezes+" vezes.\n");
        } else{
            System.out.print("Apertou o botão "+vezes+" vez.\n");
        }
        System.out.print(pessoa.getNascimento()+"teste "+"tfTextoNascimento.getValue()"+tfTextoNascimento.getValue()+"+date"+ toString()+" \t");
    }
}
