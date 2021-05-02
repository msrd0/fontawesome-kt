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

object FA_SHEKEL_SIGN: Icon {
	
	override val name get() = "Shekel Sign"
	
	override val unicode get() = "f20b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M248 168v168c0 8.84 7.16 16 16 16h48c8.84 0 16-7.16 16-16V168c0-75.11-60.89-136-136-136H24C10.75 32 0 42.74 0 56v408c0 8.84 7.16 16 16 16h48c8.84 0 16-7.16 16-16V112h112c30.93 0 56 25.07 56 56zM432 32h-48c-8.84 0-16 7.16-16 16v296c0 30.93-25.07 56-56 56H200V176c0-8.84-7.16-16-16-16h-48c-8.84 0-16 7.16-16 16v280c0 13.25 10.75 24 24 24h168c75.11 0 136-60.89 136-136V48c0-8.84-7.16-16-16-16z"/></svg>"""
		else -> null
	}
	
}
