# Example projects using the Spring.io dependency management plugin.

# Example parent plugin
This plugin contains the common build logic that needs to exist in many separate repositories.

## Local Setup 
run `./gradlew publishToMavenLocal` to install the plugin in your local Maven Repo.

#Multiproject
Is a sample project used to duplicate the multiproject interaction and demonstrate how to use the dependency management plugin effectively.

These projects rely on the `example-parent-plugin` to run. Be certain to install it first.