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

object FA_RAINBOW: Icon {
	
	override val name get() = "Rainbow"
	
	override val unicode get() = "f75b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M312.3 32.09C137.6 36.22 0 183.3 0 358V464C0 472.8 7.164 480 16 480h32C56.84 480 64 472.8 64 464v-106.9c0-143.2 117.2-263.5 260.4-261.1C463.5 98.4 576 212.3 576 352v112c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16V352C640 172.1 492.3 27.84 312.3 32.09zM313.5 224.2C244.8 227.6 192 286.9 192 355.7V464C192 472.8 199.2 480 208 480h32C248.8 480 256 472.8 256 464v-109.7c0-34.06 25.65-63.85 59.64-66.11C352.9 285.7 384 315.3 384 352v112c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16V352C448 279.3 387 220.5 313.5 224.2zM313.2 128.1C191.4 131.7 96 234.9 96 356.8V464C96 472.8 103.2 480 112 480h32C152.8 480 160 472.8 160 464v-108.1c0-86.64 67.24-160.5 153.8-163.8C404.8 188.7 480 261.7 480 352v112c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16V352C544 226.2 439.8 124.3 313.2 128.1z"/></svg>"""
		else -> null
	}
	
}
