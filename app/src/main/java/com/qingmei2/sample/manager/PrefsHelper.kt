package com.qingmei2.sample.manager

import android.content.SharedPreferences
import com.qingmei2.rhine.util.prefs.string

class PrefsHelper(prefs: SharedPreferences) {

    var username by prefs.string("username", "")
    var password by prefs.string("password", "")
}