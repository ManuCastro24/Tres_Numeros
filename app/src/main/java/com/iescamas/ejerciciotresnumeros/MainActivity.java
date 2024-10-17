package com.iescamas.ejerciciotresnumeros;

import static com.iescamas.ejerciciotresnumeros.R.*;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

Button btn1, btn2, btn3, btn4, btnBorrarTodo;
EditText txtNumero1,txtNumero2,txtNumero3;
TextView lblRes1, lblRes2, lblRes3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnMenor);
        btn2 = findViewById(R.id.btnMayor);
        btn3 = findViewById(R.id.btnOrdAsc);
        btn4 = findViewById(R.id.btnOrdDesc);

        btnBorrarTodo = findViewById(R.id.btnBorrarTodo);

        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtNumero3 = findViewById(R.id.txtNumero3);

        lblRes1 = findViewById(R.id.lblRes1);
        lblRes2 = findViewById(R.id.lblRes2);
        lblRes3 = findViewById(R.id.lblRes3);

        btn1.setOnClickListener(view -> Menor(1));
        btn2.setOnClickListener(view -> Mayor(2));
        btn3.setOnClickListener(view -> OrdAsc(3));
        btn4.setOnClickListener(view -> OrdDesc(4));

        btnBorrarTodo.setOnClickListener(view -> BorraTodo());

    }

    private void Menor(int operacion1Id) {

        Integer num1 = Integer.parseInt(txtNumero1.getText().toString());
        Integer num2 = Integer.parseInt(txtNumero2.getText().toString());
        Integer num3 = Integer.parseInt(txtNumero3.getText().toString());

        if (operacion1Id == 1) {

            if (num1 < num2 && num1 < num3) {
                lblRes2.setText(String.valueOf(num1));
                lblRes1.setText("");
                lblRes3.setText("");

            } else if (num2 < num1 && num2 < num3) {
                lblRes2.setText(String.valueOf(num2));
                lblRes1.setText("");
                lblRes3.setText("");

            } else {
                lblRes2.setText(String.valueOf(num3));
                lblRes1.setText("");
                lblRes3.setText("");
            }

        }
    }

    private void Mayor(int operacion1Id) {

        Integer num1 = Integer.parseInt(txtNumero1.getText().toString());
        Integer num2 = Integer.parseInt(txtNumero2.getText().toString());
        Integer num3 = Integer.parseInt(txtNumero3.getText().toString());

            if (operacion1Id == 2) {

                if (num1 > num2 && num1 > num3) {
                    lblRes2.setText(String.valueOf(num1));
                    lblRes1.setText("");
                    lblRes3.setText("");
                } else if (num2 > num3 && num2 > num1) {
                    lblRes2.setText(String.valueOf(num2));
                    lblRes1.setText("");
                    lblRes3.setText("");
                } else {
                    lblRes2.setText(String.valueOf(num3));
                    lblRes1.setText("");
                    lblRes3.setText("");
                }

            }
        }

    private void OrdAsc(int operacion1Id) {

        Integer num1 = Integer.parseInt(txtNumero1.getText().toString());
        Integer num2 = Integer.parseInt(txtNumero2.getText().toString());
        Integer num3 = Integer.parseInt(txtNumero3.getText().toString());



            Integer[] num = {num1, num2, num3};
            Arrays.sort(num);
            lblRes1.setText(String.valueOf(num[0]));
            lblRes2.setText(String.valueOf(num[1]));
            lblRes3.setText(String.valueOf(num[2]));

    }


    private void OrdDesc(int operacion1Id) {

        Integer num1 = Integer.parseInt(txtNumero1.getText().toString());
        Integer num2 = Integer.parseInt(txtNumero2.getText().toString());
        Integer num3 = Integer.parseInt(txtNumero3.getText().toString());



            Integer[] num = {num1, num2, num3};
            Arrays.sort(num);
            lblRes1.setText(String.valueOf(num[2]));
            lblRes2.setText(String.valueOf(num[1]));
            lblRes3.setText(String.valueOf(num[0]));


    }


    private void BorraTodo() {

        txtNumero1.setText("");
        txtNumero2.setText("");
        txtNumero3.setText("");

        lblRes1.setText("");
        lblRes2.setText("");
        lblRes3.setText("");
    }
}