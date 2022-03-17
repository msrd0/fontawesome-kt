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

/** Ribbon */
object FA_RIBBON: Icon {
	
	override val name get() = "Ribbon"
	
	override val unicode get() = "f4d6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M6.05 444.3c-9.626 10.87-7.501 27.62 4.5 35.75l68.76 27.87c9.876 6.75 23.38 4.1 31.38-3.75l91.76-101.9L123.2 314.3L6.05 444.3zM441.8 444.3c0 0-292-324.5-295.4-329.1c15.38-8.5 40.25-17.1 77.51-17.1s62.13 9.5 77.51 17.1c-3.25 5.5-56.01 64.5-56.01 64.5l79.13 87.75l34.13-37.1c28.75-31.87 33.38-78.62 11.5-115.5L326.5 39.52c-4.25-7.25-9.876-13.25-16.75-17.1c-40.75-27.62-127.5-29.75-171.5 0C131.3 26.27 125.7 32.27 121.4 39.52L77.81 112.8C76.31 115.3 40.68 174.9 89.31 228.8l248.1 275.2c8.001 8.875 21.38 10.5 31.25 3.75l68.88-27.87C449.5 471.9 451.6 455.1 441.8 444.3z"/></svg>"""
		else -> null
	}
	
}
