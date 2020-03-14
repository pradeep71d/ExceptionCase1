package com.example.jaavademos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// null means simply no value is assigned to reference variable
        setContentView(R.layout.activity_main);
        try {
            System.out.println("A");
            int num=99/0;// it may arrise exception,so putting inside the try block
            System.out.println("B");
        }catch (ArithmeticException e){
            System.out.println("C");//here Exception is catched
        }catch (Exception ex){
          System.out.println("D");// since exception is already handled,no other exception so this catch block will not executed
        }
        System.out.println("E");// and finally cursor jump to E line and it will print E
    }
}// so the final output will be=ACE
