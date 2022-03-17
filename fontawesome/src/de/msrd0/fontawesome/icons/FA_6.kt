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

/** 6 */
object FA_6: Icon {
	
	override val name get() = "6"
	
	override val unicode get() = "36"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M167.7 160.8l64.65-76.06c11.47-13.45 9.812-33.66-3.656-45.09C222.7 34.51 215.3 32.01 208 32.01c-9.062 0-18.06 3.833-24.38 11.29C38.07 214.5 0 245.5 0 320c0 88.22 71.78 160 160 160s160-71.78 160-160C320 234.4 252.3 164.9 167.7 160.8zM160 416c-52.94 0-96-43.06-96-96s43.06-95.1 96-95.1s96 43.06 96 95.1S212.9 416 160 416z"/></svg>"""
		else -> null
	}
	
}
