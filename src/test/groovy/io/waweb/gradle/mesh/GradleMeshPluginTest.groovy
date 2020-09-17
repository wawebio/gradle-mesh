/**
 * @author Aaron R Miller<aaron.miller@waweb.io>
 */
package io.waweb.gradle.mesh

import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

/**
 * A simple unit test for the 'io.waweb.gradle.mesh.greeting' plugin.
 */
public class GradleMeshPluginTest extends Specification {
	def "plugin registers task"() {
		given:
		def project = ProjectBuilder.builder().build()

		when:
		project.plugins.apply("io.waweb.mesh")

		then:
		project.tasks.findByName("greeting") != null
	}
}