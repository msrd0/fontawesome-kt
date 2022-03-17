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

/** Ruler Vertical */
object FA_RULER_VERTICAL: Icon {
	
	override val name get() = "Ruler Vertical"
	
	override val unicode get() = "f548"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 256 512"><path d="M0 48C0 21.49 21.49 0 48 0H208C234.5 0 256 21.49 256 48V96H176C167.2 96 160 103.2 160 112C160 120.8 167.2 128 176 128H256V192H176C167.2 192 160 199.2 160 208C160 216.8 167.2 224 176 224H256V288H176C167.2 288 160 295.2 160 304C160 312.8 167.2 320 176 320H256V384H176C167.2 384 160 391.2 160 400C160 408.8 167.2 416 176 416H256V464C256 490.5 234.5 512 208 512H48C21.49 512 0 490.5 0 464V48z"/></svg>"""
		else -> null
	}
	
}
