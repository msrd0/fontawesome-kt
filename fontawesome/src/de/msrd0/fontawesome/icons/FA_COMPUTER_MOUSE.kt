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

/** Computer mouse */
object FA_COMPUTER_MOUSE: Icon {
	
	override val name get() = "Computer mouse"
	
	override val unicode get() = "f8cc"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M0 352c0 88.38 71.63 160 160 160h64c88.38 0 160-71.63 160-160V224H0V352zM176 0H160C71.63 0 0 71.62 0 160v32h176V0zM224 0h-16v192H384V160C384 71.62 312.4 0 224 0z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_COMPUTER_MOUSE]. */
val FA_MOUSE = FA_COMPUTER_MOUSE
