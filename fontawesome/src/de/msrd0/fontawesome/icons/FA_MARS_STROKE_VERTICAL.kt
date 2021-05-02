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

object FA_MARS_STROKE_VERTICAL: Icon {
	
	override val name get() = "Mars Stroke Vertical"
	
	override val unicode get() = "f22a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 288 512"><path d="M245.8 234.2c-19.9-19.9-44.2-32.8-69.8-38.6v-25.4h20c6.6 0 12-5.4 12-12v-40c0-6.6-5.4-12-12-12h-20V81.4h23.9c10.7 0 16-12.9 8.5-20.5L152.5 5.1c-4.7-4.7-12.3-4.7-17 0L79.6 61c-7.6 7.6-2.2 20.5 8.5 20.5H112v24.7H92c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h20v25.4c-25.6 5.8-49.9 18.7-69.8 38.6-56.2 56.2-56.2 147.4 0 203.6 56.2 56.2 147.4 56.2 203.6 0 56.3-56.2 56.3-147.4 0-203.6zm-45.2 158.4c-31.2 31.2-81.9 31.2-113.1 0-31.2-31.2-31.2-81.9 0-113.1 31.2-31.2 81.9-31.2 113.1 0 31.2 31.1 31.2 81.9 0 113.1z"/></svg>"""
		else -> null
	}
	
}
