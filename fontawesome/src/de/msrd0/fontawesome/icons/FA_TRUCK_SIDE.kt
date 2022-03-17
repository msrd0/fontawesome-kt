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

object FA_TRUCK_SIDE: Icon {
	
	override val name get() = "Truck Side"
	
	override val unicode get() = "f63c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M272 32H368.6C388.1 32 406.5 40.84 418.6 56.02L527.4 192H576C593.7 192 608 206.3 608 224V288C625.7 288 640 302.3 640 320C640 337.7 625.7 352 608 352H574.9C575.6 357.2 576 362.6 576 368C576 429.9 525.9 480 464 480C402.1 480 352 429.9 352 368C352 362.6 352.4 357.2 353.1 352H286.9C287.6 357.2 288 362.6 288 368C288 429.9 237.9 480 176 480C114.1 480 64 429.9 64 368C64 362.6 64.39 357.2 65.13 352H32C14.33 352 0 337.7 0 320C0 302.3 14.33 288 32 288V224C32 206.3 46.33 192 64 192H224V80C224 53.49 245.5 32 272 32H272zM368.6 96H288V192H445.4L368.6 96zM176 416C202.5 416 224 394.5 224 368C224 341.5 202.5 320 176 320C149.5 320 128 341.5 128 368C128 394.5 149.5 416 176 416zM464 416C490.5 416 512 394.5 512 368C512 341.5 490.5 320 464 320C437.5 320 416 341.5 416 368C416 394.5 437.5 416 464 416z"/></svg>"""
		else -> null
	}
	
}
