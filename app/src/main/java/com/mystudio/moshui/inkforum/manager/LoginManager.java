package com.mystudio.moshui.inkforum.manager;

/**
 * Created by lianghuiyu on 2017/11/19.
 */

public class LoginManager {
    private boolean loginFlag = false;

    public boolean isLogin() {
        return loginFlag;
    }

    public void setLoginFlag(boolean loginFlag) {
        this.loginFlag = loginFlag;
    }

}
