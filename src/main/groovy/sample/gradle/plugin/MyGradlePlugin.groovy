package sample.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyGradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('hello') {
        
            project.extensions.create('hello', MyGradlePluginConfiguration);
            println "Hello My Gradle Plugin!! value = ${project.hello.value}"
        }
    }
}