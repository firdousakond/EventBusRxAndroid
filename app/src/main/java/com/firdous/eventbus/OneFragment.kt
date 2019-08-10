package com.firdous.eventbus

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)

    }

    override fun onResume() {
        super.onResume()
        setListener()
    }

    private fun setListener(){
        btn_submit.setOnClickListener {
            if(!TextUtils.isEmpty(et_name.text))
            EventBus.post(MessageEvent(et_name.text.toString()))
        }
    }

}
