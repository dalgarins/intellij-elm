package org.elm.lang.core.psi.elements

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.util.PsiTreeUtil
import org.elm.lang.core.psi.ElmPsiElementImpl

class ElmAnonymousFunction(node: ASTNode) : ElmPsiElementImpl(node) {

    val patternList: List<ElmPattern>
        get() = PsiTreeUtil.getChildrenOfTypeAsList(this, ElmPattern::class.java)

    val expression: ElmExpression
        get() = findNotNullChildByClass(ElmExpression::class.java)

}