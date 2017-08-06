package tw.ming.app.helloworid.mylayouttest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Page5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
    }
    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("data1", 123);
        intent.putExtra("data2", "III");
        setResult(369, intent);
        super.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
