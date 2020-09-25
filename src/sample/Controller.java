package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField tfTextoNome;
    @FXML
    private TextField tfTextoSobreNome;
    @FXML
    private DatePicker tfTextoNascimento;
    @FXML
    private TextArea tfTextoFinalA;

   // int vezes = 0;

    public <date> void onBotaoA() {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(tfTextoNome.getText());
        pessoa.setsNome(tfTextoSobreNome.getText());
        pessoa.setNascimento(tfTextoNascimento.getValue());
        tfTextoFinalA.setText(pessoa.whatYou());
        /*
        vezes = vezes + 1;
        if(vezes != 1){
            System.out.print("Apertou o botão "+vezes+" vezes.\n");
        } else{
            System.out.print("Apertou o botão "+vezes+" vez.\n");
        }*/

    }
}
