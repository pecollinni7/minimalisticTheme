package com.github.pecollinni7.minimalistictheme.services

import com.intellij.openapi.project.Project
import com.github.pecollinni7.minimalistictheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
