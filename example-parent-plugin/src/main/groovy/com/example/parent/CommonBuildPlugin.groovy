package com.example.parent

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.artifacts.DependencyResolveDetails
import org.gradle.api.artifacts.result.DependencyResult
import org.gradle.api.specs.Spec
import org.gradle.api.tasks.diagnostics.DependencyInsightReportTask
import org.gradle.api.tasks.diagnostics.DependencyReportTask
import org.gradle.api.tasks.wrapper.Wrapper

class CommonBuildPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.allprojects { proj ->
            apply plugin: 'io.spring.dependency-management'

            dependencyManagement {
                dependencies {
                    //Internal Libs
                    'com.example:shared'    '2.1'
                    'com.example:common'    '2.1'
                    'com.example:model'     '3.1'

                    //3rd Party libs
                    'junit:junit'           '4.11'

                    def springFrameworkVersion = '4.0.5.RELEASE'
                    'org.springframework:spring-core'       springFrameworkVersion
                    'org.springframework:spring-aop'        springFrameworkVersion
                    'org.springframework:spring-aspects'    springFrameworkVersion
                    'org.springframework:spring-context'    springFrameworkVersion
                    'org.springframework:spring-beans'      springFrameworkVersion
                    'org.springframework:spring-jdbc'       springFrameworkVersion
                    'org.springframework:spring-jms'        springFrameworkVersion
                    'org.springframework:spring-expression' springFrameworkVersion
                    'org.springframework:spring-orm'        springFrameworkVersion
                    'org.springframework:spring-test'       springFrameworkVersion
                    'org.springframework:spring-tx'         springFrameworkVersion
                    'org.springframework:spring-web'        springFrameworkVersion
                    'org.springframework:spring-webmvc'     springFrameworkVersion

                    def springSecurityVersion = '3.2.2.RELEASE'
                    'org.springframework.security:spring-security-web'   springSecurityVersion
                    'org.springframework.security:spring-security-config'springSecurityVersion
                    'org.springframework.security:spring-security-core'  springSecurityVersion
                    'org.springframework.security:spring-security-acl'   springSecurityVersion

                }
                //Projects in the same multiproject build reference each other, so best to include all from the same build
                def bedrockBuild = '109'

            }
        }

    }

}
