package com.example.dev.devdaschatterjee_comp304_lab1_ex3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {
    public static String msg="";
    private static String status="";
    TextView vrTxtView;
    Button button;
    public static Activity vrActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        button=findViewById(R.id.btn_bkToMain);
        vrTxtView=findViewById(R.id.vrTxtView);
        status="in onCreate method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
        button=(Button)findViewById(R.id.btn_bkToMain);
        vrActivity=this;
    }
    //to navigate back to Main
    public void onBtn_bkToMain_Click(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void onStart()
    {
        super.onStart();
        status="in onStart method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);

    }
    public void onResume()
    {
        super.onResume();
        status="in onResume method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
    }
    public void onPause()
    {
        super.onPause();
        status="in onPause method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
    }

    public void onRestart()
    {
        super.onRestart();
        status="in onRestart method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
    }

    public void onStop()
    {
        super.onStop();
        status="in onStop method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
    }

    public void onDestroy()
    {
        super.onDestroy();
        status="in onDestroy method";
        msg=msg+""+status+"\n";
        vrTxtView.setText(msg);
    }
}
