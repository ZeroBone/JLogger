# JLogger
Simple and extremely lightweight JAVA logger class for output and debugging with proxy support.

It is intended to be used for quick outputting of different kinds of data in runtime via `Logger.log(String|StringBuffer|int|long)` instead of writing `System.out.println();` or `System.err.println()`.

The class provides also simple error outputting through `Throwable.printStackTrace()` method (`Logger.error(Throwable|String|StringBuilder)`).

# Proxy feature

Sometimes there is a chain of methods either in some method call arguments or simply modifing for example, some string. Sometimes, outputting of some state inside this chain is required without breaking the inline code and creating extra variables. That is where `Logger.proxy(String|StringBuilder|int|long)` comes to the rescue. The method, apart from logging out the data, will return it's argument. Multiple arguments in proxy are currently not supported.

# Customize

This project is just for jumpstaring new java projects without having to re-implement the same logging. Only the very basical features are included. Not it is your turn. Customize the class to fit your project's needs.
