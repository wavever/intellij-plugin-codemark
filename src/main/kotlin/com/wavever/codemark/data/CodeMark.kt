package com.wavever.codemark.data

import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.pom.Navigatable

data class CodeMark(private val mId: Int = 1, val filePath: String, val lineNumber: Int, val content: String) :
    Navigatable {

    private lateinit var mTarget: OpenFileDescriptor

    override fun navigate(requestFocus: Boolean) {
        mTarget.navigate(requestFocus)
    }

    override fun canNavigate(): Boolean {
        return mTarget.canNavigate()
    }

    override fun canNavigateToSource(): Boolean {
        return mTarget.canNavigateToSource()
    }
}
