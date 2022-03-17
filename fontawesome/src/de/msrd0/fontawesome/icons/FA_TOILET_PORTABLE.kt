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

/** Toilet Portable */
object FA_TOILET_PORTABLE: Icon {
	
	override val name get() = "Toilet Portable"
	
	override val unicode get() = "e583"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M0 32C0 14.33 14.33 0 32 0H288C305.7 0 320 14.33 320 32V64H0V32zM320 96V488C320 501.3 309.3 512 296 512C282.7 512 272 501.3 272 488V480H48V488C48 501.3 37.25 512 24 512C10.75 512 0 501.3 0 488V96H320zM256 240C256 231.2 248.8 224 240 224C231.2 224 224 231.2 224 240V304C224 312.8 231.2 320 240 320C248.8 320 256 312.8 256 304V240z"/></svg>"""
		else -> null
	}
	
}
