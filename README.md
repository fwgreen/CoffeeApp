# CoffeeApp

Based on the Dagger DI framework's [simple example](https://github.com/google/dagger/tree/master/examples/simple).

Compile and run from the project root with...
```
mkdir mods
javac -d mods --module-source-path src $(find src -name "*.java")
java -p mods -m coffee.app.main/coffee.app.main.CoffeeApp
```
