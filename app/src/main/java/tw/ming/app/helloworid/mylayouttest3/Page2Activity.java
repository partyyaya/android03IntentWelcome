package tw.ming.app.helloworid.mylayouttest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public void doExit(View view){
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        Log.i("ming","page2 finish");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ming","page2 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ming","page2 onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ming","page2 onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ming","page2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ming","page2 onDestroy");
    }
}
