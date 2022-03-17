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

/** Diamond */
object FA_DIAMOND: Icon {
	
	override val name get() = "Diamond"
	
	override val unicode get() = "f219"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M500.3 227.7C515.9 243.3 515.9 268.7 500.3 284.3L284.3 500.3C268.7 515.9 243.3 515.9 227.7 500.3L11.72 284.3C-3.905 268.7-3.905 243.3 11.72 227.7L227.7 11.72C243.3-3.905 268.7-3.905 284.3 11.72L500.3 227.7z"/></svg>"""
		else -> null
	}
	
}
