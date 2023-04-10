package com.wavever.codemark.listener

import com.intellij.ide.FrameStateListener
import com.wavever.codemark.utils.Log

class CodeMarkFrameStateListener: FrameStateListener {

    companion object {
        private const val TAG = "CodeMarkFrameStateListener"
    }

    override fun onFrameActivated() {
        Log.d(TAG, "onFrameActivated")
    }

    override fun onFrameDeactivated() {
        Log.d(TAG, "onFrameDeactivated")
    }
}