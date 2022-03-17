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

object FA_ARCHWAY: Icon {
	
	override val name get() = "Archway"
	
	override val unicode get() = "f557"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M480 32C497.7 32 512 46.33 512 64C512 81.67 497.7 96 480 96H32C14.33 96 0 81.67 0 64C0 46.33 14.33 32 32 32H480zM32 128H480V416C497.7 416 512 430.3 512 448C512 465.7 497.7 480 480 480H352V352C352 298.1 309 256 256 256C202.1 256 160 298.1 160 352V480H32C14.33 480 0 465.7 0 448C0 430.3 14.33 416 32 416V128z"/></svg>"""
		else -> null
	}
	
}
