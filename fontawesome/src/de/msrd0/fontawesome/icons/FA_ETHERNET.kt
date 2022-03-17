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

object FA_ETHERNET: Icon {
	
	override val name get() = "Ethernet"
	
	override val unicode get() = "f796"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M512 208v224c0 8.75-7.25 16-16 16H416v-128h-32v128h-64v-128h-32v128H224v-128H192v128H128v-128H96v128H16C7.25 448 0 440.8 0 432v-224C0 199.2 7.25 192 16 192H64V144C64 135.2 71.25 128 80 128H128V80C128 71.25 135.2 64 144 64h224C376.8 64 384 71.25 384 80V128h48C440.8 128 448 135.2 448 144V192h48C504.8 192 512 199.2 512 208z"/></svg>"""
		else -> null
	}
	
}
