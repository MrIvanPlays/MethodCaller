package com.mrivanplays.methodcaller;

public class MethodCallerAccessor {

  public static MethodCaller create() {
    try {
      Class.forName("java.lang.StackWalker");
      return new Java9MethodCaller();
    } catch (ClassNotFoundException e) {
      return new Java8MethodCaller();
    }
  }

}
