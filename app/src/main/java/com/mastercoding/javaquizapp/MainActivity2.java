package com.mastercoding.javaquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private String[] questions = {"Java is an object-oriented programming language with support for both procedural and object-oriented programming paradigms?"
            ,"In Java, all variables must have an explicit data type when declared."
            ,"Java does not support multiple inheritance through classes. It uses interfaces to achieve a form of multiple inheritance."
            ," The static keyword in Java is used to define class-level members (variables and methods) that belong to the class itself, not to instances of the class."
            ,"Java's ArrayList is a resizable array implementation of the List interface."
            ,"Java's NullPointerException is an unchecked exception, not a checked one."
            ,"The final keyword can be used to prevent a class from being subclassed. It can also be used to mark variables as constants or prevent method overriding."
            ,"The break statement is used to terminate the current iteration of a loop in Java."
            ," Java's HashSet does not allow duplicate elements. It automatically ensures that only unique elements are stored."
            ,"The entry point of a Java program is the main method. It must be public, static, and have a void return type."};
    private boolean[] answers = {false,true,false,false,true,false,true,true,false,true};

    private int score = 0;
    Button yes;
    Button no;
    Button button_result;
    TextView question;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        button_result = findViewById(R.id.button_result);
        question = findViewById(R.id.question);

        question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // if the array is not going out of bound
                if (index <= questions.length-1){
                    // if you hgave given correct answer
                    if (answers[index] == true){
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    if (index == questions.length){
                        Toast.makeText(MainActivity2.this, "No More Questions\nPlease check your Score\nby clicking on the Result Button", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // if the array is not going out of bound
                if (index <= questions.length-1){
                    // if you hgave given correct answer
                    if (answers[index] == false){
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1){
                        question.setText(questions[index]);
                    }
                    if (index == questions.length){
                        Toast.makeText(MainActivity2.this, "No More Questions\nPlease check your Score\nby clicking on the Result Button", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("result",score);
                startActivity(intent);
            }
        });
    }
}