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

object FA_HAMSA: Icon {
	
	override val name get() = "Hamsa"
	
	override val unicode get() = "f665"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M509.4 307.2C504.3 295.5 492.8 288 480 288h-64l.0001-208c0-21.1-18-40-40-40c-22 0-40 18-40 40l-.0001 134C336 219.5 331.5 224 326 224h-20c-5.5 0-10-4.5-10-9.1V40c0-21.1-17.1-40-39.1-40S215.1 18 215.1 40v174C215.1 219.5 211.5 224 205.1 224H185.1C180.5 224 175.1 219.5 175.1 214L175.1 80c0-21.1-18-40-40-40S95.1 58 95.1 80L95.1 288H31.99C19.24 288 7.743 295.5 2.618 307.2C-2.382 318.9-.1322 332.5 8.618 341.9l102.6 110C146.1 490.1 199.8 512 256 512s108.1-21.88 144.8-60.13l102.6-110C512.1 332.5 514.4 318.9 509.4 307.2zM256 416c-53 0-96.01-64-96.01-64s43-64 96.01-64s96.01 64 96.01 64S309 416 256 416zM256 320c-17.63 0-32 14.38-32 32s14.38 32 32 32s32-14.38 32-32S273.6 320 256 320z"/></svg>"""
		else -> null
	}
	
}
