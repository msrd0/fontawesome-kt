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

/** fire */
object FA_FIRE: Icon {
	
	override val name get() = "fire"
	
	override val unicode get() = "f06d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M323.5 51.25C302.8 70.5 284 90.75 267.4 111.1C240.1 73.62 206.2 35.5 168 0C69.75 91.12 0 210 0 281.6C0 408.9 100.2 512 224 512s224-103.1 224-230.4C448 228.4 396 118.5 323.5 51.25zM304.1 391.9C282.4 407 255.8 416 226.9 416c-72.13 0-130.9-47.73-130.9-125.2c0-38.63 24.24-72.64 72.74-130.8c7 8 98.88 125.4 98.88 125.4l58.63-66.88c4.125 6.75 7.867 13.52 11.24 19.9C364.9 290.6 353.4 357.4 304.1 391.9z"/></svg>"""
		else -> null
	}
	
}
