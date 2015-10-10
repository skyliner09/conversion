package com.example.android.conversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.conversion.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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


    public void convert(View v) {
        //String getNum = "0";

        EditText numDec = (EditText) findViewById(R.id.Decimal);
        String getNum = numDec.getText().toString();

        int num = Integer.parseInt(getNum);
        String bin = decToBin(num);
        Log.v("MainActivity.java", "num " +bin);

        int num2 = Integer.parseInt(getNum);
        String oct = decToOctal(num);
        Log.v("MainActivity.java", "num " +bin);

        int num3 = Integer.parseInt(getNum);
        String hex = decToHex(num);
        Log.v("MainActivity.java", "num " +bin);


        display(bin, oct, hex);

    }

    public String decToBin(int num) {
        return Integer.toBinaryString(num);
    }

    public String decToOctal(int num) {
        return Integer.toOctalString(num);
    }

    public String decToHex(int num) {
        return Integer.toHexString(num);
    }

    public void display(String b, String o, String h) {
        TextView disBin = (TextView) findViewById(R.id.Binary);
        disBin.setText(String.valueOf(b));

        TextView disOct = (TextView) findViewById(R.id.Octal);
        disOct.setText(String.valueOf(o));

        TextView disHex = (TextView) findViewById(R.id.Hexadecimal);
        disHex.setText(String.valueOf(h));
    }


}
