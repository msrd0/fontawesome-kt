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

object FA_ANCHOR_CIRCLE_XMARK: Icon {
	
	override val name get() = "Anchor Circle-xmark"
	
	override val unicode get() = "e4ac"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M352 176C369.7 176 384 190.3 384 208C384 225.7 369.7 240 352 240H319.1V448H339.2C351.8 472.7 370 493.1 392.2 510.2C384.3 511.4 376.2 512 368 512H208C119.6 512 48 440.4 48 352V345.9L40.97 352.1C31.6 362.3 16.4 362.3 7.029 352.1C-2.343 343.6-2.343 328.4 7.029 319L63.03 263C72.4 253.7 87.6 253.7 96.97 263L152.1 319C162.3 328.4 162.3 343.6 152.1 352.1C143.6 362.3 128.4 362.3 119 352.1L112 345.9V352C112 405 154.1 448 208 448H256V240H224C206.3 240 192 225.7 192 208C192 190.3 206.3 176 224 176H234.9C209 158.8 192 129.4 192 96C192 42.98 234.1 0 288 0C341 0 384 42.98 384 96C384 129.4 366.1 158.8 341.1 176H352zM287.1 128C305.7 128 319.1 113.7 319.1 96C319.1 78.33 305.7 64 287.1 64C270.3 64 255.1 78.33 255.1 96C255.1 113.7 270.3 128 287.1 128zM352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368zM555.3 331.3C561.6 325.1 561.6 314.9 555.3 308.7C549.1 302.4 538.9 302.4 532.7 308.7L496 345.4L459.3 308.7C453.1 302.4 442.9 302.4 436.7 308.7C430.4 314.9 430.4 325.1 436.7 331.3L473.4 368L436.7 404.7C430.4 410.9 430.4 421.1 436.7 427.3C442.9 433.6 453.1 433.6 459.3 427.3L496 390.6L532.7 427.3C538.9 433.6 549.1 433.6 555.3 427.3C561.6 421.1 561.6 410.9 555.3 404.7L518.6 368L555.3 331.3z"/></svg>"""
		else -> null
	}
	
}
