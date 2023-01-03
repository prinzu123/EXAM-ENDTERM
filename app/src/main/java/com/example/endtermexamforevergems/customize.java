package com.example.endtermexamforevergems;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class customize  extends AppCompatActivity implements View.OnClickListener {
CheckBox checkboxone, checkboxtwo, checkboxthree;
    String  resultMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom);
        checkboxone=findViewById(R.id.diamond);
        checkboxtwo=findViewById(R.id.emerald);
        checkboxthree=findViewById(R.id.ruby);
        Button btnCompute = (Button) findViewById(R.id.btn_buy);

        btnCompute.setOnClickListener(this);

    }

    public void onClick(View v){
        Toast.makeText(this, "Calculating Speed...", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }
    public void ComputeResult() {

        int addon = 0;
        if (checkboxone.isChecked()) {
            addon = 2500;
            // Casted result to int type, remove to show decimal value
            resultMessage = (int) addon + " Diamond ";

            // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
            Bundle args = new Bundle();
            args.putString("result", resultMessage);

            // Create a dialog instance
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            // Pass on dialog argument(args), the result
            dialogFragmentImp.setArguments(args);
            // Display the Dialog
            dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
            // Reset EditTexts
        }
        if (checkboxtwo.isChecked()) {
            addon = 2500;
            // Casted result to int type, remove to show decimal value
            resultMessage = (int) addon + " Diamond ";

            // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
            Bundle args = new Bundle();
            args.putString("result", resultMessage);

            // Create a dialog instance
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            // Pass on dialog argument(args), the result
            dialogFragmentImp.setArguments(args);
            // Display the Dialog
            dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
            // Reset EditTexts
        }
        if (checkboxthree.isChecked()) {
            addon = 2500;
            // Casted result to int type, remove to show decimal value
            resultMessage = (int) addon + " Diamond ";

            // Create Bundle instance, this will allow transfer of data from Activity to DialogFragment
            Bundle args = new Bundle();
            args.putString("result", resultMessage);

            // Create a dialog instance
            DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
            // Pass on dialog argument(args), the result
            dialogFragmentImp.setArguments(args);
            // Display the Dialog
            dialogFragmentImp.show(getSupportFragmentManager(), "Display Result");
            // Reset EditTexts
        }
    }
}