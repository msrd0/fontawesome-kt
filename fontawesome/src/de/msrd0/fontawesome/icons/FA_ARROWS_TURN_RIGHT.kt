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

/** Arrows Turn-right */
object FA_ARROWS_TURN_RIGHT: Icon {
	
	override val name get() = "Arrows Turn-right"
	
	override val unicode get() = "e4c0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M297.4 9.372C309.9-3.124 330.1-3.124 342.6 9.372L438.6 105.4C451.1 117.9 451.1 138.1 438.6 150.6L342.6 246.6C330.1 259.1 309.9 259.1 297.4 246.6C284.9 234.1 284.9 213.9 297.4 201.4L338.7 160H128C92.65 160 64 188.7 64 224V256C64 273.7 49.67 288 32 288C14.33 288 0 273.7 0 256V224C0 153.3 57.31 96 128 96H338.7L297.4 54.63C284.9 42.13 284.9 21.87 297.4 9.373V9.372zM201.4 265.4C213.9 252.9 234.1 252.9 246.6 265.4L342.6 361.4C355.1 373.9 355.1 394.1 342.6 406.6L246.6 502.6C234.1 515.1 213.9 515.1 201.4 502.6C188.9 490.1 188.9 469.9 201.4 457.4L242.7 416H96C78.33 416 64 430.3 64 448V480C64 497.7 49.67 512 32 512C14.33 512 0 497.7 0 480V448C0 394.1 42.98 352 96 352H242.7L201.4 310.6C188.9 298.1 188.9 277.9 201.4 265.4V265.4z"/></svg>"""
		else -> null
	}
	
}
