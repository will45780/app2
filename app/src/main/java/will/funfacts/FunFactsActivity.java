package will.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private SetColor mSetColor = new SetColor();
    private EditText value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        Button ibutton = (Button) findViewById(R.id.ibutton);
        Button youbutton = (Button) findViewById(R.id.youbutton);
        TextView total = (TextView) findViewById(R.id.total);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ibutton.setOnClickListener(onClickListener);
                total.setText("changed!");
            }
        };


    }
}








