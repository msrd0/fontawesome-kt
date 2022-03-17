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

/** Arrows left right */
object FA_ARROWS_LEFT_RIGHT: Icon {
	
	override val name get() = "Arrows left right"
	
	override val unicode get() = "f07e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502.6 278.6l-96 96C400.4 380.9 392.2 384 384 384s-16.38-3.125-22.62-9.375c-12.5-12.5-12.5-32.75 0-45.25L402.8 288h-293.5l41.38 41.38c12.5 12.5 12.5 32.75 0 45.25C144.4 380.9 136.2 384 128 384s-16.38-3.125-22.62-9.375l-96-96c-12.5-12.5-12.5-32.75 0-45.25l96-96c12.5-12.5 32.75-12.5 45.25 0s12.5 32.75 0 45.25L109.3 224h293.5l-41.38-41.38c-12.5-12.5-12.5-32.75 0-45.25s32.75-12.5 45.25 0l96 96C515.1 245.9 515.1 266.1 502.6 278.6z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_ARROWS_LEFT_RIGHT]. */
val FA_ARROWS_H = FA_ARROWS_LEFT_RIGHT
