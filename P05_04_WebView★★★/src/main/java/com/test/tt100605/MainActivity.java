package com.test.tt100605;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

   WebView wv;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      wv = (WebView) findViewById(R.id.webView);
      wv.getSettings().setJavaScriptEnabled(true);
      wv.setWebViewClient(new WebViewClient());
      // wv.loadUrl("http://tw.yahoo.com/");
      wv.loadUrl("file:///android_asset/index.html");
   }

   @Override
   public void onBackPressed() {
      if (wv.getUrl().contains("index.html")) {
         super.onBackPressed(); // BackPressed：按下UI畫面中的上一頁按鈕
      } else {
         wv.goBack(); // 模擬回到上一頁(活動)的功能
      }
   }

}
