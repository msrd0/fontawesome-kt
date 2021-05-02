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

object FA_SUPERPOWERS: Icon {
	
	override val name get() = "Superpowers"
	
	override val unicode get() = "f2dd"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 32c-83.3 11-166.8 22-250 33-92 12.5-163.3 86.7-169 180-3.3 55.5 18 109.5 57.8 148.2L0 480c83.3-11 166.5-22 249.8-33 91.8-12.5 163.3-86.8 168.7-179.8 3.5-55.5-18-109.5-57.7-148.2L448 32zm-79.7 232.3c-4.2 79.5-74 139.2-152.8 134.5-79.5-4.7-140.7-71-136.3-151 4.5-79.2 74.3-139.3 153-134.5 79.3 4.7 140.5 71 136.1 151z"/></svg>"""
		else -> null
	}
	
}
