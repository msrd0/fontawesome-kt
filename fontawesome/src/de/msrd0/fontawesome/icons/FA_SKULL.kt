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

/** Skull */
object FA_SKULL: Icon {
	
	override val name get() = "Skull"
	
	override val unicode get() = "f54c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416 400V464C416 490.5 394.5 512 368 512H320V464C320 455.2 312.8 448 304 448C295.2 448 288 455.2 288 464V512H224V464C224 455.2 216.8 448 208 448C199.2 448 192 455.2 192 464V512H144C117.5 512 96 490.5 96 464V400C96 399.6 96 399.3 96.01 398.9C37.48 357.8 0 294.7 0 224C0 100.3 114.6 0 256 0C397.4 0 512 100.3 512 224C512 294.7 474.5 357.8 415.1 398.9C415.1 399.3 416 399.6 416 400V400zM160 192C124.7 192 96 220.7 96 256C96 291.3 124.7 320 160 320C195.3 320 224 291.3 224 256C224 220.7 195.3 192 160 192zM352 320C387.3 320 416 291.3 416 256C416 220.7 387.3 192 352 192C316.7 192 288 220.7 288 256C288 291.3 316.7 320 352 320z"/></svg>"""
		else -> null
	}
	
}
