// Setup bintray resolver - needed for many sbt plugins
resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
  Resolver.ivyStylePatterns)

// Wrapper plugin for scalajs
addSbtPlugin("com.github.inthenow" % "sbt-scalajs" % "0.56.7")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.2")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")
