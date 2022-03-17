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

/** Pen Fancy */
object FA_PEN_FANCY: Icon {
	
	override val name get() = "Pen Fancy"
	
	override val unicode get() = "f5ac"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M373.5 27.11C388.5 9.885 410.2 0 433 0C476.6 0 512 35.36 512 78.98C512 101.8 502.1 123.5 484.9 138.5L277.7 319L192.1 234.3L373.5 27.11zM255.1 341.7L235.9 425.1C231.9 442.2 218.9 455.8 202 460.5L24.35 510.3L119.7 414.9C122.4 415.6 125.1 416 128 416C145.7 416 160 401.7 160 384C160 366.3 145.7 352 128 352C110.3 352 96 366.3 96 384C96 386.9 96.38 389.6 97.08 392.3L1.724 487.6L51.47 309.1C56.21 293.1 69.8 280.1 86.9 276.1L170.3 256.9L255.1 341.7z"/></svg>"""
		else -> null
	}
	
}
