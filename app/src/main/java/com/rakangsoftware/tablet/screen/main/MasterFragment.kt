package com.rakangsoftware.tablet.screen.main

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rakangsoftware.tablet.R

class MasterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.master_fragment, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MasterFragment()
    }
}
