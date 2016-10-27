package jp.tokushima.tatsuhama.dokumifs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HOGE();
        HUGA();
        startActivity(new Intent(this, MainActivity2.class));
    }

    private String HOGE() {
        return "HOGE";
    }

    private String HUGA(){
        return "HUGA";
    }
}
