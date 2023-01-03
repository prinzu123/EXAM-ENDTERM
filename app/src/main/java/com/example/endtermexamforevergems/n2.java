package com.example.endtermexamforevergems;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class n2    extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkboxone, checkboxtwo, checkboxthree;
    EditText  etNumber;
    String strNumber, resultMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r4);
        checkboxone=findViewById(R.id.diamond);
        checkboxtwo=findViewById(R.id.emerald);
        checkboxthree=findViewById(R.id.ruby);
        Button btnCompute = (Button) findViewById(R.id.btn_buy);
        btnCompute.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Processing...", Toast.LENGTH_SHORT).show();
        ComputeResult();
    }

    public void ComputeResult() {

        int addon = 0;
        if (checkboxone.isChecked()) {
            addon = 2500;

            etNumber = (EditText) findViewById(R.id.etNumber);
            if (etNumber.getText().toString().isEmpty()) {
                strNumber = "0";
            } else {
                strNumber = etNumber.getText().toString();
            }
            double rawNumber = Double.parseDouble(strNumber);

            if (rawNumber >= 10) {
                double calc1 = (28 + addon) * rawNumber ;
                double calc2 =  calc1 * .10;
                double result = calc1 - calc2;

                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + " has been Paid | Thank you for Purchasing our Wholesale! ";

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
                clearEditText();


            }
            else {
                double result = 28 + addon * rawNumber;
                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + "Thank you for Purchasing our Forever Gem Ring";

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
                clearEditText();
            }
        }
        if (checkboxtwo.isChecked()) {
            addon = 1900;

            etNumber = (EditText) findViewById(R.id.etNumber);
            if (etNumber.getText().toString().isEmpty()) {
                strNumber = "0";
            } else {
                strNumber = etNumber.getText().toString();
            }
            double rawNumber = Double.parseDouble(strNumber);

            if (rawNumber >= 10) {
                double results = 28 + addon * rawNumber;
                double percentage = results * 10/100;
                double result = 28 + addon * rawNumber - percentage;

                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + " has been Paid | Thank you for Purchasing our Wholesale! ";

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
                clearEditText();


            }
            else {
                double result = 28 + addon * rawNumber;
                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + "Thank you for Purchasing our Forever Gem Ring";

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
                clearEditText();
            }


        }
        if (checkboxthree.isChecked()) {
            addon = 1800;

            etNumber = (EditText) findViewById(R.id.etNumber);
            if (etNumber.getText().toString().isEmpty()) {
                strNumber = "0";
            } else {
                strNumber = etNumber.getText().toString();
            }
            double rawNumber = Double.parseDouble(strNumber);

            if (rawNumber >= 10) {
                double calc1 = (28 + addon) * rawNumber ;
                double calc2 =  calc1 * .10;
                double result = calc1 - calc2;

                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + " has been Paid | Thank you for Purchasing our Wholesale! ";

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
                clearEditText();


            }
            else {
                double result = 28 * rawNumber;
                // Casted result to int type, remove to show decimal value
                resultMessage = (int) result + "Thank you for Purchasing our Forever Gem Ring";

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
                clearEditText();
            }
        }


    }





    public void clearEditText() {
        etNumber.getText().clear();
        etNumber.requestFocus();
    }
}

