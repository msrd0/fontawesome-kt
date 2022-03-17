package de.msrd0.fontawesome.codegen

import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.loader.ClasspathLoader
import java.io.File
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

private fun File.join(file: String) = File(this, file)

// wrapping inside an object to have access to the class loader
object Main {
	
	@JvmStatic
	fun main(args: Array<String>) {
		val json = Json {
			explicitNulls = false
			ignoreUnknownKeys = true
		}
		
		val iconsFile = javaClass.classLoader.getResourceAsStream("icons.json")!!.reader().readText()
		val icons: Map<String, Icon> = json.decodeFromString(iconsFile)
		
		val templates = PebbleEngine.Builder()
			.autoEscaping(false)
			.cacheActive(false)
			.strictVariables(false)
			.newLineTrimming(false)
			.loader(ClasspathLoader())
			.build()
		
		val dir = File("../fontawesome/src/de/msrd0/fontawesome")
		val iconsDir = dir.join("icons")
		dir.deleteRecursively()
		iconsDir.mkdirs()
		
		templates.getTemplate("Icon.j2")!!.evaluate(dir.join("Icon.kt").writer())
		templates.getTemplate("Style.j2")!!.evaluate(dir.join("Style.kt").writer())
		icons.forEach { (name, icon) ->
			val classname = name.toClassname()
			templates.getTemplate("fa_icon.j2")!!.evaluate(
					iconsDir.join("${classname}.kt").writer(), mapOf("classname" to classname, "icon" to icon)
				)
		}
	}
	
}
