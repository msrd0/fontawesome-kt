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

object FA_SHUTTLE_SPACE: Icon {
	
	override val name get() = "Shuttle space"
	
	override val unicode get() = "f197"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M129.1 480H128V384H352L245.2 448.1C210.4 468.1 170.6 480 129.1 480zM352 128H128V32H129.1C170.6 32 210.4 43.03 245.2 63.92L352 128zM104 128C130.2 128 153.4 140.6 168 160H456C525.3 160 591 182.7 635.2 241.6C641.6 250.1 641.6 261.9 635.2 270.4C591 329.3 525.3 352 456 352H168C153.4 371.4 130.2 384 104 384H96V480H80C53.49 480 32 458.5 32 432V384H40C17.91 384 0 366.1 0 344V168C0 145.9 17.89 128 39.96 128H32V80C32 53.49 53.49 32 80 32H96V128H104zM476.4 208C473.1 208 472 209.1 472 212.4V299.6C472 302 473.1 304 476.4 304C496.1 304 512 288.1 512 268.4V243.6C512 223.9 496.1 208 476.4 208z"/></svg>"""
		else -> null
	}
	
}

val FA_SPACE_SHUTTLE = FA_SHUTTLE_SPACE
