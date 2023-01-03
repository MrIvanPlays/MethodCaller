package com.mrivanplays.methodcaller;

import java.lang.StackWalker.Option;

public class Java9MethodCaller implements MethodCaller {

  @Override
  public Class<?> getCallerClass() {
    return StackWalker.getInstance(Option.RETAIN_CLASS_REFERENCE).getCallerClass();
  }
}
