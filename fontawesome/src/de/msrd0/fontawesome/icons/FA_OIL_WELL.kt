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

object FA_OIL_WELL: Icon {
	
	override val name get() = "Oil Well"
	
	override val unicode get() = "e532"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M569.8 215.8C581.2 258.5 555.9 302.4 513.2 313.8L497.7 317.9C480.7 322.5 463.1 312.4 458.5 295.3L433.3 201.3L95.1 288.8V448H137.3L190.4 296.3L264.1 276.1L238.7 352H305.3L277.9 273.6L340 257.5L406.7 448H544C561.7 448 576 462.3 576 480C576 497.7 561.7 512 544 512H32C14.33 512 0 497.7 0 480C0 462.3 14.33 448 32 448H48V184C48 170.7 58.75 160 72 160C85.25 160 96 170.7 96 184V222.6L228.2 188.4L241.8 149.4C246.3 136.6 258.4 128 272 128C285.6 128 297.7 136.6 302.2 149.4L308.5 167.5L416.8 139.5L392.3 48.04C387.7 30.97 397.8 13.42 414.9 8.848L430.4 4.707C473-6.729 516.9 18.6 528.3 61.28L569.8 215.8zM205.1 448H338.9L327.7 416H216.3L205.1 448z"/></svg>"""
		else -> null
	}
	
}
