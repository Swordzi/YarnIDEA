package com.github.swordzi.yarnidea.services

import com.intellij.openapi.project.Project
import com.github.swordzi.yarnidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
