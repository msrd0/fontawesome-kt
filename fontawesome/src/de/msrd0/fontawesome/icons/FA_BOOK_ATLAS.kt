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

/** Book atlas */
object FA_BOOK_ATLAS: Icon {
	
	override val name get() = "Book atlas"
	
	override val unicode get() = "f558"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M240 97.25C232.3 104.8 219.3 131.8 216.6 176h46.88C260.8 131.8 247.8 104.8 240 97.25zM334.4 176c-5.25-31.25-25.62-57.13-53.25-70.38C288.8 124.6 293.8 149 295.3 176H334.4zM334.4 208h-39.13c-1.5 27-6.5 51.38-14.12 70.38C308.8 265.1 329.1 239.3 334.4 208zM263.4 208H216.5C219.3 252.3 232.3 279.3 240 286.8C247.8 279.3 260.8 252.3 263.4 208zM198.9 105.6C171.3 118.9 150.9 144.8 145.6 176h39.13C186.3 149 191.3 124.6 198.9 105.6zM448 336v-288C448 21.49 426.5 0 400 0H96C42.98 0 0 42.98 0 96v320c0 53.02 42.98 96 96 96h320c17.67 0 32-14.33 32-32c0-11.72-6.607-21.52-16-27.1v-81.36C441.8 362.8 448 350.2 448 336zM240 64c70.75 0 128 57.25 128 128s-57.25 128-128 128s-128-57.25-128-128S169.3 64 240 64zM384 448H96c-17.67 0-32-14.33-32-32c0-17.67 14.33-32 32-32h288V448zM198.9 278.4C191.3 259.4 186.3 235 184.8 208H145.6C150.9 239.3 171.3 265.1 198.9 278.4z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BOOK_ATLAS]. */
val FA_ATLAS = FA_BOOK_ATLAS
