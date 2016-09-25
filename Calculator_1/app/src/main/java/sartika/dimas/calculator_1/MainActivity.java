package sartika.dimas.calculator_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public String str = "", op = "";
    Character oper = 'q';
    float num2, num1;
    EditText hasil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*private ViewGroup rootView;
        private static final String TAG = "MainActivity";
        buttonCC = (Button) findViewById(R.id.buttonCC);
        buttonCC.setOnClickListener(this);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        hasil = (TextView) findViewById(R.id.hasil);

        editText.setOnClickListener(this);
        rootView = (ViewGroup) findViewById(R.id.rootView);
        setupAllListeners(rootView); */

        hasil = (EditText) findViewById(R.id.showHasil);
    }


    public void btn1(View v) {
        insert(1);
    }

    public void btn2(View v) {
        insert(2);
    }

    public void btn3(View v) {
        insert(3);
    }

    public void btn4(View v) {
        insert(4);
    }

    public void btn5(View v) {
        insert(5);
    }

    public void btn6(View v) {
        insert(6);
    }

    public void btn7(View v) {
        insert(7);
    }

    public void btn8(View v) {
        insert(8);
    }

    public void btn9(View v) {
        insert(9);
    }

    public void btn0(View v) {
        insert(0);
    }

    public void btntambah(View v) {
        perform();
        oper = '+';
    }
    public void btnminus(View v) {
        perform();
        oper = '-';
    }
    public void btnbagi(View v) {
        perform();
        oper = '/';
    }
    public void btnkali(View v) {
        perform();
        oper = '*';
    }
    public void btnx2(View v) {
        perform();
        oper = '^';
    }
    public void btnakar(View v) {
        perform();
        oper = 'a';
    }
    public void btnpersen(View v) {
        perform();
        oper = '%';
    }
    public void btnsamadengan(View v) {
        calculate();
    }
      public void btnCC(View v) {
        reset();
    }
    public void btnhapus(View v) {
        reset();
    }


    private void reset() {
        str = "";
        oper = 'q';
        num2 = 0;
        num1 = 0;
        hasil.setText("");
    }

    private void insert(int j) {
        str = str + Integer.toString(j);
        num2 = Integer.valueOf(str).intValue();
        hasil.setText(str);
    }

    private void perform() {
        str = "";
        num1 = num2;

    }

    /*
                    public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.buttontambah:
                            op = "+";
                            num2 = num1 + num2;
                            break;
                        case R.id.buttonminus:
                            op = "-";
                            num2 = num1 - num2;
                            break;
                        case R.id.buttonkali:
                            op = "*";
                            num2 = num1 * num2;
                            break;
                        case R.id.buttonbagi:
                            op = "/";
                            num2 = num1 / num2;
                            break;
                        default:
                            //break;

                    }

                    showResult.setText(num1 + " " + oper + " " + num2 + " = " + num2);
    }
    */

    private void calculate() {
        if (oper == '+')
            num2 = num1 + num2;
        else if (oper == '-')
            num2 = num1 - num2;
        else if (oper == '/')
            num2 = num1 / num2;
        else if (oper == '*')
            num2 = num1 * num2;
        else if (oper == '^')
            num2 = num1  * num1;
        //else if (oper == 'a');
        //    num2 = num2
        else if (oper == '%')
            num2 = num1/100;


        hasil.setText("" + num2);
    }

}

