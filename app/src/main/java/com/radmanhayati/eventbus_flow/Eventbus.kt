package com.radmanhayati.eventbus_flow

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class EventBus {

    private val _events = MutableSharedFlow<AppEvent>()
    val events = _events.asSharedFlow()

    suspend fun invokeEvent(event: AppEvent) = _events.emit(event)

    companion object{
        val instance = EventBus()
    }
}

enum class AppEvent {
    LOGOUT,
    LOGIN
}