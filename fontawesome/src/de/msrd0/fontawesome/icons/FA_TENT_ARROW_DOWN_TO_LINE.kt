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

object FA_TENT_ARROW_DOWN_TO_LINE: Icon {
	
	override val name get() = "Tent Arrow-down-to-line"
	
	override val unicode get() = "e57e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M241.8 111.9C250.7 121.8 249.9 136.1 240.1 145.8L160.1 217.8C150.9 226.1 137.1 226.1 127.9 217.8L47.94 145.8C38.09 136.1 37.29 121.8 46.16 111.9C55.03 102.1 70.2 101.3 80.05 110.2L119.1 146.1V24C119.1 10.75 130.7 0 143.1 0C157.3 0 167.1 10.75 167.1 24V146.1L207.9 110.2C217.8 101.3 232.1 102.1 241.8 111.9H241.8zM364.6 134.5C376.1 125.8 391.9 125.8 403.4 134.5L571.4 262.5C578 267.6 582.4 275 583.6 283.3L608.4 448C625.9 448.2 640 462.4 640 480C640 497.7 625.7 512 608 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448H159.6L184.4 283.3C185.6 275 189.1 267.6 196.6 262.5L364.6 134.5zM384 448H460.8L384 320V448z"/></svg>"""
		else -> null
	}
	
}
