package tw.ming.app.helloworid.mylayouttest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static tw.ming.app.helloworid.mylayouttest3.MainApp.data4;

public class MainActivity extends AppCompatActivity {
    private View test2, test3, test4;
    private MainApp mainApp;//只要宣告此行都可取得參數

    public void test1(View view){
        Intent intent = new Intent(this,Page2Activity.class);//在檔案尋找類別物件實體
        startActivity(intent);
    }
    public void test2(View view){
        Intent intent = new Intent(this, Page3.class);
        intent.putExtra("username", "ming");
        intent.putExtra("stage", (int)(Math.random()*100));
        intent.putExtra("sound", false);
        startActivity(intent);
    }
    public void test3(View view){
        Intent intent = new Intent(this, Page4.class);
        startActivityForResult(intent, 100);

    }
    public void test4(View view){
        Intent intent = new Intent(this, Page5.class);
        startActivityForResult(intent, 200);
    }

    public void test34(View view){

        if (view == test3) {
            Log.i("ming", "test3");
        }else if (view == test4){
            Log.i("ming", "test4");
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("ming", "back: " + requestCode + " : " + resultCode);
        if (requestCode == 200){
            int data1 = data.getIntExtra("data1", -1);
            String data2 = data.getStringExtra("data2");
            Log.i("ming", data1 + " : " + data2);
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

        mainApp=(MainApp) getApplication();
        Log.i("ming","MainApp:username = "+mainApp.username);
        Log.i("ming","MainApp:data3 = "+mainApp.data3);
        Log.i("ming","MainApp:data4= "+data4);

        mainApp.data3=444;
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
        Log.i("ming", "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ming","onDestroy");
    }
}
