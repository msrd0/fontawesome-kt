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

object FA_HELICOPTER: Icon {
	
	override val name get() = "Helicopter"
	
	override val unicode get() = "f533"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M127.1 32C127.1 14.33 142.3 0 159.1 0H544C561.7 0 576 14.33 576 32C576 49.67 561.7 64 544 64H384V128H416C504.4 128 576 199.6 576 288V352C576 369.7 561.7 384 544 384H303.1C293.9 384 284.4 379.3 278.4 371.2L191.1 256L47.19 198.1C37.65 194.3 30.52 186.1 28.03 176.1L4.97 83.88C2.445 73.78 10.08 64 20.49 64H47.1C58.07 64 67.56 68.74 73.6 76.8L111.1 128H319.1V64H159.1C142.3 64 127.1 49.67 127.1 32V32zM384 320H512V288C512 234.1 469 192 416 192H384V320zM630.6 470.6L626.7 474.5C602.7 498.5 570.2 512 536.2 512H255.1C238.3 512 223.1 497.7 223.1 480C223.1 462.3 238.3 448 255.1 448H536.2C553.2 448 569.5 441.3 581.5 429.3L585.4 425.4C597.9 412.9 618.1 412.9 630.6 425.4C643.1 437.9 643.1 458.1 630.6 470.6L630.6 470.6z"/></svg>"""
		else -> null
	}
	
}
