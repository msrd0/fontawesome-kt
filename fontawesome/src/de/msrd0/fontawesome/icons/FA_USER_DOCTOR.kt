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

/** User doctor */
object FA_USER_DOCTOR: Icon {
	
	override val name get() = "User doctor"
	
	override val unicode get() = "f0f0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M352 128C352 198.7 294.7 256 223.1 256C153.3 256 95.1 198.7 95.1 128C95.1 57.31 153.3 0 223.1 0C294.7 0 352 57.31 352 128zM287.1 362C260.4 369.1 239.1 394.2 239.1 424V448C239.1 452.2 241.7 456.3 244.7 459.3L260.7 475.3C266.9 481.6 277.1 481.6 283.3 475.3C289.6 469.1 289.6 458.9 283.3 452.7L271.1 441.4V424C271.1 406.3 286.3 392 303.1 392C321.7 392 336 406.3 336 424V441.4L324.7 452.7C318.4 458.9 318.4 469.1 324.7 475.3C330.9 481.6 341.1 481.6 347.3 475.3L363.3 459.3C366.3 456.3 368 452.2 368 448V424C368 394.2 347.6 369.1 320 362V308.8C393.5 326.7 448 392.1 448 472V480C448 497.7 433.7 512 416 512H32C14.33 512 0 497.7 0 480V472C0 393 54.53 326.7 128 308.8V370.3C104.9 377.2 88 398.6 88 424C88 454.9 113.1 480 144 480C174.9 480 200 454.9 200 424C200 398.6 183.1 377.2 160 370.3V304.2C162.7 304.1 165.3 304 168 304H280C282.7 304 285.3 304.1 288 304.2L287.1 362zM167.1 424C167.1 437.3 157.3 448 143.1 448C130.7 448 119.1 437.3 119.1 424C119.1 410.7 130.7 400 143.1 400C157.3 400 167.1 410.7 167.1 424z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_USER_DOCTOR]. */
val FA_USER_MD = FA_USER_DOCTOR
