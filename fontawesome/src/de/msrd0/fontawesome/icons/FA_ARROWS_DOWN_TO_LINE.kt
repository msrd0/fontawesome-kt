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

/** Arrows Down-to-line */
object FA_ARROWS_DOWN_TO_LINE: Icon {
	
	override val name get() = "Arrows Down-to-line"
	
	override val unicode get() = "e4b8"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M544 416C561.7 416 576 430.3 576 448C576 465.7 561.7 480 544 480H32C14.33 480 0 465.7 0 448C0 430.3 14.33 416 32 416H544zM470.6 374.6C458.1 387.1 437.9 387.1 425.4 374.6L329.4 278.6C316.9 266.1 316.9 245.9 329.4 233.4C341.9 220.9 362.1 220.9 374.6 233.4L416 274.7V64C416 46.33 430.3 32 448 32C465.7 32 480 46.33 480 64V274.7L521.4 233.4C533.9 220.9 554.1 220.9 566.6 233.4C579.1 245.9 579.1 266.1 566.6 278.6L470.6 374.6zM246.6 278.6L150.6 374.6C138.1 387.1 117.9 387.1 105.4 374.6L9.373 278.6C-3.124 266.1-3.124 245.9 9.373 233.4C21.87 220.9 42.13 220.9 54.63 233.4L96 274.7V64C96 46.33 110.3 32 128 32C145.7 32 160 46.33 160 64V274.7L201.4 233.4C213.9 220.9 234.1 220.9 246.6 233.4C259.1 245.9 259.1 266.1 246.6 278.6H246.6z"/></svg>"""
		else -> null
	}
	
}