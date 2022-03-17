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
import de.msrd0.fontawesome.Style.BRANDS

/** Creative Commons */
object FA_CREATIVE_COMMONS: Icon {
	
	override val name get() = "Creative Commons"
	
	override val unicode get() = "f25e"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M245.83 214.87l-33.22 17.28c-9.43-19.58-25.24-19.93-27.46-19.93-22.13 0-33.22 14.61-33.22 43.84 0 23.57 9.21 43.84 33.22 43.84 14.47 0 24.65-7.09 30.57-21.26l30.55 15.5c-6.17 11.51-25.69 38.98-65.1 38.98-22.6 0-73.96-10.32-73.96-77.05 0-58.69 43-77.06 72.63-77.06 30.72-.01 52.7 11.95 65.99 35.86zm143.05 0l-32.78 17.28c-9.5-19.77-25.72-19.93-27.9-19.93-22.14 0-33.22 14.61-33.22 43.84 0 23.55 9.23 43.84 33.22 43.84 14.45 0 24.65-7.09 30.54-21.26l31 15.5c-2.1 3.75-21.39 38.98-65.09 38.98-22.69 0-73.96-9.87-73.96-77.05 0-58.67 42.97-77.06 72.63-77.06 30.71-.01 52.58 11.95 65.56 35.86zM247.56 8.05C104.74 8.05 0 123.11 0 256.05c0 138.49 113.6 248 247.56 248 129.93 0 248.44-100.87 248.44-248 0-137.87-106.62-248-248.44-248zm.87 450.81c-112.54 0-203.7-93.04-203.7-202.81 0-105.42 85.43-203.27 203.72-203.27 112.53 0 202.82 89.46 202.82 203.26-.01 121.69-99.68 202.82-202.84 202.82z"/></svg>"""
		else -> null
	}
	
}
