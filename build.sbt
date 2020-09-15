scalaVersion := "0.27.0-RC1"
enablePlugins(NativeImagePlugin)
nativeImageOptions ++= List(
  "--no-fallback",
  "--report-unsupported-elements-at-runtime",
  "-H:+ReportUnsupportedElementsAtRuntime",
)