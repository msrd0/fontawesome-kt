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

/** Turn up */
object FA_TURN_UP: Icon {
	
	override val name get() = "Turn up"
	
	override val unicode get() = "f3bf"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M318 145.6c-3.812 8.75-12.45 14.41-22 14.41L224 160v272c0 44.13-35.89 80-80 80H32c-17.67 0-32-14.31-32-32s14.33-32 32-32h112C152.8 448 160 440.8 160 432V160L88 159.1c-9.547 0-18.19-5.656-22-14.41S63.92 126.7 70.41 119.7l104-112c9.498-10.23 25.69-10.23 35.19 0l104 112C320.1 126.7 321.8 136.8 318 145.6z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TURN_UP]. */
val FA_LEVEL_UP_ALT = FA_TURN_UP
