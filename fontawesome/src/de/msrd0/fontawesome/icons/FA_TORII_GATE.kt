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

/** Torii Gate */
object FA_TORII_GATE: Icon {
	
	override val name get() = "Torii Gate"
	
	override val unicode get() = "f6a1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 80V0L71.37 23.79C87.68 29.23 104.8 32 121.1 32H390C407.2 32 424.3 29.23 440.6 23.79L512 0V80C512 106.5 490.5 128 464 128H448V192H384V128H288V192H224V128H128V192H64V128H48C21.49 128 0 106.5 0 80zM32 288C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224H480C497.7 224 512 238.3 512 256C512 273.7 497.7 288 480 288H448V480C448 497.7 433.7 512 416 512C398.3 512 384 497.7 384 480V288H128V480C128 497.7 113.7 512 96 512C78.33 512 64 497.7 64 480V288H32z"/></svg>"""
		else -> null
	}
	
}
