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

/** quote-right */
object FA_QUOTE_RIGHT: Icon {
	
	override val name get() = "quote-right"
	
	override val unicode get() = "f10e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M96 96C42.98 96 0 138.1 0 192s42.98 96 96 96c11.28 0 21.95-2.305 32-5.879V288c0 35.3-28.7 64-64 64c-17.67 0-32 14.33-32 32s14.33 32 32 32c70.58 0 128-57.42 128-128V192C192 138.1 149 96 96 96zM448 192c0-53.02-42.98-96-96-96s-96 42.98-96 96s42.98 96 96 96c11.28 0 21.95-2.305 32-5.879V288c0 35.3-28.7 64-64 64c-17.67 0-32 14.33-32 32s14.33 32 32 32c70.58 0 128-57.42 128-128V192z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_QUOTE_RIGHT]. */
val FA_QUOTE_RIGHT_ALT = FA_QUOTE_RIGHT
