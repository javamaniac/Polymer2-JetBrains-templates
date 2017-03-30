import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class PolymerContext extends TemplateContextType {
    protected PolymerContext() {
        super("POLYMER", "Polymer");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".html");
    }
}