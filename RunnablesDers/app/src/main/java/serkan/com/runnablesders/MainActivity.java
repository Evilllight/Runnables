package serkan.com.runnablesders;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int numara=0;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView1);
    }

    public void start(View view){

        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {

                textView.setText("Süre: "+numara);
                numara++;
                handler.postDelayed(this,1000);

            }
        };

        handler.post(runnable);



    }

    public void stop(View view){

        handler.removeCallbacks(runnable);
        //numara=0;

        textView.setText("Süre: "+numara);


    }

}
