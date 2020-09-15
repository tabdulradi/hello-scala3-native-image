scalaVersion := "0.27.0-RC1"
enablePlugins(NativeImagePlugin)
// Following is nice to have, but commented out to show it's not necessary 
// nativeImageOptions ++= List(
//   "--no-fallback",
//   "--report-unsupported-elements-at-runtime",
//   "-H:+ReportUnsupportedElementsAtRuntime",
// )
