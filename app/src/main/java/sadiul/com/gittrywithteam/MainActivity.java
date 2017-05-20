package sadiul.com.gittrywithteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btShouv, btRaza, btShamin, btJoni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btShouv = (Button) findViewById(R.id.btStartShovo);
        btShamin = (Button) findViewById(R.id.btShamin);
        btJoni = (Button) findViewById(R.id.btStartJoni);
        btRaza = (Button) findViewById(R.id.btStartRazurl);

        btShouv.setOnClickListener(this);
        btShamin.setOnClickListener(this);
        btJoni.setOnClickListener(this);
        btRaza.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){


            case R.id.btStartShovo:

                Intent intent = new Intent(getApplicationContext(), ShuvoActivity.class);
                startActivity(intent);

                break;

            case R.id.btShamin:
                Intent intent1 = new Intent(getApplicationContext(), Shamim.class);
                startActivity(intent1);

                break;


            case R.id.btStartJoni:

                Intent intent2 = new Intent(getApplicationContext(), Jone.class);
                startActivity(intent2);

                break;

            case R.id.btStartRazurl:

                Intent intent3 = new Intent(getApplicationContext(), Rezaul.class);
                startActivity(intent3);
                break;

        }
    }


}
