package com.test.tt100603;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

   AutoCompleteTextView act;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

      String str[] = {"AAA", "AAB", "BBC", "BBD", "CC", "DDD"};
      ArrayAdapter<CharSequence> adapter =
         new ArrayAdapter(
            MainActivity.this,
            android.R.layout.simple_spinner_item,
            str
         );
      act.setAdapter(adapter);
      act.setThreshold(2);
   }

}
