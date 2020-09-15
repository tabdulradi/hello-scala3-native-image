## Hello Scala 3 Native Image
Example application showing a minimal example of compiling and running Scala 3 (Dotty) Hello world application as GraalVM native image

### Requirements 
- [sbt](https://docs.scala-lang.org/getting-started/sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html#installation)

### Compile and Generate Native Image
`sbt nativeImage`

### Run
`target/native-image/hello-scala3-native-image`

## Resources
- [Dotty project template](https://github.com/lampepfl/dotty.g8)
- [Native image generation](https://github.com/scalameta/sbt-native-image)
- [Graalvm native-image-tips & tricks](https://jamesward.com/2020/05/07/graalvm-native-image-tips-tricks/)