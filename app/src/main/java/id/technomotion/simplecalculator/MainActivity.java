package id.technomotion.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    * ==== LANGKAH 1 ====
    * mendeklarasikan object / komponen UI yang akan di kontrol
    * */
    Button buttonPlus,buttonMinus,buttonMultiply,buttonDivision,buttonClear;
    EditText editText1,editText2;
    TextView textViewResult;

    // catatan : onCreate() adalah method yang pertama kali dieksekusi ketika halaman ini muncul di layar.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //meresmikan pasangan class MainActivity.java dengan layout activity_main.xml
        setContentView(R.layout.activity_main);

        /*
        * ==== LANGKAH 2 ====
        * memasangkan object yang dideklarasikan pada Langkah 1 dengan object/komponen UI berdasarkan IDnya masing-masing.
        * */
        buttonPlus= (Button) findViewById(R.id.buttonPlus);
        buttonMinus= (Button) findViewById(R.id.buttonMinus);
        buttonMultiply= (Button) findViewById(R.id.buttonMultiply);
        buttonDivision= (Button) findViewById(R.id.buttonDivision);
        buttonClear= (Button) findViewById(R.id.buttonClear);
        editText1= (EditText) findViewById(R.id.editText1);
        editText2= (EditText) findViewById(R.id.editText2);
        textViewResult= (TextView) findViewById(R.id.textViewResult);

        /*
        * ==== LANGKAH 3 ====
        * mengaktifkan button, supaya pada waktu diklik dapat merespon atau menjalankan perintah lainnya.
        * */
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ==== LANGKAH 5 =====
                // menjumlahkan dua buah masukan nilai

                // pertama kita ambil nilai yang ditulis pada setiap editText
                String input1String=editText1.getText().toString();
                String input2String=editText2.getText().toString();

                // kemudian dikonversi (casting) menjadi tipe data double supaya bisa dilakukan operasi matematika
                Double input1Double=Double.parseDouble(input1String);
                Double input2Double=Double.parseDouble(input2String);
                Double outputDouble=input1Double+input2Double;

                // sebelum haislnya dicetak kembali ke TextView, kita perlu mengkonversi tipe data Double menjadi
                // tipe String lagi.
                String outputString=String.valueOf(outputDouble);
                textViewResult.setText(outputString);

            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ==== LANGKAH 6 =====
                // menjumlahkan dua buah masukan nilai

                // pertama kita ambil nilai yang ditulis pada setiap editText
                String input1String=editText1.getText().toString();
                String input2String=editText2.getText().toString();

                // kemudian dikonversi (casting) menjadi tipe data double supaya bisa dilakukan operasi matematika
                Double input1Double=Double.parseDouble(input1String);
                Double input2Double=Double.parseDouble(input2String);
                Double outputDouble=input1Double-input2Double;

                // sebelum haislnya dicetak kembali ke TextView, kita perlu mengkonversi tipe data Double menjadi
                // tipe String lagi.
                String outputString=String.valueOf(outputDouble);
                textViewResult.setText(outputString);

            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ==== LANGKAH 7 =====
                // menjumlahkan dua buah masukan nilai

                // pertama kita ambil nilai yang ditulis pada setiap editText
                String input1String=editText1.getText().toString();
                String input2String=editText2.getText().toString();

                // kemudian dikonversi (casting) menjadi tipe data double supaya bisa dilakukan operasi matematika
                Double input1Double=Double.parseDouble(input1String);
                Double input2Double=Double.parseDouble(input2String);
                Double outputDouble=input1Double*input2Double;

                // sebelum haislnya dicetak kembali ke TextView, kita perlu mengkonversi tipe data Double menjadi
                // tipe String lagi.
                String outputString=String.valueOf(outputDouble);
                textViewResult.setText(outputString);

            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ==== LANGKAH 8 =====
                // menjumlahkan dua buah masukan nilai

                // pertama kita ambil nilai yang ditulis pada setiap editText
                String input1String=editText1.getText().toString();
                String input2String=editText2.getText().toString();

                // kemudian dikonversi (casting) menjadi tipe data double supaya bisa dilakukan operasi matematika
                Double input1Double=Double.parseDouble(input1String);
                Double input2Double=Double.parseDouble(input2String);
                Double outputDouble=input1Double/input2Double;

                // sebelum haislnya dicetak kembali ke TextView, kita perlu mengkonversi tipe data Double menjadi
                // tipe String lagi.
                String outputString=String.valueOf(outputDouble);
                textViewResult.setText(outputString);

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetUI();
            }
        });

        /*
        * ==== LANGKAH 4 ====
        * mari kita reset dulu textfield input maupun outputnya.
        * */
        resetUI();
    }

    private void resetUI() {
        editText1.setText("");
        editText2.setText("");
        editText1.setHint("0");
        editText2.setHint("0");
        textViewResult.setText("0");
    }
}
