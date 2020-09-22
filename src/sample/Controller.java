package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField tfTextoNome;
    @FXML
    private TextField tfTextoSobreNome;
    @FXML
    private TextField tfTextoNascimento;
    @FXML
    private TextArea tfTextoFinalA;














    public void onBotaoA() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(tfTextoNome.getText());
        pessoa.setSobreNome(tfTextoSobreNome.getText());
        pessoa.setDataNascimento(tfTextoNascimento.getText());
       tfTextoFinalA.setText(pessoa.whatYou());
        //System.out.print("ooooooooooooooooo");
    }
}
