package br.com.dio;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

import static javax.lang.model.SourceVersion.RELEASE_21;

@SupportedAnnotationTypes("br.com.dio.Builder")
@SupportedSourceVersion(RELEASE_21)
public class BuilderProcessor extends AbstractProcessor {

    @Override
    public boolean process(final Set<? extends TypeElement> annotations, final RoundEnvironment roundEnv) {
        return false;
    }

}
