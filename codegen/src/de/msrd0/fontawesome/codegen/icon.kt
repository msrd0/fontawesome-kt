package de.msrd0.fontawesome.codegen

import kotlinx.serialization.Serializable

@Serializable
data class Icon(
		/// fontawesome versions in which this icon was changed
		val changes: List<String>,
	
		/// the styles this icon is available in
		val styles: Set<String>,
	
		/// 4-digit unicode hex value
		val unicode: String,
	
		/// label/name of the icon
		val label: String,
	
		/// inlined svg data
		val svg: Map<String, IconSvg>,
	
		/// styles that are available in fontawesome free
		val free: Set<String>
) {
	val classname: String
		get() = "FA_" + label.replace(Regex("[^a-zA-Z0-9]"), "_").toUpperCase()
	
	val svgList: Set<Map.Entry<String, IconSvg>>
		get() = svg.entries
}

@Serializable
data class IconSvg(
		val last_modified: Long,
		val raw: String,
		val viewBox: List<String>,
		val width: Int,
		val height: Int,
		val path: String
)
