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

/** Oil Can */
object FA_OIL_CAN: Icon {
	
	override val name get() = "Oil Can"
	
	override val unicode get() = "f613"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M288 128V160H368.9C378.8 160 388.6 162.3 397.5 166.8L448 192L615 156.2C633.1 152.3 645.7 173.8 633.5 187.7L451.1 394.3C438.1 408.1 421.5 416 403.1 416H144C117.5 416 96 394.5 96 368V346.7L28.51 316.7C11.17 308.1 0 291.8 0 272.8V208C0 181.5 21.49 160 48 160H224V128H192C174.3 128 160 113.7 160 96C160 78.33 174.3 64 192 64H320C337.7 64 352 78.33 352 96C352 113.7 337.7 128 320 128L288 128zM96 208H48V272.8L96 294.1V208z"/></svg>"""
		else -> null
	}
	
}
