package com.example.coordinatorlayout_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_layout_based.toolbar
import kotlinx.android.synthetic.main.activity_scroll_based.*

class ScrollBasedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_based)

        // You can add the code for your FAB also.
    }

}