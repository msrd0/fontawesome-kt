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

/** Skull & Crossbones */
object FA_SKULL_CROSSBONES: Icon {
	
	override val name get() = "Skull & Crossbones"
	
	override val unicode get() = "f714"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M368 128C368 172.4 342.6 211.5 304 234.4V256C304 273.7 289.7 288 272 288H175.1C158.3 288 143.1 273.7 143.1 256V234.4C105.4 211.5 79.1 172.4 79.1 128C79.1 57.31 144.5 0 223.1 0C303.5 0 368 57.31 368 128V128zM167.1 176C185.7 176 199.1 161.7 199.1 144C199.1 126.3 185.7 112 167.1 112C150.3 112 135.1 126.3 135.1 144C135.1 161.7 150.3 176 167.1 176zM280 112C262.3 112 248 126.3 248 144C248 161.7 262.3 176 280 176C297.7 176 312 161.7 312 144C312 126.3 297.7 112 280 112zM3.378 273.7C11.28 257.9 30.5 251.5 46.31 259.4L223.1 348.2L401.7 259.4C417.5 251.5 436.7 257.9 444.6 273.7C452.5 289.5 446.1 308.7 430.3 316.6L295.6 384L430.3 451.4C446.1 459.3 452.5 478.5 444.6 494.3C436.7 510.1 417.5 516.5 401.7 508.6L223.1 419.8L46.31 508.6C30.5 516.5 11.28 510.1 3.378 494.3C-4.526 478.5 1.881 459.3 17.69 451.4L152.4 384L17.69 316.6C1.881 308.7-4.526 289.5 3.378 273.7V273.7z"/></svg>"""
		else -> null
	}
	
}
