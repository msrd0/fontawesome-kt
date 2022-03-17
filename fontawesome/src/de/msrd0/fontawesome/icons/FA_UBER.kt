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
import de.msrd0.fontawesome.Style.BRANDS

/** Uber */
object FA_UBER: Icon {
	
	override val name get() = "Uber"
	
	override val unicode get() = "f402"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M414.1 32H33.9C15.2 32 0 47.2 0 65.9V446c0 18.8 15.2 34 33.9 34H414c18.7 0 33.9-15.2 33.9-33.9V65.9C448 47.2 432.8 32 414.1 32zM237.6 391.1C163 398.6 96.4 344.2 88.9 269.6h94.4V290c0 3.7 3 6.8 6.8 6.8H258c3.7 0 6.8-3 6.8-6.8v-67.9c0-3.7-3-6.8-6.8-6.8h-67.9c-3.7 0-6.8 3-6.8 6.8v20.4H88.9c7-69.4 65.4-122.2 135.1-122.2 69.7 0 128.1 52.8 135.1 122.2 7.5 74.5-46.9 141.1-121.5 148.6z"/></svg>"""
		else -> null
	}
	
}
