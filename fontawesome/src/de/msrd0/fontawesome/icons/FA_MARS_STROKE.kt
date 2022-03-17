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

object FA_MARS_STROKE: Icon {
	
	override val name get() = "Mars Stroke"
	
	override val unicode get() = "f229"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M496 .0002l-112.4 .0001c-21.38 0-32.09 25.85-16.97 40.97l29.56 29.56l-24.33 24.34l-33.94-33.94c-6.248-6.25-16.38-6.248-22.63 0l-22.63 22.63c-6.25 6.25-6.25 16.38 0 22.63l33.94 33.94l-18.96 18.96C239.1 111.8 144.5 118.6 83.55 179.5c-68.73 68.73-68.73 180.2 0 248.9c68.73 68.73 180.2 68.73 248.9 0c60.99-60.99 67.73-155.6 20.47-224.1l18.96-18.96l33.94 33.94c6.248 6.248 16.38 6.25 22.63 0l22.63-22.63c6.248-6.248 6.248-16.38 0-22.63l-33.94-33.94l24.34-24.33l29.56 29.56C486.1 160.5 512 149.8 512 128.4v-112.4C512 7.162 504.8 .0002 496 .0002zM275.9 371.9c-37.43 37.43-98.33 37.43-135.8 0c-37.43-37.43-37.43-98.33 0-135.8c37.43-37.43 98.33-37.43 135.8 0C313.3 273.5 313.3 334.5 275.9 371.9z"/></svg>"""
		else -> null
	}
	
}
