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

/** E */
object FA_E: Icon {
	
	override val name get() = "E"
	
	override val unicode get() = "45"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M320 448c0 17.67-14.33 32-32 32H32c-17.67 0-32-14.33-32-32v-384C0 46.34 14.33 32.01 32 32.01h256c17.67 0 32 14.33 32 32s-14.33 32-32 32H64v128h160c17.67 0 32 14.32 32 31.99s-14.33 32.01-32 32.01H64v128h224C305.7 416 320 430.3 320 448z"/></svg>"""
		else -> null
	}
	
}
