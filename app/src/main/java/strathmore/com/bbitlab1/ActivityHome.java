package strathmore.com.bbitlab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
    String fnamevalue;
    String lnamevalue;
    String emailvalue;
    String phonevalue;
    String passvalue;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent homepageintent = getIntent();
        fnamevalue = getIntent().getExtras().getString("LNAME");
        lnamevalue = getIntent().getExtras().getString("FNAME");
        emailvalue = getIntent().getExtras().getString("EMAIL");
        phonevalue = getIntent().getExtras().getString("PHONE");
        passvalue = getIntent().getExtras().getString("PASS");

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("fnamevalue:"+" "+'\n' + "lnamevalue:"+" "+'\n' + "emailvalue:"+" "+'\n' + "phonevalue:"+" "+'\n'+"passvalue:"+" ");
    }

}
