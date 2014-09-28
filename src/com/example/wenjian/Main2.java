package com.example.wenjian;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 extends Activity{
	
	
	private TextView msg=null;	
	
    @Override
	public void onCreate(Bundle savedInstanceState){
    	super.onCreate(savedInstanceState);
    	super.setContentView(R.layout.activity_main);
    	this.msg=(TextView)super.findViewById(R.id.msg);
    	FileInputStream input=null;
    	try{
    		input=super.openFileInput("my.txt");
    	} catch(FileNotFoundException e){
    		e.printStackTrace();}
    	Scanner scan=new Scanner(input);
    	while(scan.hasNext()){
    		this.msg.append(scan.next()+"\n");
    		scan.close();}
    	
    }

}
