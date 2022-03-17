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

/** Kiwi Bird */
object FA_KIWI_BIRD: Icon {
	
	override val name get() = "Kiwi Bird"
	
	override val unicode get() = "f535"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M256 405.1V456C256 469.3 245.3 480 232 480C218.7 480 208 469.3 208 456V415.3C202.7 415.8 197.4 416 192 416C175.4 416 159.3 413.9 144 409.1V456C144 469.3 133.3 480 120 480C106.7 480 96 469.3 96 456V390.3C38.61 357.1 0 295.1 0 224C0 117.1 85.96 32 192 32C228.3 32 262.3 42.08 291.2 59.6C322.4 78.44 355.9 96 392.3 96H448C518.7 96 576 153.3 576 224V464C576 470.1 571.5 477.2 564.8 479.3C558.2 481.4 550.9 478.9 546.9 473.2L461.6 351.3C457.1 351.8 452.6 352 448 352H392.3C355.9 352 322.4 369.6 291.2 388.4C280.2 395.1 268.4 400.7 256 405.1zM448 248C461.3 248 472 237.3 472 224C472 210.7 461.3 200 448 200C434.7 200 424 210.7 424 224C424 237.3 434.7 248 448 248z"/></svg>"""
		else -> null
	}
	
}
