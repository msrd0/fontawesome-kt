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

/** Tablets */
object FA_TABLETS: Icon {
	
	override val name get() = "Tablets"
	
	override val unicode get() = "f490"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M159.1 191.1c-81.1 0-147.5 58.51-159.9 134.8C-.7578 331.5 3.367 336 8.365 336h303.3c4.998 0 8.996-4.5 8.248-9.25C307.4 250.5 241.1 191.1 159.1 191.1zM311.5 368H8.365c-4.998 0-9.123 4.5-8.248 9.25C12.49 453.5 78.88 512 159.1 512s147.4-58.5 159.8-134.8C320.7 372.5 316.5 368 311.5 368zM362.9 65.74c-3.502-3.502-9.504-3.252-12.25 .75c-45.52 62.76-40.52 150.4 15.88 206.9c56.52 56.51 144.2 61.39 206.1 15.88c4.002-2.875 4.252-8.877 .75-12.25L362.9 65.74zM593.4 46.61c-56.52-56.51-144.2-61.39-206.1-16c-4.002 2.877-4.252 8.877-.75 12.25l211.3 211.4c3.5 3.502 9.504 3.252 12.25-.75C654.8 190.8 649.9 103.1 593.4 46.61z"/></svg>"""
		else -> null
	}
	
}
