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

/** Person praying */
object FA_PERSON_PRAYING: Icon {
	
	override val name get() = "Person praying"
	
	override val unicode get() = "f683"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M255.1 128c35.38 0 63.1-28.62 63.1-64s-28.62-64-63.1-64S191.1 28.62 191.1 64S220.6 128 255.1 128zM225.4 297.8c14 16.75 39 19.12 56.01 5.25l88.01-72c17-14 19.5-39.25 5.625-56.38c-14-17.12-39.25-19.5-56.38-5.625L261.3 216l-39-46.25c-15.38-18.38-39.13-27.88-64.01-25.38c-24.13 2.5-45.25 16.25-56.38 37l-49.38 92C29.13 317 43.88 369.8 86.76 397.1L131.5 432H40C17.88 432 0 449.9 0 472S17.88 512 40 512h208c34.13 0 53.76-42.75 28.25-68.25L166.4 333.9L201.3 269L225.4 297.8z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_PERSON_PRAYING]. */
val FA_PRAY = FA_PERSON_PRAYING
