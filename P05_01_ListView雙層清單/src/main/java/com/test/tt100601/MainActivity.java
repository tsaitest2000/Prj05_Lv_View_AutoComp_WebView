package com.test.tt100601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

   Spinner sp;
   ArrayList<Map<String, String>> myList;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      myList = new ArrayList<>();
      sp = (Spinner) findViewById(R.id.spinner);

      Map m1 = new HashMap();
      m1.put("city", "台北");
      m1.put("code", "02");
      myList.add(m1);

      Map m2 = new HashMap();
      m2.put("city", "台中");
      m2.put("code", "04");
      myList.add(m2);

      Map m3 = new HashMap();
      m3.put("city", "台南");
      m3.put("code", "06");
      myList.add(m3);

      SimpleAdapter adapter = new SimpleAdapter(
         MainActivity.this,
         myList,
         android.R.layout.simple_list_item_2,
         new String[]{"city", "code"},
         new int[]{android.R.id.text1, android.R.id.text2}
      );
      sp.setAdapter(adapter);
      sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Map m = myList.get(position);
            Toast.makeText(MainActivity.this, "Show City:" + m.get("city"), Toast.LENGTH_SHORT).show();
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
      });
   }

}
