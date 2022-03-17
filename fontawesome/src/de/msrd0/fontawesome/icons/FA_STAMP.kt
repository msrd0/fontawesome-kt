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

/** Stamp */
object FA_STAMP: Icon {
	
	override val name get() = "Stamp"
	
	override val unicode get() = "f5bf"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M366.2 256H400C461.9 256 512 306.1 512 368C512 388.9 498.6 406.7 480 413.3V464C480 490.5 458.5 512 432 512H80C53.49 512 32 490.5 32 464V413.3C13.36 406.7 0 388.9 0 368C0 306.1 50.14 256 112 256H145.8C175.7 256 200 231.7 200 201.8C200 184.3 190.8 168.5 180.1 154.8C167.5 138.5 160 118.1 160 96C160 42.98 202.1 0 256 0C309 0 352 42.98 352 96C352 118.1 344.5 138.5 331.9 154.8C321.2 168.5 312 184.3 312 201.8C312 231.7 336.3 256 366.2 256zM416 416H96V448H416V416z"/></svg>"""
		else -> null
	}
	
}
