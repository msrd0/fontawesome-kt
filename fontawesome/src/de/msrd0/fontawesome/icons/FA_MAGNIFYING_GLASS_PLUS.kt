/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Magnifying glass plus */
object FA_MAGNIFYING_GLASS_PLUS: Icon {
	
	override val name get() = "Magnifying glass plus"
	
	override val unicode get() = "f00e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M500.3 443.7l-119.7-119.7c27.22-40.41 40.65-90.9 33.46-144.7c-12.23-91.55-87.28-166-178.9-177.6c-136.2-17.24-250.7 97.28-233.4 233.4c11.6 91.64 86.07 166.7 177.6 178.9c53.81 7.191 104.3-6.235 144.7-33.46l119.7 119.7c15.62 15.62 40.95 15.62 56.57 .0003C515.9 484.7 515.9 459.3 500.3 443.7zM288 232H231.1V288c0 13.26-10.74 24-23.1 24C194.7 312 184 301.3 184 288V232H127.1C114.7 232 104 221.3 104 208s10.74-24 23.1-24H184V128c0-13.26 10.74-24 23.1-24S231.1 114.7 231.1 128v56h56C301.3 184 312 194.7 312 208S301.3 232 288 232z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_MAGNIFYING_GLASS_PLUS]. */
val FA_SEARCH_PLUS = FA_MAGNIFYING_GLASS_PLUS
