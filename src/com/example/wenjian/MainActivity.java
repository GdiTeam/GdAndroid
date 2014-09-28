package com.example.wenjian;


import android.app.Activity;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        FileOutputStream output = null;
        try {
			output=super.openFileOutput("my.txt", Activity.MODE_PRIVATE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        PrintStream out=new PrintStream(output);
        out.println("123425682");
        out.close();}
   
    }

    
    
