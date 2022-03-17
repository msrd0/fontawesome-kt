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

/** Cowboy Hat Side */
object FA_HAT_COWBOY_SIDE: Icon {
	
	override val name get() = "Cowboy Hat Side"
	
	override val unicode get() = "f8c1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M260.8 260C232.1 237.1 198.8 225 164.4 225c-77.38 0-142.9 62.75-163 156c-3.5 16.62-.375 33.88 8.625 47.38c8.75 13.12 21.88 20.62 35.88 20.62H592c-103.2 0-155-37.13-233.2-104.5L260.8 260zM495.5 241.8l-27.13-156.5c-2.875-17.25-12.75-32.5-27.12-42.25c-14.37-9.75-32.24-13.3-49.24-9.675L200.9 74.02C173.7 79.77 153.5 102.3 150.5 129.8L143.6 195c6.875-.875 13.62-2 20.75-2c41.87 0 82 14.5 117.4 42.88l98 84.37c71 61.25 115.1 96.75 212.2 96.75c26.5 0 48-21.5 48-48C640 343.6 610.4 249.6 495.5 241.8z"/></svg>"""
		else -> null
	}
	
}
