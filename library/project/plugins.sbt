resolvers ++= Seq(
 Resolver.url("scalasbt snapshots", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots"))(Resolver.ivyStylePatterns),
 "Local Ivy2 Repository" at "file://" + Path.userHome.absolutePath + "/.ivy2/local"
)

addSbtPlugin("org.scala-sbt" % "sbt-android-plugin" % "0.6.3.1-SNAPSHOT")

