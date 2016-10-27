/*
FALTA:
- treure els decimals "inútils"   -  FET! :)
- al posar l'=, ha d'anar calcular - FET! :)
- fer càlculs encadenats - FET! :)
- Simplificar codi fent mètodes apart - FET! :)
- Click CLEAR té problemes - FET! :)
- Limitar els decimals en pantalla
- Quan s'apreta qualsevol operador, no ha de netejar el nombre per pantalla - FET! :)
- Botó d'= surt gris - NO FET... :(
- els botons de números no es nota quan s'apreten - No hi ha hagut temps!

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
    Boolean equal = false; //s'ha apretat el botó resultat
    Boolean dot = false; //s'ha apretat el botó "." - per no escriure un altre punt en un mateix número
    Boolean opera = false; //ha fet una operació
    Boolean res = false; // s'ha calculat un resultat amb el mètode operation
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
            if (res) clear(view); res = false;
            TextView text_result = (TextView) findViewById(R.id.text_result) ;
            text_result.setText(text_result.getText() + ".");
        }
        dot = true;
    }

    public void clickclear(View view) {
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText("");
        num2=0;
        result=0;
        operador = "";
        equal = false; //s'ha apretat el botó resultat
        dot = false; //s'ha apretat el botó "." - per no escriure un altre punt en un mateix número
        opera = false; //ha fet una operació
        res = false; // s'ha calculat un resultat amb el mètode operation
        textscreen = "";
    }
    public void clear(View view){
        TextView text_result = (TextView) findViewById(R.id.text_result) ;
        text_result.setText("");
        dot = false;
        res = false;
    }

    public void clickplus(View view) {
        isOpera(view);
        operador = "+";
        opera = true;
    }
    public void clickneg(View view) {
        isOpera(view);
        operador = "-";
        opera = true;

    }
    public void clickmult(View view) {
        isOpera(view);
        operador = "*";
        opera = true;
    }
    public void clickdiv(View view) {
        isOpera(view);
        operador = "/";
        opera = true;
    }

    public void clickequal (View view){
        if (equal) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
        }
        operation(view);
        equal = true;
        opera = false;
    }


    //FER UNA OPERACIÓ
    public void operation (View view) {

        if (!equal){
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            num2 = Double.parseDouble(textscreen);
        }

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

        //ELIMINA ELS DECIMALS DEL FINAL
        if(result%1==0){
            int result_i = (int)result;
            textscreen = ""+result_i;
        }
        else{textscreen = Double.toString(result);}
        text_result.setText(textscreen);
        res = true;
    }

    //OBJ: PODER FER CADENES D'OPERACIONS. Detecta si ja s'ha fet una operació.
    public void isOpera(View view){
        if (!opera) {
            TextView text_result = (TextView) findViewById(R.id.text_result);
            textscreen = text_result.getText().toString();
            result = Double.parseDouble(textscreen);
            clear(view);
        }else{
            operation(view);
        }

    }



}
