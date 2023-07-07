package devandroid.vinicius.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.vinicius.applistacurso.R;
import devandroid.vinicius.applistacurso.model.Pessoa;


public class    MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Vinícius");
        pessoa.setSobreNome("Praxedes");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("81-994597342");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("11-99223344");

//        dadosPessoa += "Primeiro nome: ";
//        dadosPessoa += pessoa.getPrimeiroNome();
//        dadosPessoa += " Sobrenome: ";
//        dadosPessoa += pessoa.getSobreNome();
//        dadosPessoa += " Curso desejado: ";
//        dadosPessoa += pessoa.getCursoDesejado();
//        dadosPessoa += " Telefone de contato: ";
//        dadosPessoa += pessoa.getTelefoneContato();
//
//        dadosOutraPessoa += "Primeiro nome: ";
//        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
//        dadosOutraPessoa += " Sobrenome: ";
//        dadosOutraPessoa += outraPessoa.getSobreNome();
//        dadosOutraPessoa += " Curso desejado: ";
//        dadosOutraPessoa += outraPessoa.getCursoDesejado();
//        dadosOutraPessoa += " Telefone de contato: ";
//        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid","Objeto outra pessoa "+outraPessoa.toString());

    }
}