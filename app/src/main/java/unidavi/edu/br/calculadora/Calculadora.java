package unidavi.edu.br.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculadora extends Activity {

    private TextView campoDeNumero;
    private TextView campoDeCalculo;
    String num  = "";
    String num1 = "";
    String num2 = "";
    String operacao = "";
    String resultado = "";

    double n1 =0;
    double n2 =0;
    double resultado2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        this.campoDeNumero = (TextView) findViewById(R.id.campoDeNumero);
        this.campoDeCalculo = (TextView) findViewById(R.id.campoDeCalculo);

    }

    public void limpar(View v){
        this.campoDeNumero.setText("0");
        this.campoDeCalculo.setText("");
        num = "";
        num1 = "";
        num2 = "";
        resultado2 = 0;
    }

    public void escrever (View v){

        switch (v.getId()) {
            case R.id.botao1:
                num += 1;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao2:
                num += 2;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao3:
                num += 3;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao4:
                num += 4;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao5:
                num += 5;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao6:
                num += 6;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao7:
                num += 7;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao8:
                num += 8;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao9:
                num += 9;
                this.campoDeNumero.setText(num);
                break;
            case R.id.botao0:
                if (!num.equals("")){
                    num += 0;
                    this.campoDeNumero.setText(num);
                }
                break;
            case R.id.botaoSoma:
                if(resultado2 != 0) {
                    num1 = resultado;
                    this.campoDeNumero.setText("");
                    operacao = "+";
                    num = "";
                }else{
                    num1 = num;
                    num = "";
                    this.campoDeNumero.setText("");
                    operacao = "+";
                }


                break;

            case R.id.botaoMenos:
                num1 = num;
                num = "";
                this.campoDeNumero.setText("");
                operacao = "-";
                break;
            case R.id.botaoMultiplicar:
                num1 = num;
                num = "";
                this.campoDeNumero.setText("");
                operacao = "X";
                break;
            case R.id.botaoDiv:
                num1 = num;
                num = "";
                this.campoDeNumero.setText("");
                operacao = "/";
                break;
        }

    }

    //Ao clicar no botão igual, vai entrar nesse método.
    //Nele é feito o cálculo com o valor das variaveis armazenadas no metodo escrever.
    public void calculaResultado (View v) {
        num2 = num;

        this.campoDeCalculo.setText(num1 + " " + operacao + " " + num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

        if(operacao.equals("+")) {
            resultado2 = n1 + n2;
            resultado = String.valueOf(resultado2);
            this.campoDeNumero.setText(resultado);

            num1 = "";
            num2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("-")){
            resultado2 = n1 - n2;
            resultado = String.valueOf(resultado2);
            this.campoDeNumero.setText(resultado);

            num1 = "";
            num2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("X")){
            resultado2 = n1 * n2;
            resultado = String.valueOf(resultado2);
            this.campoDeNumero.setText(resultado);

            num1 = "";
            num2 = "";
            n1 = 0;
            n2 = 0;

        }else if(operacao.equals("/")){
            resultado2 = n1 / n2;
            resultado = String.valueOf(resultado2);
            this.campoDeNumero.setText(resultado);

            num1 = "";
            num2 = "";
            n1 = 0;
            n2 = 0;
        }
    }
}
