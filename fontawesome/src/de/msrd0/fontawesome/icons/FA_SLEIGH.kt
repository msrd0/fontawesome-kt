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

object FA_SLEIGH: Icon {
	
	override val name get() = "Sleigh"
	
	override val unicode get() = "f7cc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M63.1 32C66.31 32 68.56 32.24 70.74 32.71C124.1 37.61 174.2 67.59 203.4 114.3L207.7 121.1C247.7 185.1 317.8 224 393.3 224C423.5 224 448 199.5 448 169.3V128C448 110.3 462.3 96 480 96H544C561.7 96 576 110.3 576 128C576 145.7 561.7 160 544 160V256C544 309 501 352 448 352V384H384V352H192V384H128V352C74.98 352 32 309 32 256V96C14.33 96 0 81.67 0 64C0 46.33 14.33 32 32 32H63.1zM640 392C640 440.6 600.6 480 552 480H63.1C46.33 480 31.1 465.7 31.1 448C31.1 430.3 46.33 416 63.1 416H552C565.3 416 576 405.3 576 392V384C576 366.3 590.3 352 608 352C625.7 352 640 366.3 640 384V392z"/></svg>"""
		else -> null
	}
	
}
