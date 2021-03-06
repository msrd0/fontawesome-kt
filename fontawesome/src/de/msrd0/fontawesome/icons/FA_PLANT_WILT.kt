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

/** Plant Wilt */
object FA_PLANT_WILT: Icon {
	
	override val name get() = "Plant Wilt"
	
	override val unicode get() = "e43b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M288 512H224V248C224 217.1 198.9 192 168 192C137.1 192 112 217.1 112 248V260.1C141.3 270.9 160 295.5 160 331.1C160 359.1 124.2 410.5 80 448C35.83 410.5 0 360.4 0 331.1C0 295.5 18.67 270.9 48 260.1V248C48 181.7 101.7 128 168 128C188.2 128 207.3 133 224 141.8V120C224 53.73 277.7 0 344 0C410.3 0 464 53.73 464 120V132.1C493.3 142.9 512 167.5 512 203.1C512 231.1 476.2 282.5 432 320C387.8 282.5 352 232.4 352 203.1C352 167.5 370.7 142.9 400 132.1V120C400 89.07 374.9 64 344 64C313.1 64 288 89.07 288 120V512z"/></svg>"""
		else -> null
	}
	
}
