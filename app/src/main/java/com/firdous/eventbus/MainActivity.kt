package com.firdous.eventbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragments()
    }

    private fun addFragments(){
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.frame_one,OneFragment())
        ft.add(R.id.frame_two,TwoFragment())
        ft.commit()
    }
}
