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

/** Square X Mark */
object FA_SQUARE_XMARK: Icon {
	
	override val name get() = "Square X Mark"
	
	override val unicode get() = "f2d3"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H384zM143 208.1L190.1 255.1L143 303C133.7 312.4 133.7 327.6 143 336.1C152.4 346.3 167.6 346.3 176.1 336.1L223.1 289.9L271 336.1C280.4 346.3 295.6 346.3 304.1 336.1C314.3 327.6 314.3 312.4 304.1 303L257.9 255.1L304.1 208.1C314.3 199.6 314.3 184.4 304.1 175C295.6 165.7 280.4 165.7 271 175L223.1 222.1L176.1 175C167.6 165.7 152.4 165.7 143 175C133.7 184.4 133.7 199.6 143 208.1V208.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_XMARK]. */
val FA_TIMES_SQUARE = FA_SQUARE_XMARK

/** Alias for [FA_SQUARE_XMARK]. */
val FA_XMARK_SQUARE = FA_SQUARE_XMARK
