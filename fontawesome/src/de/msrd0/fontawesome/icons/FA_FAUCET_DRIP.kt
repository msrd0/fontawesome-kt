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

/** Faucet Drip */
object FA_FAUCET_DRIP: Icon {
	
	override val name get() = "Faucet Drip"
	
	override val unicode get() = "e006"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416 480c0 17.62 14.38 32 32 32s32-14.38 32-32s-32-64-32-64S416 462.4 416 480zM352 192h-38.54C297.7 178.5 277.9 168.9 256 164V116.5L224 113L192 116.5V164C170.1 169 150.3 178.6 134.5 192H16C7.125 192 0 199.1 0 208v96C0 312.9 7.125 320 16 320h92.78C129.4 357.8 173 384 224 384s94.59-26.25 115.2-64H352c17.62 0 32 14.29 32 31.91S398.4 384 416 384h64c17.62 0 32-14.38 32-32C512 263.6 440.4 192 352 192zM81.63 95.88L224 80.88l142.4 15C375.9 96.88 384 89.12 384 79.12V48.89c0-10-8.125-17.74-17.62-16.74L256 43.75V16C256 7.125 248.9 0 240 0h-32C199.1 0 192 7.125 192 16v27.75L81.63 32.14C72.13 31.14 64 38.89 64 48.89V79.12C64 89.12 72.13 96.88 81.63 95.88z"/></svg>"""
		else -> null
	}
	
}
