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

/** Martini glass citrus */
object FA_MARTINI_GLASS_CITRUS: Icon {
	
	override val name get() = "Martini glass citrus"
	
	override val unicode get() = "f561"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 464H240v-125.3l168.8-168.7C424.3 154.5 413.3 128 391.4 128H24.63C2.751 128-8.249 154.5 7.251 170l168.7 168.7V464H128c-17.67 0-32 14.33-32 32c0 8.836 7.164 16 15.1 16h191.1c8.836 0 15.1-7.164 15.1-16C320 478.3 305.7 464 288 464zM432 0c-62.63 0-115.4 40.25-135.1 96h52.5c16.62-28.5 47.25-48 82.62-48c52.88 0 95.1 43 95.1 96s-43.12 96-95.1 96c-14 0-27.25-3.25-39.37-8.625l-35.25 35.25c21.88 13.25 47.25 21.38 74.62 21.38c79.5 0 143.1-64.5 143.1-144S511.5 0 432 0z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_MARTINI_GLASS_CITRUS]. */
val FA_COCKTAIL = FA_MARTINI_GLASS_CITRUS
