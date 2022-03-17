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

object FA_SACK_XMARK: Icon {
	
	override val name get() = "Sack Xmark"
	
	override val unicode get() = "e56a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M144.6 24.88C137.5 14.24 145.1 0 157.9 0H354.1C366.9 0 374.5 14.24 367.4 24.88L320 96H192L144.6 24.88zM332.1 136.4C389.7 172.7 512 250.9 512 416C512 469 469 512 416 512H96C42.98 512 0 469 0 416C0 250.9 122.3 172.7 179 136.4C183.9 133.3 188.2 130.5 192 128H320C323.8 130.5 328.1 133.3 332.1 136.4V136.4zM336.1 288.1C346.3 279.6 346.3 264.4 336.1 255C327.6 245.7 312.4 245.7 303 255L256 302.1L208.1 255C199.6 245.7 184.4 245.7 175 255C165.7 264.4 165.7 279.6 175 288.1L222.1 336L175 383C165.7 392.4 165.7 407.6 175 416.1C184.4 426.3 199.6 426.3 208.1 416.1L256 369.9L303 416.1C312.4 426.3 327.6 426.3 336.1 416.1C346.3 407.6 346.3 392.4 336.1 383L289.9 336L336.1 288.1z"/></svg>"""
		else -> null
	}
	
}
