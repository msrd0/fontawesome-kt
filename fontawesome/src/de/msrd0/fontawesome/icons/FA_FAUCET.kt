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

object FA_FAUCET: Icon {
	
	override val name get() = "Faucet"
	
	override val unicode get() = "e005"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M352 256h-38.54C297.7 242.5 277.9 232.9 256 228V180.5L224 177L192 180.5V228C170.1 233 150.3 242.6 134.5 256H16C7.125 256 0 263.1 0 272v96C0 376.9 7.125 384 16 384h92.78C129.4 421.8 173 448 224 448s94.59-26.25 115.2-64H352c17.62 0 32 14.29 32 31.91S398.4 448 416 448h64c17.62 0 32-14.31 32-31.94C512 327.7 440.4 256 352 256zM81.63 159.9L224 144.9l142.4 15C375.9 160.9 384 153.1 384 143.1V112.9c0-10-8.125-17.74-17.62-16.74L256 107.8V80C256 71.12 248.9 64 240 64h-32C199.1 64 192 71.12 192 80v27.75L81.63 96.14C72.13 95.14 64 102.9 64 112.9v30.24C64 153.1 72.13 160.9 81.63 159.9z"/></svg>"""
		else -> null
	}
	
}
