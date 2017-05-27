package OpenQQPlugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;


/**
 * This class echoes a string called from JavaScript.
 */
public class OpenQQPlugin extends CordovaPlugin {
    private Activity mActivity;

      @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        // TODO Auto-generated method stub
        super.initialize(cordova, webView);
        mActivity = cordova.getActivity();
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("openQQ")) {
            String message = args.getString(0);
            String url="mqqwpa://im/chat?chat_type=wpa&uin="+message+""; 
            mActivity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            return true;
        }
        return false;
    }

 
}
