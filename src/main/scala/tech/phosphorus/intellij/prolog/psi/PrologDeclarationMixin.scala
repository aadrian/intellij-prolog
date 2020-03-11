package tech.phosphorus.intellij.prolog.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.scope.PsiScopeProcessor
import com.intellij.psi.{PsiElement, PsiFileFactory, PsiNameIdentifierOwner, ResolveState}
import com.intellij.util.IncorrectOperationException
import tech.phosphorus.intellij.prolog.PrologLanguage

abstract class PrologDeclarationMixin(node: ASTNode) extends ASTWrapperPsiElement(node) with PsiNameIdentifierOwner {

  override def getName: String = getNameIdentifier.getText

  override def processDeclarations(processor: PsiScopeProcessor, state: ResolveState, lastParent: PsiElement, place: PsiElement): Boolean =
    getNameIdentifier == null || processor.execute(getNameIdentifier, state)

  val elementType: PsiElement = this

  override def getNameIdentifier: PsiElement = if(this.isInstanceOf[PrologPredicateId]) this else findChildByClass(classOf[PrologPredicateId])

  override def setName(s: String): PsiElement = {
    val element = PsiFileFactory.getInstance(getProject).createFileFromText(PrologLanguage.INSTANCE, f"$s.").getFirstChild.getFirstChild.getFirstChild.getFirstChild
    val name = getNameIdentifier
    if(element != null && name != null) name.replace(element)
    else throw new IncorrectOperationException("Rename failed")
  }

}

// toplevel to handle declaration finding
abstract class PrologTopLevelDeclarationMixin(node: ASTNode) extends ASTWrapperPsiElement(node) with PsiNameIdentifierOwner {

  override def getName: String = getNameIdentifier.getText

  override def processDeclarations(processor: PsiScopeProcessor, state: ResolveState, lastParent: PsiElement, place: PsiElement): Boolean =
    getNameIdentifier == null || processor.execute(getNameIdentifier, state)

  val elementType: PsiElement = getNameIdentifier

  override def getNameIdentifier: PsiElement = {
    getFirstChild.getFirstChild.getFirstChild
  }

  override def setName(s: String): PsiElement = {
    val element = PsiFileFactory.getInstance(getProject).createFileFromText(PrologLanguage.INSTANCE, f"$s.").getFirstChild.getFirstChild.getFirstChild.getFirstChild
    val name = getNameIdentifier
    if(element != null && name != null) name.replace(element)
    else throw new IncorrectOperationException("Rename failed")
  }

}


