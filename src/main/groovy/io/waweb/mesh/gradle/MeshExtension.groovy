/**
 * @author Aaron R Miller<aaron.miller@waweb.io>
 */
package io.waweb.mesh.gradle

import javax.inject.Inject

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property

class MeshExtension {

	final Property<String> host = objectFactory.property(String)

	final Property<Integer> port = objectFactory.property(Integer)

	final Property<Boolean> useSsl = objectFactory.property(Boolean)

	final Property<String> apiKey = objectFactory.property(String)

	final Property<String> userName = objectFactory.property(String)

	final Property<String> password = objectFactory.property(String)

	final Property<String> projectName = objectFactory.property(String)

	@Inject
	ObjectFactory getObjectFactory() {
		throw new UnsupportedOperationException()
	}
}