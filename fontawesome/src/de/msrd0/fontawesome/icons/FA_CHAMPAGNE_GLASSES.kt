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

/** Champagne glasses */
object FA_CHAMPAGNE_GLASSES: Icon {
	
	override val name get() = "Champagne glasses"
	
	override val unicode get() = "f79f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M639.4 433.6c-8.374-20.37-31.75-30.12-52.12-21.62l-22.12 9.249l-38.75-101.1c47.87-34.1 64.87-100.2 34.5-152.7l-86.62-150.5c-7.999-13.87-24.1-19.75-39.1-13.62l-114.2 47.37L205.8 2.415C190.8-3.71 173.8 2.165 165.8 16.04L79.15 166.5C48.9 219 65.78 284.3 113.6 319.2l-38.75 101.9L52.78 411.9c-20.37-8.499-43.62 1.25-52.12 21.62c-1.75 4.124 .125 8.749 4.25 10.5l162.4 67.37c3.1 1.75 8.624-.125 10.37-4.249c8.374-20.37-1.25-43.87-21.62-52.37l-22.12-9.124l39.37-103.6c4.5 .4999 8.874 1.25 13.12 1.25c51.75 0 99.37-32.1 113.4-85.24l20.25-75.36l20.25 75.36c13.1 52.24 61.62 85.24 113.4 85.24c4.25 0 8.624-.7499 13.12-1.25l39.25 103.6l-22.12 9.124c-20.37 8.499-30.12 31.1-21.62 52.37c1.75 4.124 6.5 5.999 10.5 4.249l162.4-67.37C639.1 442.2 641.1 437.7 639.4 433.6zM275.9 162.1L163.8 115.6l36.5-63.37L294.8 91.4L275.9 162.1zM364.1 162.1l-18.87-70.74l94.49-39.12l36.5 63.37L364.1 162.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_CHAMPAGNE_GLASSES]. */
val FA_GLASS_CHEERS = FA_CHAMPAGNE_GLASSES
