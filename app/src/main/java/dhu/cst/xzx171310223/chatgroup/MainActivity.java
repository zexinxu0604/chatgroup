package dhu.cst.xzx171310223.chatgroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int i=1;//初始按钮个数
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    private ListView listView;
    private MsgAdapter adapter=null;
    public List<Msg> list=null;
    ArrayList<String> namelist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn3=findViewById(R.id.button4);
        btn4=findViewById(R.id.button5);
        btn5=findViewById(R.id.button6);
        btn6=findViewById(R.id.button7);
        btn7=findViewById(R.id.button8);
        btn8=findViewById(R.id.button9);
        btn1.setOnClickListener(new mClick());
        btn2.setOnClickListener(new mClick());
        btn3.setOnClickListener(new mClick());
        btn4.setOnClickListener(new mClick());
        btn5.setOnClickListener(new mClick());
        btn6.setOnClickListener(new mClick());
        btn7.setOnClickListener(new mClick());
        btn8.setOnClickListener(new mClick());
        //初始化控件
        listView=(ListView)findViewById(R.id.listview);
        list=new ArrayList<Msg>();
        initData();//初始化数据 将数据添加到容器中
        //将数据放入到适配器中
        adapter=new MsgAdapter(MainActivity.this,R.layout.chat_item,list);
        listView.setAdapter(adapter);
        namelist.add("群主");
    }
    public void initData(){

        Msg msg1=new Msg("群主","欢迎来到本聊天室");
        list.add(msg1);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(1,1,1,"添加用户");
        menu.add(1,2,2,"删除用户");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId())
        {
            case 1:
                Intent intent=new Intent(MainActivity.this,joinActivity.class);//建立连接
                startActivityForResult(intent,1);//发送请求值并请求返回值
                break;
            case 2:
                if(i==1)
                {
                    Toast.makeText(getApplication(),"不要删除群主",Toast.LENGTH_SHORT).show();
                    i++;
                }
                else if(i==2)
                {
                    Button btn=findViewById(R.id.button3);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==3)
                {
                    Button btn=findViewById(R.id.button4);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==4)
                {
                    Button btn=findViewById(R.id.button5);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==5)
                {
                    Button btn=findViewById(R.id.button6);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==6)
                {
                    Button btn=findViewById(R.id.button7);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==7)
                {
                    Button btn=findViewById(R.id.button8);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                else if(i==8)
                {
                    Button btn=findViewById(R.id.button9);
                    btn.setVisibility(View.INVISIBLE);
                    namelist.remove(namelist.size()-1);
                }
                i--;
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1){
            switch (resultCode){
                case 2:
                    String s=data.getStringExtra("buttonname");
                    if(TextUtils.isEmpty(s))
                    {
                        Toast.makeText(getApplication(),"用户名不能为空",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    else if(searchname(s))
                    {
                        Toast.makeText(getApplication(),"不能存在相同的名字",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    else {
                    if(i==1)
                    {
                        Button btn=findViewById(R.id.button3);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==2)
                    {
                        Button btn=findViewById(R.id.button4);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==3)
                    {
                        Button btn=findViewById(R.id.button5);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==4)
                    {
                        Button btn=findViewById(R.id.button6);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==5)
                    {
                        Button btn=findViewById(R.id.button7);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==6)
                    {
                        Button btn=findViewById(R.id.button8);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==7)
                    {
                        Button btn=findViewById(R.id.button9);
                        btn.setText(s);
                        namelist.add(s);
                        btn.setVisibility(View.VISIBLE);
                        i++;
                    }
                    else if(i==8)
                    {
                        Toast.makeText(getApplication(),"最大用户数为7",Toast.LENGTH_SHORT).show();
                    }
                    break;
                    }
                case 3:
                    break;
            }
        }
    }
    class mClick implements View.OnClickListener{
        public void onClick(View view){
            AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
            Button b = (Button)view;
            final String buttonText = b.getText().toString();
            final EditText et=new EditText(MainActivity.this);
            builder.setTitle("Say SomeThing");
            builder.setView(et);
            builder.setPositiveButton("发送",new DialogInterface.OnClickListener(){@Override
            public void onClick(DialogInterface dialog, int which)
            {
                String content=et.getText().toString();

                //判空
                if (TextUtils.isEmpty(content)){
                    Toast.makeText(getApplication(),"你输入的内容为空",Toast.LENGTH_SHORT).show();
                }else {
                    //不为空
                    Msg msg=new Msg(buttonText,content);
                    listView.setAdapter(adapter);
                    list.add(msg);
                    //刷新消息
                    adapter.notifyDataSetChanged();
                    listView.setSelection(list.size());//将listview定位到最后一行
                }
            }});
            builder.setNegativeButton("取消",null);
            builder.create();
            builder.show();
            }
        }
    public boolean searchname(String name)//查重
    {
        boolean ifsearch=false;
        for(int h=0;h<namelist.size();h++)
        {
            if(namelist.get(h).equals(name))
            {
                ifsearch=true;
                return ifsearch;
            }
         }
        return ifsearch;
    }
}
