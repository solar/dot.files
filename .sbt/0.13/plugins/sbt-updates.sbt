resolvers += Resolver.url("sbt-plugin-snapshots",
  url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-snapshots"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.8-SNAPSHOT")
