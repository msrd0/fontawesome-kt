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

object FA_LESS_THAN: Icon {
	
	override val name get() = "Less Than"
	
	override val unicode get() = "3c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M351.1 448c-4.797 0-9.688-1.094-14.28-3.375l-320-160C6.844 279.2 0 268.1 0 256c0-12.13 6.844-23.18 17.69-28.62l320-160c15.88-7.875 35.05-1.5 42.94 14.31c7.906 15.81 1.5 35.03-14.31 42.94L103.5 256l262.8 131.4c15.81 7.906 22.22 27.12 14.31 42.94C375 441.5 363.7 448 351.1 448z"/></svg>"""
		else -> null
	}
	
}
