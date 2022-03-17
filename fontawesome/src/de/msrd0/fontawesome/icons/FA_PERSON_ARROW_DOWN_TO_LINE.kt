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

object FA_PERSON_ARROW_DOWN_TO_LINE: Icon {
	
	override val name get() = "Person Arrow-down-to-line"
	
	override val unicode get() = "e538"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M144 48C144 21.49 165.5 0 192 0C218.5 0 240 21.49 240 48C240 74.51 218.5 96 192 96C165.5 96 144 74.51 144 48zM120 256.9L91.43 304.5C82.33 319.6 62.67 324.5 47.52 315.4C32.37 306.3 27.47 286.7 36.57 271.5L94.85 174.6C112.2 145.7 143.4 128 177.1 128H206.9C240.6 128 271.8 145.7 289.2 174.6L347.4 271.5C356.5 286.7 351.6 306.3 336.5 315.4C321.3 324.5 301.7 319.6 292.6 304.5L264 256.9V448H608C625.7 448 640 462.3 640 480C640 497.7 625.7 512 608 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448H120L120 256.9zM200 448V352H184V448H200zM393.4 326.6C380.9 314.1 380.9 293.9 393.4 281.4C405.9 268.9 426.1 268.9 438.6 281.4L464 306.7V64C464 46.33 478.3 32 496 32C513.7 32 528 46.33 528 64V306.7L553.4 281.4C565.9 268.9 586.1 268.9 598.6 281.4C611.1 293.9 611.1 314.1 598.6 326.6L518.6 406.6C506.1 419.1 485.9 419.1 473.4 406.6L393.4 326.6z"/></svg>"""
		else -> null
	}
	
}
