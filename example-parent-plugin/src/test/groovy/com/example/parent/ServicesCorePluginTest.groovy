package com.example.parent

import org.testng.annotations.Test;
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project

class ServicesCorePluginTest {

    // Successfully applying the plugin is the test. It will fail if the plugin
    // can't be compiled or has errors
    @Test
    public void testBedrockCorePlugin() {

        Project project = ProjectBuilder.builder().build()
        project.apply plugin: 'services-core'
    }
}
