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

/** Transgender */
object FA_TRANSGENDER: Icon {
	
	override val name get() = "Transgender"
	
	override val unicode get() = "f225"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M498.6 .0003h-94.37c-17.96 0-26.95 21.71-14.25 34.41L411.1 55.61l-67.01 67.01C318.8 105.9 288.6 96 256 96S193.2 105.9 167.9 122.6L151.6 106.3l6.061-6.062c6.25-6.248 6.25-16.38 0-22.63L146.3 66.34c-6.25-6.248-16.38-6.248-22.63 0L117.7 72.41L100.9 55.61L122.1 34.41c12.7-12.7 3.703-34.41-14.25-34.41H13.44C6.016 .0003 0 6.016 0 13.44v94.37c0 17.96 21.71 26.95 34.41 14.25l21.2-21.2l16.8 16.8L66.35 123.7c-6.25 6.248-6.25 16.38 0 22.63l11.31 11.31c6.25 6.248 16.38 6.248 22.63 0l6.061-6.061L122.6 167.9C105.9 193.2 96 223.4 96 256c0 77.4 54.97 141.9 128 156.8v19.23l-16-.0014c-8.836 0-16 7.165-16 16v15.1c0 8.836 7.164 16 16 16L224 480v16c0 8.836 7.164 16 16 16h32c8.836 0 16-7.164 16-16v-16l16-.0001c8.836 0 16-7.164 16-16v-15.1c0-8.836-7.164-16-16-16L288 432v-19.23c73.03-14.83 128-79.37 128-156.8c0-32.6-9.867-62.85-26.61-88.14l67.01-67.01l21.2 21.2C490.3 134.8 512 125.8 512 107.8V13.44C512 6.016 505.1 .0003 498.6 .0003zM256 336c-44.11 0-80-35.89-80-80c0-44.11 35.89-80 80-80c44.11 0 80 35.89 80 80C336 300.1 300.1 336 256 336z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TRANSGENDER]. */
val FA_TRANSGENDER_ALT = FA_TRANSGENDER
