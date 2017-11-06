package my.edu.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    EditText id, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        id = (EditText)findViewById(R.id.idText);
        email = (EditText)findViewById(R.id.emailText);

    }

    public void updateProfile(View view){
        Intent intent = new Intent();
        String idString ,emailString;
        idString = id.getText().toString();
        emailString = email.getText().toString();

        intent.putExtra(MainActivity.USER_ID, idString);
        intent.putExtra(MainActivity.USER_EMAIL, emailString);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE, intent);
        finish();
    }

}
