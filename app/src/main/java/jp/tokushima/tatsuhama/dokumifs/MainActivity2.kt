package jp.tokushima.tatsuhama.dokumifs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HOGE()
        HUGA()
    }

    private fun HOGE(): String {
        return "HOGE"
    }

    private fun HUGA(): String {
        return "HUGA"
    }
}
