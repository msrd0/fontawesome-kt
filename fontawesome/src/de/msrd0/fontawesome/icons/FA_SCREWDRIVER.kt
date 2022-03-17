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

/** Screwdriver */
object FA_SCREWDRIVER: Icon {
	
	override val name get() = "Screwdriver"
	
	override val unicode get() = "f54a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M128 278.6l-117.1 116.9c-14.5 14.62-14.5 38.29 0 52.79l52.75 52.75c14.5 14.5 38.17 14.5 52.79 0L233.4 384c29.12-29.12 29.12-76.25 0-105.4S157.1 249.5 128 278.6zM447.1 0l-128 96L320 158L237 241.1C243.8 245.4 250.3 250.1 256 256c5.875 5.75 10.62 12.25 14.88 19L353.1 192h61.99l95.1-128L447.1 0z"/></svg>"""
		else -> null
	}
	
}
