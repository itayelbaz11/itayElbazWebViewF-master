package com.example.user.itayelbazwebviewf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    WebView WV;
    EditText ET1, ET2, ET3;
    String aa, b, c;
    String stringUrl="http://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WV.getSettings().setJavaScriptEnabled(true);
        WV.setWebViewClient(new MyWebViewClient());

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        WV = (WebView) findViewById(R.id.WV);
        ET1 = (EditText) findViewById(R.id.ET1);
        ET1 = (EditText) findViewById(R.id.ET1);
        ET2 = (EditText) findViewById(R.id.ET2);
        ET3 = (EditText) findViewById(R.id.ET3);


    }


    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView WV, String urL) {
            WV.loadUrl(urL);
            return true;
        }
    }

    public void onclick(View view) {
        aa=ET1.getText().toString();
        b=ET2.getText().toString();
        c=ET3.getText().toString();
        stringUrl=stringUrl+aa+"x%5E2%2B"+b+"x%2B"+c;
        WV.loadUrl(stringUrl);

    }



}
