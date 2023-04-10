/*
 * Created by wavever on 2023/4/9.
 * Description: Action for add a mark.
 */
package com.wavever.codemark.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.psi.util.PsiUtilBase
import com.wavever.codemark.utils.Log

class EditMenuAddAction: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val editor = CommonDataKeys.EDITOR.getData(e.dataContext) ?: return
        // Program Structure Interface
        val file = PsiUtilBase.getPsiFileInEditor(editor, project) ?: return
        val lineNumber = editor.caretModel.visualPosition.line + 1
        Log.d("wavever_tag", "lineNumber=$lineNumber, name=${file.virtualFile.name}")
    }

    override fun update(e: AnActionEvent) {
        super.update(e)
        e.presentation.isEnabledAndVisible = true
    }
}