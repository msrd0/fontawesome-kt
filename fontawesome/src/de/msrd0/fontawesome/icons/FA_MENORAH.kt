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

object FA_MENORAH: Icon {
	
	override val name get() = "Menorah"
	
	override val unicode get() = "f676"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M544 144C544 135.1 536.9 128 528 128h-32C487.1 128 480 135.1 480 144V288h64V144zM416 95.1c17.62 0 32-14.38 32-32s-32-63.1-32-63.1s-32 46.37-32 63.1S398.4 95.1 416 95.1zM448 144C448 135.1 440.9 128 432 128h-32C391.1 128 384 135.1 384 144V288h64V144zM608 95.1c17.62 0 32-14.38 32-32s-32-63.1-32-63.1s-32 46.37-32 63.1S590.4 95.1 608 95.1zM320 95.1c17.62 0 32-14.38 32-32s-32-63.1-32-63.1S288 46.37 288 63.1S302.4 95.1 320 95.1zM512 95.1c17.62 0 32-14.38 32-32s-32-63.1-32-63.1s-32 46.37-32 63.1S494.4 95.1 512 95.1zM624 128h-32C583.2 128 576 135.2 576 144V288c0 17.6-14.4 32-32 32h-192V144C352 135.2 344.8 128 336 128h-32C295.2 128 288 135.2 288 144V320H96c-17.6 0-32-14.4-32-32V144C64 135.2 56.84 128 48 128h-32C7.164 128 0 135.2 0 144V288c0 53.02 42.98 96 96 96h192v64H176C149.5 448 128 469.5 128 496C128 504.8 135.2 512 144 512h352c8.836 0 16-7.164 16-16c0-26.51-21.49-48-48-48H352v-64h192c53.02 0 96-42.98 96-96V144C640 135.2 632.8 128 624 128zM160 144C160 135.1 152.9 128 144 128h-32C103.1 128 96 135.1 96 144V288h64V144zM224 95.1c17.62 0 32-14.38 32-32S224 0 224 0S192 46.37 192 63.1S206.4 95.1 224 95.1zM32 95.1c17.62 0 32-14.38 32-32S32 0 32 0S0 46.37 0 63.1S14.38 95.1 32 95.1zM128 95.1c17.62 0 32-14.38 32-32S128 0 128 0S96 46.37 96 63.1S110.4 95.1 128 95.1zM256 144C256 135.1 248.9 128 240 128h-32C199.1 128 192 135.1 192 144V288h64V144z"/></svg>"""
		else -> null
	}
	
}
