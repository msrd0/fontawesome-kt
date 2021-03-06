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

/** Square root variable */
object FA_SQUARE_ROOT_VARIABLE: Icon {
	
	override val name get() = "Square root variable"
	
	override val unicode get() = "f698"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M576 32.01c0-17.69-14.33-31.1-32-31.1l-224-.0049c-14.69 0-27.48 10-31.05 24.25L197.9 388.3L124.6 241.7C119.2 230.9 108.1 224 96 224L32 224c-17.67 0-32 14.31-32 31.1s14.33 32 32 32h44.22l103.2 206.3c5.469 10.91 16.6 17.68 28.61 17.68c1.172 0 2.323-.0576 3.495-.1826c13.31-1.469 24.31-11.06 27.56-24.06l105.9-423.8H544C561.7 64.01 576 49.7 576 32.01zM566.6 233.4c-12.5-12.5-32.75-12.5-45.25 0L480 274.8l-41.38-41.37c-12.5-12.5-32.75-12.5-45.25 0s-12.5 32.75 0 45.25l41.38 41.38l-41.38 41.38c-12.5 12.5-12.5 32.75 0 45.25C399.6 412.9 407.8 416 416 416s16.38-3.125 22.62-9.375L480 365.3l41.38 41.38C527.6 412.9 535.8 416 544 416s16.38-3.125 22.62-9.375c12.5-12.5 12.5-32.75 0-45.25l-41.38-41.38L566.6 278.6C579.1 266.1 579.1 245.9 566.6 233.4z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_ROOT_VARIABLE]. */
val FA_SQUARE_ROOT_ALT = FA_SQUARE_ROOT_VARIABLE
