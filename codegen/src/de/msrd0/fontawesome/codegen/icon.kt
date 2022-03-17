package de.msrd0.fontawesome.codegen

import java.util.SortedSet
import kotlinx.serialization.Serializable

fun String.toClassname(): String = "FA_" + replace(Regex("[^a-zA-Z0-9]"), "_").uppercase()

@Serializable
data class Icon(
		/** the styles this icon is available in */
		val styles: Set<String>,
		
		/** 4-digit unicode hex value */
		val unicode: String,
		
		/** aliases of this icon */
		val aliases: Aliases?,
		
		/** label/name of the icon */
		val label: String,
		
		/** inlined svg data */
		val svg: Map<String, IconSvg>,
		
		/** styles that are available in fontawesome free */
		val free: Set<String>
) {
	val aliasClassnames: SortedSet<String>
		get() = aliases?.names.orEmpty().map(String::toClassname).toSortedSet()
	
	val svgList: Set<Map.Entry<String, IconSvg>>
		get() = svg.entries
}

@Serializable
data class Aliases(
		val names: List<String>?
)

@Serializable
data class IconSvg(
		val last_modified: Long,
		val raw: String,
		val viewBox: List<Int>,
		val width: Int,
		val height: Int,
		val path: String
)
