package c.c.b.pwdinputedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private PwdEditText p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = findViewById(R.id.p);
        p.setOnTextChangeListener(new PwdEditText.OnTextChangeListener() {
            @Override
            public void onTextChange(String pwd) {
                if (pwd.length() == p.getTextLength()){
                    //输入监听
                    Toast.makeText(MainActivity.this,pwd,Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.clearText(); //清空输入内容
            }
        });
    }
}
