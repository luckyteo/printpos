package devsimple.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.devsimple.printpos.DemoToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DemoToast.showMessage(this, "Hello world");
    }
}