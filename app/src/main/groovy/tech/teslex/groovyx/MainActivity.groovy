package tech.teslex.groovyx

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import groovy.transform.CompileStatic

@CompileStatic
class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = (Button) findViewById(R.id.button)
        name = (EditText) findViewById(R.id.ename)

        btn.onClickListener = {
            hello(name.text.toString())
        }
    }

    def hello(String name) {
        def toast = Toast.makeText(this, "Hello, $name!", Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}
