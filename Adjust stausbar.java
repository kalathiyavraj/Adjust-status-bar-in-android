Tools.setSystemBarColor(this, 17170443);
Tools.setSystemBarLight(this);



//class

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;

public class Tools {
    public static void setSystemBarColor(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(activity.getResources().getColor(i));
        }
    }

    public static void setSystemBarLight(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            View findViewById = activity.findViewById(16908290);
            findViewById.setSystemUiVisibility(findViewById.getSystemUiVisibility() | 8192);
        }
    }
}
