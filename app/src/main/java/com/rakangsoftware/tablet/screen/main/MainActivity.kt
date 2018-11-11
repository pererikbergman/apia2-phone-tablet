package com.rakangsoftware.tablet.screen.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.rakangsoftware.tablet.R
import com.rakangsoftware.tablet.R.id.fragment_container_primary
import com.rakangsoftware.tablet.R.id.fragment_container_secondary
import com.rakangsoftware.tablet.utils.loadFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        if (findViewById<View>(R.id.fragment_container_secondary) != null) {
            loadFragment(MasterFragment.newInstance(), fragment_container_primary)
            loadFragment(DetailFragment.newInstance(), fragment_container_secondary)
        } else {
            loadFragment(MasterFragment.newInstance(), fragment_container_primary)
        }
    }
}