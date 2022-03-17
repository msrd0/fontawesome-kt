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

/** Vimeo Square */
object FA_VIMEO_SQUARE: Icon {
	
	override val name get() = "Vimeo Square"
	
	override val unicode get() = "f194"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M400 32H48C21.5 32 0 53.5 0 80v352c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48V80c0-26.5-21.5-48-48-48zm-16.2 149.6c-1.4 31.1-23.2 73.8-65.3 127.9-43.5 56.5-80.3 84.8-110.4 84.8-18.7 0-34.4-17.2-47.3-51.6-25.2-92.3-35.9-146.4-56.7-146.4-2.4 0-10.8 5-25.1 15.1L64 192c36.9-32.4 72.1-68.4 94.1-70.4 24.9-2.4 40.2 14.6 46 51.1 20.5 129.6 29.6 149.2 66.8 90.5 13.4-21.2 20.6-37.2 21.5-48.3 3.4-32.8-25.6-30.6-45.2-22.2 15.7-51.5 45.8-76.5 90.1-75.1 32.9 1 48.4 22.4 46.5 64z"/></svg>"""
		else -> null
	}
	
}
