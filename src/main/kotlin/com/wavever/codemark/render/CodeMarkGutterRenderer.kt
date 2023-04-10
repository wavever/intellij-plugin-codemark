package com.wavever.codemark.render

import com.intellij.openapi.editor.markup.GutterIconRenderer
import icons.CodeMarkIcons
import javax.swing.Icon

class CodeMarkGutterRenderer: GutterIconRenderer() {

    override fun equals(other: Any?): Boolean {
        return other is CodeMarkGutterRenderer
    }

    override fun hashCode(): Int {
        return 1
    }

    override fun getIcon(): Icon {
        return CodeMarkIcons.Mark
    }
}