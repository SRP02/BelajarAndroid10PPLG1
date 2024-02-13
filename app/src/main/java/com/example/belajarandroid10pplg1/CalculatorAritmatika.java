package com.example.belajarandroid10pplg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorAritmatika extends AppCompatActivity {

    EditText txtangka1;
    EditText txtangka2;
    Spinner spoperator;
    TextView hasil;
    Button btncalculate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_aritmatika);

        txtangka1 = findViewById(R.id.editTextNumber1Calc);
        txtangka2 = findViewById(R.id.editTextNumber2Calc);
        spoperator = findViewById(R.id.spinner);
        hasil = findViewById(R.id.textView);
        btncalculate = findViewById(R.id.buttonCalc);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtangka1.getText().toString().isEmpty() || txtangka2.getText().toString().isEmpty()){
                    Toast.makeText(CalculatorAritmatika.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double number1 = Double.parseDouble(txtangka1.getText().toString());
                    double number2 = Double.parseDouble(txtangka2.getText().toString());
                    double result = 0;

                    String string = spoperator.getSelectedItem().toString();
                    switch (string) {
                        case "Penjumblahan +":
                            result = number1 + number2;
                            int resultint = (int)result;
                            hasil.setText(resultint+"");
                            break;
                        case "Pengurangan -":
                            result = number1 - number2;
                            hasil.setText(Double.toString(result));
                            resultint = (int)result;
                            hasil.setText(resultint+"");
                            break;

                        case "Perkalian *":
                            result = number1 * number2;
                            resultint = (int)result;
                            hasil.setText(resultint+"");
                            break;

                        case "Pembagian /":
                            if (number2 == 0) {
                                Toast.makeText(CalculatorAritmatika.this, "Pembagi tidak bolel 0", Toast.LENGTH_SHORT).show();
                            } else {
                                result = number1 / number2;
                                hasil.setText(Double.toString(result));
                            }
                            break;
                        default:
                            Toast.makeText(CalculatorAritmatika.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();


                    }}

            }
        });
    }

}