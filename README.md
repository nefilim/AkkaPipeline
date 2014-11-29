AkkaPipeline
============

Externalized artifact for the Akka Pipeline code in 2.2 that was removed from 2.3 - now with bug fixes! 

Usage 
=====

```
git clone https://github.com/nefilim/AkkaPipeline.git
cd AkkaPipeline
sbt publishLocal
```

and in your project add a dependency:

```
"com.typesafe.akka"   %% "akka-pipeline" % "1.1"
```
