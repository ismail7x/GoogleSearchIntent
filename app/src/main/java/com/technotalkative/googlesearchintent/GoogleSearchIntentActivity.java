package com.technotalkative.googlesearchintent;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GoogleSearchIntentActivity extends Activity {
	
	private EditText editTextInput;
    private String url;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       
        editTextInput = (EditText) findViewById(R.id.editTextInput);

 
       
   }
    
    public void onSearchClick(View v)
    {
        Uri uriUrl = Uri.parse("http://www.gsalafi.com");
//        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
//        startActivity(launchBrowser);
        try {
    		 //Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
             //Intent intent = new Intent(Intent.ACTION_WEB_SEARCH, Uri.parse("http://www.gsalafi.com"));

             //Intent intent = new Intent(Intent.ACTION_WEB_SEARCH).setData(uriUrl);

            Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
             String term = editTextInput.getText().toString();
             intent.putExtra(SearchManager.QUERY, term);
             startActivity(intent);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }
}

