package com.example.testapp;;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        //button.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
            //    openActivity2();
           // }
        //});
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }
}
