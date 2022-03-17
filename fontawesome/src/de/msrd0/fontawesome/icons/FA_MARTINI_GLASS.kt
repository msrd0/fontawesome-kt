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

/** Martini glass */
object FA_MARTINI_GLASS: Icon {
	
	override val name get() = "Martini glass"
	
	override val unicode get() = "f57b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M502 57.63C523.3 36.38 508.3 0 478.3 0H33.72C3.711 0-11.29 36.38 9.962 57.63l214 214V448H175.1c-26.51 0-47.1 21.49-47.1 48c0 8.836 7.164 16 16 16h224c8.836 0 16-7.164 16-16c0-26.51-21.49-48-48-48h-47.1V271.6L502 57.63zM405.1 64l-64.01 64H170.9L106.9 64H405.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_MARTINI_GLASS]. */
val FA_GLASS_MARTINI_ALT = FA_MARTINI_GLASS
