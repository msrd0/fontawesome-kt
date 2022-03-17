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

/** Igloo */
object FA_IGLOO: Icon {
	
	override val name get() = "Igloo"
	
	override val unicode get() = "f7ae"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M320 160H48.5C100.2 82.82 188.1 32 288 32C298.8 32 309.5 32.6 320 33.76V160zM352 39.14C424.9 55.67 487.2 99.82 527.5 160H352V39.14zM96 192V320H0C0 274 10.77 230.6 29.94 192H96zM192 320H128V192H448V320H384V352H576V432C576 458.5 554.5 480 528 480H352V352C352 316.7 323.3 288 288 288C252.7 288 224 316.7 224 352V480H48C21.49 480 0 458.5 0 432V352H192V320zM480 192H546.1C565.2 230.6 576 274 576 320H480V192z"/></svg>"""
		else -> null
	}
	
}
