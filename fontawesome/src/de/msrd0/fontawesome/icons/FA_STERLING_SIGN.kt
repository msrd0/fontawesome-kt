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

object FA_STERLING_SIGN: Icon {
	
	override val name get() = "Sterling sign"
	
	override val unicode get() = "f154"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M112 223.1H224C241.7 223.1 256 238.3 256 255.1C256 273.7 241.7 287.1 224 287.1H112V332.5C112 361.5 104.1 389.1 89.2 414.9L88.52 416H288C305.7 416 320 430.3 320 448C320 465.7 305.7 480 288 480H32C20.47 480 9.834 473.8 4.154 463.8C-1.527 453.7-1.371 441.4 4.56 431.5L34.32 381.9C43.27 367 48 349.9 48 332.5V288H32C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224H48V160.4C48 89.47 105.5 32 176.4 32C190.2 32 203.9 34.22 216.1 38.59L298.1 65.64C314.9 71.23 323.9 89.35 318.4 106.1C312.8 122.9 294.6 131.9 277.9 126.4L196.7 99.3C190.2 97.12 183.3 96 176.4 96C140.8 96 112 124.8 112 160.4V223.1z"/></svg>"""
		else -> null
	}
	
}

val FA_GBP = FA_STERLING_SIGN

val FA_POUND_SIGN = FA_STERLING_SIGN
