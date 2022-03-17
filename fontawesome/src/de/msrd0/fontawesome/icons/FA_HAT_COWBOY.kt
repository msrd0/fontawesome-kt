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

/** Cowboy Hat */
object FA_HAT_COWBOY: Icon {
	
	override val name get() = "Cowboy Hat"
	
	override val unicode get() = "f8c0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M489.1 264.9C480.5 207.5 450.5 32 392.3 32c-14 0-26.58 5.875-37.08 14c-20.75 15.87-49.62 15.87-70.5 0C274.2 38 261.7 32 247.7 32c-58.25 0-88.27 175.5-97.77 232.9C188.7 277.5 243.7 288 319.1 288S451.2 277.5 489.1 264.9zM632.9 227.7c-6.125-4.125-14.2-3.51-19.7 1.49c-1 .875-101.3 90.77-293.1 90.77c-190.9 0-292.2-89.99-293.2-90.86c-5.5-4.875-13.71-5.508-19.71-1.383c-6.125 4.125-8.587 11.89-6.087 18.77C1.749 248.5 78.37 448 319.1 448s318.2-199.5 318.1-201.5C641.5 239.6 639 231.9 632.9 227.7z"/></svg>"""
		else -> null
	}
	
}
