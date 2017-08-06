package tw.ming.app.helloworid.mylayouttest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View test2, test3, test4;

    public void test1(View view){
        Intent intent = new Intent(this,Page2Activity.class);//在檔案尋找類別物件實體
        startActivity(intent);
    }
    public void test2(View view){

    }
    public void test3(View view){

    }
    public void test4(View view){

    }
    public void test34(View view){

        if (view == test3) {
            Log.i("ming", "test3");
        }else if (view == test4){
            Log.i("ming", "test4");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ming", "onCreate");

        test2 = findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("ming", "test2");
            }
        });
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);

    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ming","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ming","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ming","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ming","onDestroy");
    }
}
