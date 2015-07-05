package com.qualcomm.vuforia.samples.VuforiaSamples.app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by usuario on 15/06/2015.
 */
public class SamplesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "YXK5EgDgzUIptmGKXNDti0dtI88IW8PD64hSHXOx", "3nVwkL9JXe0UhDT1OwubMq20FNGivPxtrVWV662q");

        /*ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        Log.d("Parse","Parse si");
        testObject.saveInBackground();
        */

    }

    /*public static void updateParseInstallation(ParseUser user){
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
    */
}
