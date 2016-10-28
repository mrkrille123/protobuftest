name := "protobuftest"

version := "1.0"

scalaVersion := "2.11.8"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

// If you need scalapb/scalapb.proto or anything from
// google/protobuf/*.proto
libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime" % "0.5.42" % "protobuf"