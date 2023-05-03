package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHandler Handler = new DbHandler(this, "empdb", null, 1);
        Handler.addEmployee(new Employee(1, "abc", 40));
        Handler.getEmployee(1);
        Handler.close();
    }
}