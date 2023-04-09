/*
 * Created by wavever on 2022/04/09.
 * Description: Util class for sample print log like in Android.
 */
package com.wavever.codemark.utils

import com.intellij.openapi.diagnostic.thisLogger

object Log {

    /**
     *
     *
     * @param tag
     * @param message
     */
    fun d(tag: String, message: String) {
        thisLogger().debug("$tag -- $message")
    }

    /**
     * @param tag
     * @param message
     */
    fun i(tag: String, message: String, t: Throwable? = null) {
        thisLogger().info("$tag -- $message", t)
    }
}