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

/** Square pen */
object FA_SQUARE_PEN: Icon {
	
	override val name get() = "Square pen"
	
	override val unicode get() = "f14b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H384zM325.8 139.7C310.1 124.1 284.8 124.1 269.2 139.7L247.8 161.1L318.7 232.1L340.1 210.7C355.8 195 355.8 169.7 340.1 154.1L325.8 139.7zM111.5 303.8L96.48 363.1C95.11 369.4 96.71 375.2 100.7 379.2C104.7 383.1 110.4 384.7 115.9 383.4L176 368.3C181.6 366.9 186.8 364 190.9 359.9L296.1 254.7L225.1 183.8L119.9 288.1C115.8 293.1 112.9 298.2 111.5 303.8z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_PEN]. */
val FA_PENCIL_SQUARE = FA_SQUARE_PEN

/** Alias for [FA_SQUARE_PEN]. */
val FA_PEN_SQUARE = FA_SQUARE_PEN
