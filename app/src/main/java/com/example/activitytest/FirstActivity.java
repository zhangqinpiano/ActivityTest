package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity", this.toString());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first);
        Button button1=(Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //standard 启动模式Intent intent=new Intent(FirstActivity.this, FirstActivity.class);
                //向下一个activity传递数据 String data="Hello SecondActivity";
                Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                //intent.putExtra("extra_data", data);
                // 启动浏览器 Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                 // 隐式 Intent intent=new Intent("com.example.activitytest.ACTION_START");
                 // intent.addCategory("com.example.activitytest.MY CATEGORY");
                // 显式 Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
                 startActivity(intent);
                // 提示语 Toast.makeText(FirstActivity.this, "You click Button1",
                        // Toast.LENGTH_SHORT).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem Item) {
        switch (Item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
            }
            return true;
        }
    }

