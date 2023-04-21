package ru.pflb.dev.listeners;

public class Description {

    private String displayName;
    private String className;
    private String methodName;

    public Description(String displayName) {
        this.displayName = displayName;
    }

    public void setClassName(Class<?> className) {
        this.className = className.getSimpleName();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName + "()";
    }

    public String getDisplayName() {
        return displayName;
    }
}
