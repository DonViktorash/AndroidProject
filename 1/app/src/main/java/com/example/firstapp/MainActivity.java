package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Создаём ссылку на кнопку и присваиваем экземпляру
        Button button = (Button)findViewById(R.id.button);
        //Даем кнопке право слушать
        button.setOnClickListener(this);
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
        //        setContentView(R.layout.activity_main2);
    }

    @Override
    //Добавление жизни для нашей кнопки
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
