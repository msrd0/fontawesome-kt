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

/** Mitten */
object FA_MITTEN: Icon {
	
	override val name get() = "Mitten"
	
	override val unicode get() = "f7b5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M351.1 416H63.99c-17.6 0-31.1 14.4-31.1 31.1l.0026 31.1C31.1 497.6 46.4 512 63.1 512h288c17.6 0 32-14.4 32-31.1l-.0049-31.1C383.1 430.4 369.6 416 351.1 416zM425 206.9c-27.25-22.62-67.5-19-90.13 8.25l-20.88 25L284.4 111.8c-18-77.5-95.38-125.1-172.8-108C34.26 21.63-14.25 98.88 3.754 176.4L64 384h288l81.14-86.1C455.8 269.8 452.1 229.5 425 206.9z"/></svg>"""
		else -> null
	}
	
}
