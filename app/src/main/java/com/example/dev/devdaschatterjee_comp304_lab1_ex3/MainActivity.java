package com.example.dev.devdaschatterjee_comp304_lab1_ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //to navigate to AI Activity
    public void onClickAIActivity(View v){
        Intent aIIntent=new Intent(this,AIActivity.class);
        //aIIntent.putExtra("AI",aIIntent);
        startActivity(aIIntent);


    }//to close AI Activity
    public void onBtnCloseAI_Click(View v){
       AIActivity.aiActivity.finish();
        Toast.makeText(this,AIActivity.msg,Toast.LENGTH_LONG).show();

    }


    // to navigate VR Activity
    public void onClickVRActivity(View v){
        Intent vRIntent=new Intent(this,VRActivity.class);
        //vRIntent.putExtra("VR",vRIntent);
        startActivity(vRIntent);

    }
    //to close VR Activity
    public void onBtnCloseVR_Click(View v){
        VRActivity.vrActivity.finish();
        Toast.makeText(this,VRActivity.msg,Toast.LENGTH_SHORT).show();
    }
}
