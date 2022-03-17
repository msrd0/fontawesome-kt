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

/** Up down left right */
object FA_UP_DOWN_LEFT_RIGHT: Icon {
	
	override val name get() = "Up down left right"
	
	override val unicode get() = "f0b2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 256c0 6.797-2.891 13.28-7.938 17.84l-80 72C419.6 349.9 413.8 352 408 352c-3.312 0-6.625-.6875-9.766-2.078C389.6 346.1 384 337.5 384 328V288h-96v96l40-.0013c9.484 0 18.06 5.578 21.92 14.23s2.25 18.78-4.078 25.83l-72 80C269.3 509.1 262.8 512 255.1 512s-13.28-2.89-17.84-7.937l-71.1-80c-6.328-7.047-7.938-17.17-4.078-25.83s12.44-14.23 21.92-14.23l39.1 .0013V288H128v40c0 9.484-5.578 18.06-14.23 21.92C110.6 351.3 107.3 352 104 352c-5.812 0-11.56-2.109-16.06-6.156l-80-72C2.891 269.3 0 262.8 0 256s2.891-13.28 7.938-17.84l80-72C95 159.8 105.1 158.3 113.8 162.1C122.4 165.9 128 174.5 128 184V224h95.1V128l-39.1-.0013c-9.484 0-18.06-5.578-21.92-14.23S159.8 94.99 166.2 87.94l71.1-80c9.125-10.09 26.56-10.09 35.69 0l72 80c6.328 7.047 7.938 17.17 4.078 25.83s-12.44 14.23-21.92 14.23l-40 .0013V224H384V184c0-9.484 5.578-18.06 14.23-21.92c8.656-3.812 18.77-2.266 25.83 4.078l80 72C509.1 242.7 512 249.2 512 256z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_UP_DOWN_LEFT_RIGHT]. */
val FA_ARROWS_ALT = FA_UP_DOWN_LEFT_RIGHT
