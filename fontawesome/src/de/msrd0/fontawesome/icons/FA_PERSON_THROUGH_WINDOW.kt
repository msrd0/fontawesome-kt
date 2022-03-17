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

/** Person Through-window */
object FA_PERSON_THROUGH_WINDOW: Icon {
	
	override val name get() = "Person Through-window"
	
	override val unicode get() = "e433"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M191.1 128C191.1 154.5 170.5 176 143.1 176C117.5 176 95.1 154.5 95.1 128C95.1 101.5 117.5 80 143.1 80C170.5 80 191.1 101.5 191.1 128zM385 336H310.5L394.6 462.2C404.4 476.1 400.5 496.8 385.8 506.6C371 516.4 351.2 512.5 341.4 497.8L308.2 448H48C21.49 448 0 426.5 0 400V48C0 21.49 21.49 0 48 0H592C618.5 0 640 21.49 640 48V400C640 426.5 618.5 448 592 448H421.9L379.2 384H425L385 336zM63.1 64V384H127.1C127.1 384 127.1 384 127.1 384V310.2C127.1 245 167.6 186.5 228.1 162.3C264.3 147.8 287.1 112.8 287.1 73.84V64H63.1zM352 64V73.84C352 128.5 324.1 178.5 279.5 207.4C279.8 207.9 280.1 208.4 280.4 208.9L321.4 271.1H392.5C406.8 271.1 420.3 278.3 429.4 289.3L508.3 384H576V64H352zM265.5 384L196.7 280.7C193.6 290 191.1 299.1 191.1 310.2V383.1C191.1 383.1 191.1 384 191.1 383.1L265.5 384z"/></svg>"""
		else -> null
	}
	
}
