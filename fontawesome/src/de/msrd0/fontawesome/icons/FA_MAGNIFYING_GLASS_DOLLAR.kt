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

object FA_MAGNIFYING_GLASS_DOLLAR: Icon {
	
	override val name get() = "Magnifying glass dollar"
	
	override val unicode get() = "f688"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M500.3 443.7l-119.7-119.7c27.22-40.41 40.65-90.9 33.46-144.7c-12.23-91.55-87.28-166-178.9-177.6c-136.2-17.24-250.7 97.28-233.4 233.4c11.6 91.64 86.07 166.7 177.6 178.9c53.81 7.191 104.3-6.235 144.7-33.46l119.7 119.7c15.62 15.62 40.95 15.62 56.57 .0004C515.9 484.7 515.9 459.3 500.3 443.7zM273.7 253.8C269.8 276.4 252.6 291.3 228 296.1V304c0 11.03-8.953 20-20 20S188 315 188 304V295.2C178.2 293.2 168.4 289.9 159.6 286.8L154.8 285.1C144.4 281.4 138.9 269.9 142.6 259.5C146.2 249.1 157.6 243.7 168.1 247.3l5.062 1.812c8.562 3.094 18.25 6.562 25.91 7.719c16.23 2.5 33.47-.0313 35.17-9.812c1.219-7.094 .4062-10.62-31.8-19.84L196.2 225.4C177.8 219.1 134.5 207.3 142.3 162.2C146.2 139.6 163.5 124.8 188 120V112c0-11.03 8.953-20 20-20S228 100.1 228 112v8.695c6.252 1.273 13.06 3.07 21.47 5.992c10.42 3.625 15.95 15.03 12.33 25.47C258.2 162.6 246.8 168.1 236.3 164.5C228.2 161.7 221.8 159.9 216.8 159.2c-16.11-2.594-33.38 .0313-35.08 9.812c-1 5.812-1.719 10 25.7 18.03l6 1.719C238.9 196 281.5 208.2 273.7 253.8z"/></svg>"""
		else -> null
	}
	
}

val FA_SEARCH_DOLLAR = FA_MAGNIFYING_GLASS_DOLLAR
