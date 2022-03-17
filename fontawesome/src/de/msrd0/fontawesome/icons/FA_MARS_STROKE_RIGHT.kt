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

/** Mars stroke right */
object FA_MARS_STROKE_RIGHT: Icon {
	
	override val name get() = "Mars stroke right"
	
	override val unicode get() = "f22b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M619.3 244.7l-82.34-77.61c-15.12-15.12-40.97-4.41-40.97 16.97V223.1L463.1 224V176c.002-8.838-7.162-16-15.1-16h-32c-8.84 0-16 7.16-16 16V224h-19.05c-15.07-81.9-86.7-144-172.1-144C110.8 80 32 158.8 32 256c0 97.2 78.8 176 176 176c86.26 0 157.9-62.1 172.1-144h19.05V336c0 8.836 7.162 16 16 16h32c8.836 0 15.1-7.164 15.1-16V287.1L496 288v39.95c0 21.38 25.85 32.09 40.97 16.97l82.34-77.61C625.6 261.1 625.6 250.9 619.3 244.7zM208 352c-52.94 0-96-43.07-96-96c-.002-52.94 43.06-96 96-96c52.93 0 95.1 43.06 95.1 96C304 308.9 260.9 352 208 352z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_MARS_STROKE_RIGHT]. */
val FA_MARS_STROKE_H = FA_MARS_STROKE_RIGHT
