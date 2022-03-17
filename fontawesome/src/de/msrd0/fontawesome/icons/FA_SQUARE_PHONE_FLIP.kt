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

/** Square phone flip */
object FA_SQUARE_PHONE_FLIP: Icon {
	
	override val name get() = "Square phone flip"
	
	override val unicode get() = "f87b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M0 96v320c0 35.35 28.65 64 64 64h320c35.35 0 64-28.65 64-64V96c0-35.35-28.65-64-64-64H64C28.65 32 0 60.65 0 96zM105.5 303.6l54.24-23.25c6.391-2.766 13.9-.9062 18.24 4.484l22.02 26.91c34.63-17 62.77-45.14 79.77-79.75l-26.91-22.05c-5.375-4.391-7.211-11.83-4.492-18.22l23.27-54.28c3.047-6.953 10.59-10.77 17.93-9.062l50.38 11.63c7.125 1.625 12.11 7.891 12.11 15.22c0 126.1-102.6 228.8-228.7 228.8c-7.336 0-13.6-4.984-15.24-12.11l-11.62-50.39C94.71 314.2 98.5 306.6 105.5 303.6z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_PHONE_FLIP]. */
val FA_PHONE_SQUARE_ALT = FA_SQUARE_PHONE_FLIP
