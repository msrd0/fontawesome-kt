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

/** Anchor */
object FA_ANCHOR: Icon {
	
	override val name get() = "Anchor"
	
	override val unicode get() = "f13d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M352 176C369.7 176 384 190.3 384 208C384 225.7 369.7 240 352 240H320V448H368C421 448 464 405 464 352V345.9L456.1 352.1C447.6 362.3 432.4 362.3 423 352.1C413.7 343.6 413.7 328.4 423 319L479 263C488.4 253.7 503.6 253.7 512.1 263L568.1 319C578.3 328.4 578.3 343.6 568.1 352.1C559.6 362.3 544.4 362.3 535 352.1L528 345.9V352C528 440.4 456.4 512 368 512H208C119.6 512 48 440.4 48 352V345.9L40.97 352.1C31.6 362.3 16.4 362.3 7.029 352.1C-2.343 343.6-2.343 328.4 7.029 319L63.03 263C72.4 253.7 87.6 253.7 96.97 263L152.1 319C162.3 328.4 162.3 343.6 152.1 352.1C143.6 362.3 128.4 362.3 119 352.1L112 345.9V352C112 405 154.1 448 208 448H256V240H224C206.3 240 192 225.7 192 208C192 190.3 206.3 176 224 176H234.9C209 158.8 192 129.4 192 96C192 42.98 234.1 0 288 0C341 0 384 42.98 384 96C384 129.4 366.1 158.8 341.1 176H352zM288 128C305.7 128 320 113.7 320 96C320 78.33 305.7 64 288 64C270.3 64 256 78.33 256 96C256 113.7 270.3 128 288 128z"/></svg>"""
		else -> null
	}
	
}
