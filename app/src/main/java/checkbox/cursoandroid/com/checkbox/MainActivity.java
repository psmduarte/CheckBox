package checkbox.cursoandroid.com.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxcao;
    private CheckBox checkBoxgato;
    private CheckBox checkBoxpapagaio;
    private Button botaoMostrar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxcao=findViewById(R.id.checkBoxCaoId);
        checkBoxgato=findViewById(R.id.checkBoxGatoId);
        checkBoxpapagaio=findViewById(R.id.checkBoxPapagaioId);

        botaoMostrar=findViewById(R.id.btnMostraId);
        textoResultado=findViewById(R.id.textoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String itensSelecionados = "";
                itensSelecionados += "Item: " + checkBoxcao.getText() + " Status: " + checkBoxcao.isChecked() + "\n";
                itensSelecionados += "Item: " + checkBoxgato.getText() + " Status: " + checkBoxgato.isChecked() + "\n";
                itensSelecionados += "Item: " + checkBoxpapagaio.getText() + " Status: " + checkBoxpapagaio.isChecked() + "\n";

                textoResultado.setText(itensSelecionados);
            }
        });
    }
}
