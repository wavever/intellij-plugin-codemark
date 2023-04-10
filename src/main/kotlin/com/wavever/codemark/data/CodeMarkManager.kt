package com.wavever.codemark.data

import com.intellij.openapi.components.PersistentStateComponent
import org.jdom.Element
import java.io.File

class CodeMarkManager: PersistentStateComponent<Element> {

    companion object {
        private const val DEFAULT_EXPORT_PATH = ""
    }

    private val codeMarks = mutableListOf<CodeMark>()

    fun addCodeMark(filePath: String, lineNumber: Int, name: String) {
        //codeMarks.add(CodeMark(filePath, lineNumber, name))
    }

    fun removeCodeMark(filePath: String, lineNumber: Int) {
        codeMarks.find { it.filePath == filePath && it.lineNumber == lineNumber }?.let {
            codeMarks.remove(it)
        }
    }

    /*fun export(path: String = DEFAULT_EXPORT_PATH) {
        File(DEFAULT_EXPORT_PATH).writeText(codeMarks.joinToString("\n") {
            "${it.filePath} ${it.lineNumber} ${it.name}"
        })
    }*/

    override fun getState(): Element? {
        TODO("Not yet implemented")
    }

    override fun loadState(state: Element) {
        TODO("Not yet implemented")
    }
}