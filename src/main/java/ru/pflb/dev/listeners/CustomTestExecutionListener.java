package ru.pflb.dev.listeners;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.support.descriptor.ClassSource;
import org.junit.platform.engine.support.descriptor.MethodSource;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

/**
 * Пример взят из прикреплённых ссылкок и немного переделан под собственные нужды. Логику трогать не стоит, т.к. ломается алгоритм.
 *
 * @see <a href="https://marian-caikovski.medium.com/print-names-of-test-methods-executed-by-junit-5-f337b4ba1264">Article about Print names of test methods executed by JUnit 5</a>
 * @see <a href="https://github.com/marianc000/junit5TestNames">GitHub example</a>
 */
public class CustomTestExecutionListener implements TestExecutionListener {

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
        Description description = toDescription(testIdentifier);
        if (description.getMethodName() != null) { // skip class names
            if (testExecutionResult.getThrowable().isPresent()) {
                log(description.getDisplayName() + " throw " + shorterStacktrace(testExecutionResult.getThrowable().get()));
            }
        }
    }

    public Description toDescription(TestIdentifier i) {
        Description d = new Description(i.getDisplayName());
        TestSource ts = i.getSource().orElse(null);
        if (ts instanceof MethodSource) {
            MethodSource m = (MethodSource) ts;
            d.setClassName(m.getJavaClass());
            d.setMethodName(m.getMethodName());
        } else if (ts instanceof ClassSource) {
            ClassSource c = (ClassSource) ts;
            d.setClassName(c.getJavaClass());
        } else if (ts != null) {
            throw new IllegalArgumentException("Unrecognized source");
        }
        return d;
    }

    private String shorterStacktrace(Throwable ex) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ex.printStackTrace(new PrintStream(os));
        return os.toString(StandardCharsets.UTF_8).lines().limit(1).collect(Collectors.joining("\n"));
    }

    private void log(String message) {
        System.out.println("[TEST] " + message);
    }
}
