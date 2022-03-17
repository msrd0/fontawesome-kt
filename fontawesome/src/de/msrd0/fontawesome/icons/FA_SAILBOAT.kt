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

/** Sailboat */
object FA_SAILBOAT: Icon {
	
	override val name get() = "Sailboat"
	
	override val unicode get() = "e445"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M256 16C256 9.018 260.5 2.841 267.2 .7414C273.9-1.358 281.1 1.105 285.1 6.826L509.1 326.8C512.5 331.7 512.9 338.1 510.2 343.4C507.4 348.7 501.1 352 496 352H272C263.2 352 256 344.8 256 336V16zM212.1 96.54C219.1 98.4 224 104.7 224 112V336C224 344.8 216.8 352 208 352H80C74.3 352 69.02 348.1 66.16 344C63.3 339.1 63.28 333 66.11 328.1L194.1 104.1C197.7 97.76 205.1 94.68 212.1 96.54V96.54zM5.718 404.3C2.848 394.1 10.52 384 21.12 384H554.9C565.5 384 573.2 394.1 570.3 404.3L566.3 418.7C550.7 473.9 500.4 512 443 512H132.1C75.62 512 25.27 473.9 9.747 418.7L5.718 404.3z"/></svg>"""
		else -> null
	}
	
}
