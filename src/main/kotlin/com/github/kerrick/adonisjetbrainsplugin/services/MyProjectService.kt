package com.github.kerrick.adonisjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.kerrick.adonisjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
