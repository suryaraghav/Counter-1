package surya.counter1;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;
import android.graphics.Color;




public class MainActivity extends Activity {
    int counter = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.textview1);
        text.setText(""+counter+"");
        final Button button = (Button) findViewById(R.id.buttons);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter++;
                text.setText(""+counter);
                text.setTextColor(Color.RED);

            }
        });

    }
}
