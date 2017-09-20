package strathmore.com.bbitlab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitySignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        Button btnSignup = (Button) findViewById(R.id.button);
        final EditText txtFname= (EditText) findViewById(R.id.firstname);
        final EditText txtLname= (EditText) findViewById(R.id.lastname);
        final EditText txtEmail= (EditText) findViewById(R.id.email);
        final EditText txtPhone= (EditText) findViewById(R.id.phone);
        final EditText txtPass= (EditText) findViewById(R.id.password);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fnamevalue = txtFname.getText().toString();
                String lnamevalue = txtLname.getText().toString();
                String emailvalue = txtEmail.getText().toString();
                String phonevalue = txtPhone.getText().toString();
                String passvalue = txtPass.getText().toString();

                Intent homepageintent= new Intent(ActivitySignUp.this,ActivityHome.class);
                homepageintent.putExtra("LNAME",fnamevalue);
                homepageintent.putExtra("FNAME",lnamevalue);
                homepageintent.putExtra("EMAIL", emailvalue);
                homepageintent.putExtra("PHONE",phonevalue);
                homepageintent.putExtra("PASS",passvalue);

                startActivity(homepageintent);


            }
        });


    }

}
