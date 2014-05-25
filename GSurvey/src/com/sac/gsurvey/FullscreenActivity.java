package com.sac.gsurvey;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
@SuppressLint("NewApi") public class FullscreenActivity extends Activity {
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       
        setContentView(R.layout.activity_fullscreen);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

    }
    
    public void login(View view){
    	startActivity(new Intent("android.intent.action.LOGIN"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	super.onCreateOptionsMenu(menu);
    	MenuInflater menuInflater =getMenuInflater();
    	//menuInflater.inflate(R.menu.main_menu, menu);
    	return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	super.onOptionsItemSelected(item);
    	/*switch(item.getItemId()){
    	case R.id.menu_login:
    		
    		break;
    	case R.id.menu_register:
    		
    		break;
    	case R.id.menu_setting:
    		
    		break;
    	
    	}*/
    	return super.onOptionsItemSelected(item);
    }
    
    public void home(View view){
    	startActivity(new Intent("android.intent.action.MAIN"));
    }
    public void register(View view){
    	startActivity(new Intent("android.intent.action.REGISTERTOLOGIN"));
    }
    public void info(View view){
    	startActivity(new Intent("android.intent.action.INFO"));
    }

}
