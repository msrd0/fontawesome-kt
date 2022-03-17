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

/** Terminal */
object FA_TERMINAL: Icon {
	
	override val name get() = "Terminal"
	
	override val unicode get() = "f120"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M9.372 86.63C-3.124 74.13-3.124 53.87 9.372 41.37C21.87 28.88 42.13 28.88 54.63 41.37L246.6 233.4C259.1 245.9 259.1 266.1 246.6 278.6L54.63 470.6C42.13 483.1 21.87 483.1 9.372 470.6C-3.124 458.1-3.124 437.9 9.372 425.4L178.7 256L9.372 86.63zM544 416C561.7 416 576 430.3 576 448C576 465.7 561.7 480 544 480H256C238.3 480 224 465.7 224 448C224 430.3 238.3 416 256 416H544z"/></svg>"""
		else -> null
	}
	
}
