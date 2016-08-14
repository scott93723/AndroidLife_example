package tom.com.myapplication;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

       // 1.當activity 準備要產生 呼叫onCreate方法
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);

    }


    @Override

    // 2.Acitivy 產生後  尚未出現在手機上,呼叫onStart 方法   ?!搞了這麼九還出現在螢幕?
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();
    }
    //3.當Activty 出現在螢幕上，呼叫orResume 方法  呼天嗆地終於呼叫出來了?
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }

    //4.當使用者不爽用appg時 按下返回鍵想要結束Activity 要呼叫onPause方法  因為安卓想叫他冷靜一點 暫停了
    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();
    }





    //5.當Activity 從螢幕消失的無影無蹤,只好呼叫  onStop方法了    小安安不爽了
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();
    }


//    6.要完全殺死小安安 結束Activity之前 呼叫onDestroy方法

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();
    }

}