package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class bottom extends AppCompatActivity {

    public class bottomsheet extends AppCompatActivity {
        TextInputLayout textInputLayout;
        TextInputEditText textInputEditText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bottomsheet);
            textInputLayout = findViewById(R.id.input_bottomtxtlayout);
            textInputEditText = findViewById(R.id.bottom_edtinput);
            textInputEditText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(bottomsheet.this, R.style.bottomsheetTheme);
                    View bottomsheet = LayoutInflater.from(getApplicationContext())
                            .inflate(R.layout.activity_bottomsheet, (LinearLayout) findViewById(R.id.bottom_container));
                    bottomSheetDialog.setContentView(bottomsheet);
                    bottomSheetDialog.show();
                }

            });

        }

    }
}