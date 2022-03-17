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

/** Rug */
object FA_RUG: Icon {
	
	override val name get() = "Rug"
	
	override val unicode get() = "e569"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M80 64V448H24C10.75 448 0 437.3 0 424C0 410.7 10.75 400 24 400H32V360H24C10.75 360 0 349.3 0 336C0 322.7 10.75 312 24 312H32V280H24C10.75 280 0 269.3 0 256C0 242.7 10.75 232 24 232H32V200H24C10.75 200 0 189.3 0 176C0 162.7 10.75 152 24 152H32V112H24C10.75 112 0 101.3 0 88C0 74.75 10.75 64 24 64H80zM112 64H528V448H112V64zM616 112H608V152H616C629.3 152 640 162.7 640 176C640 189.3 629.3 200 616 200H608V232H616C629.3 232 640 242.7 640 256C640 269.3 629.3 280 616 280H608V312H616C629.3 312 640 322.7 640 336C640 349.3 629.3 360 616 360H608V400H616C629.3 400 640 410.7 640 424C640 437.3 629.3 448 616 448H560V64H616C629.3 64 640 74.75 640 88C640 101.3 629.3 112 616 112z"/></svg>"""
		else -> null
	}
	
}
