package com.mrivanplays.methodcaller;

public class Java8MethodCaller implements MethodCaller {

  @Override
  public Class<?> getCallerClass() {
    StackTraceElement[] elements = Thread.currentThread().getStackTrace();
    try {
      return Class.forName(elements[2].getClassName());
    } catch (ClassNotFoundException e) {
      // impossible yet the compiler doesn't know it :(
      return null;
    }
  }
}
