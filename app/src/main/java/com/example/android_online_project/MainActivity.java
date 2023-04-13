package com.example.android_online_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.DialogInterface;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;


public class MainActivity extends AppCompatActivity {
    boolean invalid = false;
    TextView txtalertName;
    EditText first,last,Userreg,UserContact,email,age;
    Button SubmitSave;
    RadioButton Malebtn,Femalbtn,otherbtn;


    @Override
    public void onBackPressed() {
        // Create the object of AlertDialog Builder class
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        // Set the message show for the Alert time
        builder.setMessage("Do you want to exit ?");

        // Set Alert Title
        builder.setTitle("Alert !");

        // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        builder.setCancelable(false);

        // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setPositiveButton("Yes", (DialogInterface.OnClickListener) (dialog, which) -> {
            // When the user click yes button then app will close
            finish();
        });

        // Set the Negative button with No name Lambda OnClickListener method is use of DialogInterface interface.
        builder.setNegativeButton("No", (DialogInterface.OnClickListener) (dialog, which) -> {
            // If user click no then dialog box is canceled.
            dialog.cancel();
        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();
        // Show the Alert Dialog box
        alertDialog.show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first=findViewById(R.id.firstName);
        last=findViewById(R.id.lastName);
        UserContact=findViewById(R.id.userContact);
        Userreg=findViewById(R.id.reg);
        email=findViewById(R.id.email);
        age=findViewById(R.id.age);
        Malebtn=findViewById(R.id.Male);
        Femalbtn=findViewById(R.id.Female);
        otherbtn=findViewById(R.id.others);
        SubmitSave = findViewById(R.id.btnSubmit);
        SubmitSave.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                String name = first.getText().toString();
                String name2 = last.getText().toString();
                String contact = UserContact.getText().toString();
//                String comment=UserComment.getText().toString();
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pleas fill the field", Toast.LENGTH_SHORT).show();
                } else if (name.equals("Sameh") || name.equals("UlHaq")) {
                    invalid = true;
                    txtalertName.setText("Name Already exist");
                } else if (name2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pleas fill the  field", Toast.LENGTH_SHORT).show();
                } else if (contact.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Pleas fill the Contact field", Toast.LENGTH_SHORT).show();
                }

//                else if (comment.isEmpty()){
//                    Toast.makeText(MainActivity.this,"Pleas fill the Comment field",Toast.LENGTH_SHORT).show();
//                }



            }
        });








    }
}