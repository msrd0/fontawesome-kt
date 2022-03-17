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

/** vest */
object FA_VEST: Icon {
	
	override val name get() = "vest"
	
	override val unicode get() = "e085"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M437.3 239.9L384 160V32c0-17.67-14.33-32-32-32h-32c-4.75 0-9.375 1.406-13.31 4.031l-25 16.66c-35.03 23.38-80.28 23.38-115.4 0l-25-16.66C137.4 1.406 132.8 0 128 0H96C78.33 0 64 14.33 64 32v128L10.75 239.9C3.74 250.4 0 262.7 0 275.4V480c0 17.67 14.33 32 32 32h160V288c0-3.439 .5547-6.855 1.643-10.12l13.49-40.48L150.2 66.56C173.2 79.43 198.5 86.25 224 86.25s50.79-6.824 73.81-19.69L224 288v224h192c17.67 0 32-14.33 32-32V275.4C448 262.7 444.3 250.4 437.3 239.9zM131.3 371.3l-48 48C80.19 422.4 76.09 424 72 424s-8.188-1.562-11.31-4.688c-6.25-6.25-6.25-16.38 0-22.62l48-48c6.25-6.25 16.38-6.25 22.62 0S137.6 365.1 131.3 371.3zM387.3 419.3C384.2 422.4 380.1 424 376 424s-8.188-1.562-11.31-4.688l-48-48c-6.25-6.25-6.25-16.38 0-22.62s16.38-6.25 22.62 0l48 48C393.6 402.9 393.6 413.1 387.3 419.3z"/></svg>"""
		else -> null
	}
	
}
