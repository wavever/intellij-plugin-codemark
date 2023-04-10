package com.wavever.codemark.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import com.wavever.codemark.data.CodeMark
import javax.swing.DefaultListModel

class CodeMarkToolWindowFactory : ToolWindowFactory {

    private val contentFactory = ContentFactory.SERVICE.getInstance()
    private val codeMarkModel = DefaultListModel<CodeMark>()

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val codeMarkToolWindow = CodeMarkToolWindow(toolWindow)
    }

    class CodeMarkToolWindow(toolWindow: ToolWindow) {

    }
}