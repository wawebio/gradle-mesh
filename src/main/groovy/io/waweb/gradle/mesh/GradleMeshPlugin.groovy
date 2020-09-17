/**
 * @author Aaron R Miller<aaron.miller@waweb.io>
 */
package io.waweb.gradle.mesh

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
public class GradleMeshPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register a task
        project.tasks.register("greeting") {
            doLast {
                println("Hello from plugin 'io.waweb.gradle.mesh.greeting'")
            }
        }
    }
}
