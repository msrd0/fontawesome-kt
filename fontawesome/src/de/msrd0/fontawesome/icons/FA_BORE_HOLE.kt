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

object FA_BORE_HOLE: Icon {
	
	override val name get() = "Bore Hole"
	
	override val unicode get() = "e4c3"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 0C273.7 0 288 14.33 288 32V296.6C307.1 307.6 320 328.3 320 352C320 387.3 291.3 416 256 416C220.7 416 192 387.3 192 352C192 328.3 204.9 307.6 224 296.6V32C224 14.33 238.3 0 256 0zM160 128V352C160 405 202.1 448 256 448C309 448 352 405 352 352V128H464C490.5 128 512 149.5 512 176V464C512 490.5 490.5 512 464 512H48C21.49 512 0 490.5 0 464V176C0 149.5 21.49 128 48 128H160z"/></svg>"""
		else -> null
	}
	
}
