package net.yureisd.futbolsala;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button= (Button)findViewById(R.id.btnPlayers);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openActivity(view, PlayersListActivity.class);
            }
        });


    }

    protected void openActivity(View view, final Class<? extends Activity> nextActivity){
        Intent myIntent = new Intent(this, nextActivity);
        this.startActivity(myIntent);
    }
}
