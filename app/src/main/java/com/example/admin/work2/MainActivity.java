package com.example.admin.work2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText edittext1;
    private TextView textView2;
    private EditText edittext2;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=(EditText) findViewById(R.id.editText1);
        textView2=(TextView) findViewById(R.id.textView2);
        edittext2=(EditText) findViewById(R.id.editText2);
        textView4=(TextView) findViewById(R.id.textView4);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void  onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Rezult", textView4.getText());
                startActivity(intent);
            }
        }));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void  onButtonPlus(View view){        textView2.setText("+");    }

    public void  onButtonMinus(View view){        textView2.setText("-");    }

    public void  onButtonProiz(View view){        textView2.setText("*");    }

    public void  onButtonDelit(View view){        textView2.setText("/");    }

    public void  onButtonRavno(View view){
    String text1; String text2; String text3;
        text1= String.valueOf(edittext1.getText()); text2= (String) textView2.getText(); text3= String.valueOf(edittext2.getText());
        double a, b, c; c=0;
        if (text1!=null || text2!=null || text3!=null){
            a = Double.parseDouble(text1);
            b = Double.parseDouble(text3);
            if (text2=="+") {c=a+b; } else if (text2=="-") { c=a-b; } else if (text2=="*") {c=a*b; } else if (text2=="/") { c= a / b;
            }
            textView4.setText(c+"");

        }
    }
}
