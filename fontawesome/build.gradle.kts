plugins {
	kotlin("multiplatform") version "1.5.0"
	id("maven-publish")
}

group = "de.msrd0.fontawesome"
version = "0.1.0"

repositories {
	mavenCentral()
}

kotlin {
	jvm()
	
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
			name = "GitHubPackages"
			url = uri(repo.replace("github.com", "maven.pkg.github.com"))
			credentials {
				username = System.getenv("GITHUB_USERNAME") ?: "msrd0"
				password = System.getenv("GITHUB_TOKEN")
			}
		}
	}
	
	publications {
		create<MavenPublication>("maven") {
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
