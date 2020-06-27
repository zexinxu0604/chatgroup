package dhu.cst.xzx171310223.chatgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class joinActivity extends AppCompatActivity {
    Button btn1, btn2;
    EditText editText;
    int x=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        btn1 = findViewById(R.id.button3);
        btn2 = findViewById(R.id.button4);
        editText = findViewById(R.id.edittext);
        btn2.setOnClickListener(new backclick());
        btn1.setOnClickListener(new createClick());
    }
    class createClick implements View.OnClickListener {
        public void onClick(View view) {
            String str=editText.getText().toString();
            Intent intent=new Intent();
            intent.putExtra("buttonname",str);
            setResult(2,intent);//返回值并说明返回码为2
            finish();
        }
    }
    class backclick implements View.OnClickListener{
        public void onClick(View view)
        {
            Intent intent=new Intent();
            setResult(3,intent);//返回码为3
            finish();
        }
    }
}