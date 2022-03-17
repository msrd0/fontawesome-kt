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

object FA_ARROWS_TURN_TO_DOTS: Icon {
	
	override val name get() = "Arrows Turn-to-dots"
	
	override val unicode get() = "e4c1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M249.4 25.37C261.9 12.88 282.1 12.88 294.6 25.37C307.1 37.87 307.1 58.13 294.6 70.63L269.3 95.1H416C469 95.1 512 138.1 512 191.1V223.1C512 241.7 497.7 255.1 480 255.1C462.3 255.1 448 241.7 448 223.1V191.1C448 174.3 433.7 159.1 416 159.1H269.3L294.6 185.4C307.1 197.9 307.1 218.1 294.6 230.6C282.1 243.1 261.9 243.1 249.4 230.6L169.4 150.6C156.9 138.1 156.9 117.9 169.4 105.4L249.4 25.37zM342.6 361.4C355.1 373.9 355.1 394.1 342.6 406.6L262.6 486.6C250.1 499.1 229.9 499.1 217.4 486.6C204.9 474.1 204.9 453.9 217.4 441.4L242.7 416H96C78.33 416 64 430.3 64 448V480C64 497.7 49.67 512 32 512C14.33 512 0 497.7 0 480V448C0 394.1 42.98 352 96 352H242.7L217.4 326.6C204.9 314.1 204.9 293.9 217.4 281.4C229.9 268.9 250.1 268.9 262.6 281.4L342.6 361.4zM512 384C512 419.3 483.3 448 448 448C412.7 448 384 419.3 384 384C384 348.7 412.7 320 448 320C483.3 320 512 348.7 512 384zM128 128C128 163.3 99.35 192 64 192C28.65 192 0 163.3 0 128C0 92.65 28.65 64 64 64C99.35 64 128 92.65 128 128z"/></svg>"""
		else -> null
	}
	
}
