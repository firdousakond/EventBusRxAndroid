package com.firdous.eventbus;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.fragment_two.*


class TwoFragment : Fragment() {

    private lateinit var disposal : Disposable

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onResume() {
        super.onResume()
        disposal = EventBus.subscribe<MessageEvent>()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { messageEvent -> txt_text.text = messageEvent.message}

    }

    override fun onPause() {
        super.onPause()
        disposal.dispose()
    }
}
