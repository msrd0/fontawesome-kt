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

/** Hands Holding-circle */
object FA_HANDS_HOLDING_CIRCLE: Icon {
	
	override val name get() = "Hands Holding-circle"
	
	override val unicode get() = "e4fb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M208 112C208 50.14 258.1 0 320 0C381.9 0 432 50.14 432 112C432 173.9 381.9 224 320 224C258.1 224 208 173.9 208 112zM80 258.7L140.3 339C149.7 351.6 167.7 353.8 179.9 343.8C190.4 335.1 193.1 319.1 186 308.3L164.6 272.5C155.9 258 159.9 239.3 173.7 229.7C187.6 220.1 206.5 222.9 216.1 236L263.5 294.1C279.3 313.1 288 338.6 288 364.1V480C288 497.7 273.7 512 256 512H160C150.3 512 141.1 507.6 135 499.1L14.02 348.8C4.946 337.4 0 323.3 0 308.8V103.1C0 81.91 17.91 63.1 40 63.1C62.09 63.1 80 81.91 80 103.1V258.7zM640 104V308.8C640 323.3 635.1 337.4 625.1 348.8L504.1 499.1C498.9 507.6 489.7 512 480 512H384C366.3 512 352 497.7 352 480V364.1C352 338.6 360.7 313.1 376.5 294.1L423 236C433.5 222.9 452.4 220.1 466.3 229.7C480.1 239.3 484.1 258 475.4 272.5L453.1 308.3C446.9 319.1 449.6 335.1 460.2 343.8C472.3 353.8 490.3 351.6 499.7 339L560 258.7V104C560 81.91 577.9 64 600 64C622.1 64 640 81.91 640 104V104z"/></svg>"""
		else -> null
	}
	
}
