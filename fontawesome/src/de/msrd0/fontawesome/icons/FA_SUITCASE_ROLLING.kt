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

object FA_SUITCASE_ROLLING: Icon {
	
	override val name get() = "Suitcase Rolling"
	
	override val unicode get() = "f5c1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M336 160H48c-26.51 0-48 21.49-48 48v224c0 26.51 21.49 48 48 48h16v16c0 8.84 7.16 16 16 16h32c8.84 0 16-7.16 16-16v-16h128v16c0 8.84 7.16 16 16 16h32c8.84 0 16-7.16 16-16v-16h16c26.51 0 48-21.49 48-48V208c0-26.51-21.49-48-48-48zm-16 216c0 4.42-3.58 8-8 8H72c-4.42 0-8-3.58-8-8v-16c0-4.42 3.58-8 8-8h240c4.42 0 8 3.58 8 8v16zm0-96c0 4.42-3.58 8-8 8H72c-4.42 0-8-3.58-8-8v-16c0-4.42 3.58-8 8-8h240c4.42 0 8 3.58 8 8v16zM144 48h96v80h48V48c0-26.51-21.49-48-48-48h-96c-26.51 0-48 21.49-48 48v80h48V48z"/></svg>"""
		else -> null
	}
	
}
