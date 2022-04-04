plugins {
	kotlin("multiplatform") version "1.6.20"
	id("maven-publish")
}

group = "de.msrd0.fontawesome"
version = "0.2.0+6.1.0"

repositories {
	mavenCentral()
}

kotlin {
	jvm {
		attributes {
			attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
		}
		compilations.all {
			kotlinOptions {
				jvmTarget = "1.8"
			}
		}
	}
	
	sourceSets {
		commonMain {
			kotlin.srcDir("src/")
		}
	}
}

val repo = "https://github.com/msrd0/fontawesome-kt"
publishing {
	repositories {
		maven {
			// first, download https://msrd0cdn.de/maven/ to /tmp/repo
			// then, run `gradle publish`
			// last, upload the changes from /tmp/repo
			url = uri("file:/tmp/repo/")
		}
	}
	
	publications {
		withType<MavenPublication> {
			pom {
				name.set("Kotlin FontAwesome Metadata")
				description.set("Contains metadata about all icons included in Font Awesome.")
				url.set(repo)
				licenses {
					license {
						name.set("Apache License, Version 2.0")
						url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
					}
				}
				scm {
					url.set(repo)
				}
			}
		}
	}
}
