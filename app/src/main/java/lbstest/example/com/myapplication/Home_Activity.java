package lbstest.example.com.myapplication;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabSelectListener;
import com.roughike.bottombar.TabSelectionInterceptor;

public class Home_Activity extends AppCompatActivity {
    private BottomBar bottomBar;

    private BottomBarTab nearly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        bottomBar = findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(int tabId) {
                if (tabId == R.id.tab_favorites){
                    //选择指定id的标签
                    nearly = bottomBar.getTabWithId(R.id.tab_nearby);
                    nearly.setBadgeCount(12);
                }
            }
        });

        bottomBar.setTabSelectionInterceptor(new TabSelectionInterceptor() {
            @Override
            public boolean shouldInterceptTabSelection(@IdRes int oldTabId, @IdRes int newTabId) {
                // 点击无效
                if (newTabId == R.id.tab_restaurants ) {
                    // ......
                    // 返回 true 。代表：这里我处理了，你不用管了。
                    return true;
                }

                return false;
            }
        });
    }
}
