version := "0.1.0-SNAPSHOT"
scalaVersion := "2.13.10"
val sparkVersion = "3.3.2"
artifactName := {
  (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
    artifact.name + "_" + sv.binary + "-" + sparkVersion + "_" + module.revision + "." + artifact.extension
}

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
