package com.radmanhayati.eventbus_flow

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var eventBus = EventBus.instance
        GlobalScope.launch {
            eventBus.events.filter { event -> event == AppEvent.LOGIN }.collectLatest {
                Toast.makeText(applicationContext, "lksdj", Toast.LENGTH_SHORT).show()
            }
        }
    }
}