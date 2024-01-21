import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.tasks.bundling.BootBuildImage

plugins {
	id("org.springframework.boot") version "3.1.5"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	id("org.jetbrains.kotlin.plugin.noarg") version "1.9.0"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.9.0"
	id("org.jetbrains.kotlin.plugin.allopen") version "1.9.0"
//	id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
//	id("org.jlleitschuh.gradle.ktlint-idea") version "11.0.0"
}

group = "com.fr3nzy"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter")
//	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.liquibase:liquibase-core")
	implementation("org.postgresql:postgresql")

	// telegram
	implementation("org.telegram:telegrambots-spring-boot-starter:6.8.0")
	implementation("org.telegram:telegrambots-abilities:6.8.0")

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jsoup:jsoup:1.16.2")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.mockk:mockk:1.13.4")
	testImplementation("com.ninja-squad:springmockk:4.0.2")
	testImplementation("org.assertj:assertj-core:3.24.2")
	testImplementation("org.mockito.kotlin:mockito-kotlin:5.1.0")
}

 tasks.named("compileKotlin", org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask::class.java) {
    compilerOptions {
        freeCompilerArgs.add("-Xdebug")
    }
 }

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

//tasks.withType<Test> {
//	useJUnitPlatform()
//}

tasks.named<BootBuildImage>("bootBuildImage") {
	imageName = "${System.getProperty("docker.registry.prefix")}${project.name}:${System.getProperty("revision")}"
	docker {
		publishRegistry {
			username = System.getProperty("docker.registry.username")
			password = System.getProperty("docker.registry.password")
		}
	}
}
