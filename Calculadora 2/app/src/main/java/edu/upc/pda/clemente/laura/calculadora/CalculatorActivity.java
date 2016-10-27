/*
FALTA:
- treure els decimals "inútils"
- al posar l'=, ha d'anar calcular
- fer càlculs encadenats

*/




package edu.upc.pda.clemente.laura.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    //ATRIBUTS
    double num2=0, result=0;
    String operador = "";
    Boolean equal = false;
    Boolean dot = false;
    Boolean opera = false;
    Boolean res = false;
    //Boolean equal2 = false;
    String textscreen = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

    }

    //MÈTODES
        //Detectem quan s'apreta cada botó
    public void click0(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false; //si 'operation' ha actuat, per tant tenim un resultat, res=true, s'ha de netejar vista per tornar a escriure un número nou.
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "0");
    }
    public void click1(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "1");
    }
    public void click2(View view) {
        if (equal) clear(view); equal = false;// equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "2");
    }
    public void click3(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "3");
    }
    public void click4(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "4");
    }
    public void click5(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "5");
    }
    public void click6(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "6");
    }
    public void click7(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "7");
    }
    public void click8(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "8");
    }
    public void click9(View view) {
        if (equal) clear(view); equal = false; //equal2 = false;
        if (res) clear(view); res = false;
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText(text_result.getText() + "9");
    }
    public void clickdot(View view) {
        if (!dot){
            if (equal) clear(view);
            TextView text_result = (TextView) findViewById(R.id.text_result) ;
            text_result.setText(text_result.getText() + ".");
        }
        dot = true;
    }

    public void clickclear(View view) {
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText("");
        equal = false;
        //equal2 = false;
        num2 = 0;
        operador = "";
        result = 0;
    }
    public void clear(View view){
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText("");
        dot = false;
        res = false;
        //equal2 = false;
    }

    public void clickplus(View view) {
        if (!opera) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
            clear(view);
        } else {
            operation(view);
        }
        operador = "+";
        opera = true;
    }
    public void clickneg(View view) {
        if (!opera) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
            clear(view);
        } else {
            operation(view);
        }
        operador = "-";
        opera = true;

    }
    public void clickmult(View view) {
        if (!opera) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
            clear(view);
        }else {
            operation(view);

        }
        operador = "*";
        opera = true;
    }
    public void clickdiv(View view) {
        if (!opera) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
            clear(view);
        }else{
            operation(view);
        }
        operador = "/";
        opera = true;
    }

    public void clickequal (View view){
        /*if (equal) {equal2 = true;}*/
        if (equal) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
        }
        operation(view);
        equal = true;
        opera = false;
    }

    public void operation (View view) {

        if (!equal){
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            num2 = Double.parseDouble(textscreen);
        }
        /*if (!equal2) {*/
        switch (operador){
            case "+": result = result + num2; break;
            case "-": result = result - num2; break;
            case "*": result = result * num2; break;
            case "/": result = result / num2; break;
                //default:
        }
        TextView text_result = (TextView) findViewById(R.id.text_result);
        equal = false;
        textscreen = String.format("%f", result);
        text_result.setText(textscreen);
        /*} else {
            switch (operador){
                case "+": result = result + num2; break;
                case "-": result = result - num2; break;
                case "*": result = result * num2; break;
                case "/": result = result / num2; break;
                //default:
            }
            textscreen = String.format("%f", result);
            text_result.setText(textscreen);
        }*/
        res = true;

    }



}
