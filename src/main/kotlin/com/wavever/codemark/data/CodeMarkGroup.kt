package com.wavever.codemark.data

data class CodeMarkGroup(var name: String, var desc: String? = null) {

    val codeMarks = mutableListOf<CodeMark>()

}