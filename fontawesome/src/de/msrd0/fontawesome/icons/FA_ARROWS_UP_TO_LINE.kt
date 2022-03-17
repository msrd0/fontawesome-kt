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

object FA_ARROWS_UP_TO_LINE: Icon {
	
	override val name get() = "Arrows Up-to-line"
	
	override val unicode get() = "e4c2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M32 96C14.33 96 0 81.67 0 64C0 46.33 14.33 32 32 32H544C561.7 32 576 46.33 576 64C576 81.67 561.7 96 544 96H32zM105.4 137.4C117.9 124.9 138.1 124.9 150.6 137.4L246.6 233.4C259.1 245.9 259.1 266.1 246.6 278.6C234.1 291.1 213.9 291.1 201.4 278.6L160 237.3V448C160 465.7 145.7 480 128 480C110.3 480 96 465.7 96 448V237.3L54.63 278.6C42.13 291.1 21.87 291.1 9.372 278.6C-3.124 266.1-3.124 245.9 9.372 233.4L105.4 137.4zM329.4 233.4L425.4 137.4C437.9 124.9 458.1 124.9 470.6 137.4L566.6 233.4C579.1 245.9 579.1 266.1 566.6 278.6C554.1 291.1 533.9 291.1 521.4 278.6L480 237.3L480 448C480 465.7 465.7 480 448 480C430.3 480 416 465.7 416 448V237.3L374.6 278.6C362.1 291.1 341.9 291.1 329.4 278.6C316.9 266.1 316.9 245.9 329.4 233.4H329.4z"/></svg>"""
		else -> null
	}
	
}
