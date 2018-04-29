package com.teens.city.htmleditorbasic;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        try {
            RichEditor mEditor=findViewById(R.id.editor);
            //mEditor.setEditorHeight(200);
            //mEditor.setEditorFontSize(22);

            mEditor.setEditorFontColor(Color.BLUE);

            //mEditor.setEditorBackgroundColor(Color.BLUE);
            //mEditor.setBackgroundColor(Color.BLUE);
            //mEditor.setBackgroundResource(R.drawable.bg);
            mEditor.setPadding(10, 10, 10, 10);
            //mEditor.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg");
            //mEditor.setPlaceholder("Insert text here...");
            mEditor.setInputEnabled(false);

            String str=getIntent().getExtras().getString("TAG"); //Amit <u>fhhjj <span style="background-color: rgb(255, 255, 0);">&nbsp;fghj</span></u>
            mEditor.setHtml(str);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
