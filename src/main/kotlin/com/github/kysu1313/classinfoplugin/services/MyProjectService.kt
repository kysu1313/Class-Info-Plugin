package com.github.kysu1313.classinfoplugin.services

import com.github.kysu1313.classinfoplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
