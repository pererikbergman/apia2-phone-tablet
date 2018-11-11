package com.rakangsoftware.tablet.utils

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.loadFragment(fragment: Fragment, container: Int) {
    supportFragmentManager
        .beginTransaction()
        .replace(
            container,
            fragment
        )
        .commit()
}