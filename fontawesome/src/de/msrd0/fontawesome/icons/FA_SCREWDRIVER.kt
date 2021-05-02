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

object FA_SCREWDRIVER: Icon {
	
	override val name get() = "Screwdriver"
	
	override val unicode get() = "f54a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M448 0L320 96v62.06l-83.03 83.03c6.79 4.25 13.27 9.06 19.07 14.87 5.8 5.8 10.62 12.28 14.87 19.07L353.94 192H416l96-128-64-64zM128 278.59L10.92 395.67c-14.55 14.55-14.55 38.15 0 52.71l52.7 52.7c14.56 14.56 38.15 14.56 52.71 0L233.41 384c29.11-29.11 29.11-76.3 0-105.41s-76.3-29.11-105.41 0z"/></svg>"""
		else -> null
	}
	
}
