
    package com.example.testapp;
    import androidx.appcompat.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.content.Intent;
    import android.net.Uri;
    public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {

        Button btnWeb;
        Button btnMap;
        Button btnCall;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_two);

            btnWeb = (Button) findViewById(R.id.btnWeb);
            btnMap = (Button) findViewById(R.id.btnMap);
            btnCall = (Button) findViewById(R.id.btnCall);

            btnWeb.setOnClickListener(this);
            btnMap.setOnClickListener(this);
            btnCall.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.btnWeb:
                    intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:59.887811952195946,30.488187111953103"));
                    startActivity(intent);
                    break;

                case R.id.btnCall:
                    intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:59.897542269403864,30.505224466543204"));
                    startActivity(intent);
                    break;
                case R.id.btnMap:
                    intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("geo:59.9183710630283,30.513979196796974"));
                    startActivity(intent);
                    break;

            }

        }
    }