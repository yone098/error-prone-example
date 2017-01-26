# error-prone gradle example

Usage

```
$ git clone https://github.com/yone098/error-prone-example.git

$ gradle clean run
:clean
:compileJava
/Users/yone098/p/error-prone-example/src/main/java/example/Main.java:17: エラー: [ArrayToString] Calling toString on an array does not provide useful information
        System.out.println(nameArray);
                           ^
    (see http://errorprone.info/bugpattern/ArrayToString)
  Did you mean 'System.out.println(Arrays.toString(nameArray));'?
エラー1個
:compileJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed with exit code 1; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

BUILD FAILED

Total time: 5.081 secs
```

