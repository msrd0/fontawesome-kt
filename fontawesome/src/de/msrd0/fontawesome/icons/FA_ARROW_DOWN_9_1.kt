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

/** Arrow down 9 1 */
object FA_ARROW_DOWN_9_1: Icon {
	
	override val name get() = "Arrow down 9 1"
	
	override val unicode get() = "f886"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M216 320.3c-8.672 0-17.3 3.5-23.61 10.38L160 366.1V64.03C160 46.33 145.7 32 128 32S96 46.33 96 64.03v302L63.6 330.7c-11.95-13.01-32.2-13.91-45.22-1.969c-13.03 11.95-13.9 32.22-1.969 45.27l87.1 96.09c12.12 13.26 35.06 13.26 47.19 0l87.1-96.09c11.94-13.05 11.06-33.31-1.969-45.27C231.5 323.1 223.7 320.3 216 320.3zM357.7 201.1l-7.682 8.004c-10.72 11.16-10.34 28.88 .8125 39.56c5.406 5.219 12.41 7.812 19.38 7.812c7.344 0 14.72-2.875 20.19-8.625c69.61-72.53 89.6-85.39 89.6-127.8c0-48.6-39.4-88-88-88s-88 39.4-88 88C303.1 156.4 326.1 187.7 357.7 201.1zM392 96c13.23 0 24 10.77 24 24S405.2 144 392 144S368 133.2 368 120S378.8 96 392 96zM416 416.4v-96.02c0-11.19-5.844-21.53-15.38-27.34c-9.531-5.781-21.41-6.188-31.34-1.062l-32 16.59c-15.69 8.125-21.81 27.44-13.69 43.13C329.3 362.8 340.4 369 352 369v47.41c-17.69 0-32 14.31-32 32s14.31 32 32 32h64c17.69 0 32-14.31 32-32S433.7 416.4 416 416.4z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_ARROW_DOWN_9_1]. */
val FA_SORT_NUMERIC_DESC = FA_ARROW_DOWN_9_1

/** Alias for [FA_ARROW_DOWN_9_1]. */
val FA_SORT_NUMERIC_DOWN_ALT = FA_ARROW_DOWN_9_1
