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

/** Staff Aesculapius */
object FA_STAFF_AESCULAPIUS: Icon {
	
	override val name get() = "Staff Aesculapius"
	
	override val unicode get() = "e579"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M222.5 48H288C341 48 384 90.98 384 144C384 197 341 240 288 240H248V160H288C296.8 160 304 152.8 304 144C304 135.2 296.8 128 288 128H220L215.5 272H256C309 272 352 314.1 352 368C352 421 309 464 256 464H240V384H256C264.8 384 272 376.8 272 368C272 359.2 264.8 352 256 352H212.1L208.5 496C208.2 504.9 200.9 512 191.1 512C183.1 512 175.8 504.9 175.5 496L174.5 464H135.1C113.9 464 95.1 446.1 95.1 424C95.1 401.9 113.9 384 135.1 384H171.1L170.1 352H151.1C98.98 352 55.1 309 55.1 256C55.1 208.4 90.6 168.9 135.1 161.3V256C135.1 264.8 143.2 272 151.1 272H168.5L164 128H122.6C113.6 146.9 94.34 160 72 160H56C25.07 160 0 134.9 0 104C0 73.07 25.07 48 56 48H161.5L160.1 31.98C160.1 31.33 160.1 30.69 160.1 30.05C161.5 13.43 175.1 0 192 0C208.9 0 222.5 13.43 223 30.05C223 30.69 223 31.33 223 31.98L222.5 48zM79.1 96C79.1 87.16 72.84 80 63.1 80C55.16 80 47.1 87.16 47.1 96C47.1 104.8 55.16 112 63.1 112C72.84 112 79.1 104.8 79.1 96z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_STAFF_AESCULAPIUS]. */
val FA_ROD_ASCLEPIUS = FA_STAFF_AESCULAPIUS

/** Alias for [FA_STAFF_AESCULAPIUS]. */
val FA_ROD_SNAKE = FA_STAFF_AESCULAPIUS

/** Alias for [FA_STAFF_AESCULAPIUS]. */
val FA_STAFF_SNAKE = FA_STAFF_AESCULAPIUS
