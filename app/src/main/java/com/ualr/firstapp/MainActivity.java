package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    // TODO 06. Avoid updating the text label (userMsgTV) when the text field (userInputET) is empty
    public void showTextMessage(View view) {
        String userInput = mBinding.userInputET.getText().toString();
        if(userInput != null && !userInput.isEmpty() && !userInput.trim().isEmpty()) {
            mBinding.userMsgTV.setText(userInput);
        }
    }

    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
    public void cleanTextField(View view) {
        mBinding.userInputET.setText("");
    }
}
