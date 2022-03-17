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

object FA_HOSPITAL_WITH_USER: Icon {
	
	override val name get() = "Hospital with User"
	
	override val unicode get() = "f80d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M272 0C298.5 0 320 21.49 320 48V367.8C281.8 389.2 256 430 256 476.9C256 489.8 259.6 501.8 265.9 512H48C21.49 512 0 490.5 0 464V384H144C152.8 384 160 376.8 160 368C160 359.2 152.8 352 144 352H0V288H144C152.8 288 160 280.8 160 272C160 263.2 152.8 256 144 256H0V48C0 21.49 21.49 0 48 0H272zM152 64C143.2 64 136 71.16 136 80V104H112C103.2 104 96 111.2 96 120V136C96 144.8 103.2 152 112 152H136V176C136 184.8 143.2 192 152 192H168C176.8 192 184 184.8 184 176V152H208C216.8 152 224 144.8 224 136V120C224 111.2 216.8 104 208 104H184V80C184 71.16 176.8 64 168 64H152zM512 272C512 316.2 476.2 352 432 352C387.8 352 352 316.2 352 272C352 227.8 387.8 192 432 192C476.2 192 512 227.8 512 272zM288 477.1C288 425.7 329.7 384 381.1 384H482.9C534.3 384 576 425.7 576 477.1C576 496.4 560.4 512 541.1 512H322.9C303.6 512 288 496.4 288 477.1V477.1z"/></svg>"""
		else -> null
	}
	
}
