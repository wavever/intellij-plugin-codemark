package icons

import com.intellij.icons.AllIcons
import com.intellij.openapi.util.IconLoader
import com.intellij.ui.AnimatedIcon

object CodeMarkIcons {

    @JvmField
    val Mark = loadIcon("/icons/code_mark.svg")

    @JvmField
    val markList = loadIcon("/icons/code_mark_list.svg")

    @JvmField
    val MarkGroup = AllIcons.Nodes.BookmarkGroup

    val loadingIcon = AnimatedIcon.Big()

    private fun loadIcon(path: String) = IconLoader.getIcon(path, CodeMarkIcons::class.java)


}