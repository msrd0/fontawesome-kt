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

/** Arrows To-eye */
object FA_ARROWS_TO_EYE: Icon {
	
	override val name get() = "Arrows To-eye"
	
	override val unicode get() = "e4bf"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M15.03 15.03C24.4 5.657 39.6 5.657 48.97 15.03L112 78.06V40C112 26.75 122.7 15.1 136 15.1C149.3 15.1 160 26.75 160 40V136C160 149.3 149.3 160 136 160H40C26.75 160 15.1 149.3 15.1 136C15.1 122.7 26.75 112 40 112H78.06L15.03 48.97C5.657 39.6 5.657 24.4 15.03 15.03V15.03zM133.5 243.9C158.6 193.6 222.7 112 320 112C417.3 112 481.4 193.6 506.5 243.9C510.3 251.6 510.3 260.4 506.5 268.1C481.4 318.4 417.3 400 320 400C222.7 400 158.6 318.4 133.5 268.1C129.7 260.4 129.7 251.6 133.5 243.9V243.9zM320 320C355.3 320 384 291.3 384 256C384 220.7 355.3 192 320 192C284.7 192 256 220.7 256 256C256 291.3 284.7 320 320 320zM591 15.03C600.4 5.657 615.6 5.657 624.1 15.03C634.3 24.4 634.3 39.6 624.1 48.97L561.9 112H600C613.3 112 624 122.7 624 136C624 149.3 613.3 160 600 160H504C490.7 160 480 149.3 480 136V40C480 26.75 490.7 15.1 504 15.1C517.3 15.1 528 26.75 528 40V78.06L591 15.03zM15.03 463L78.06 400H40C26.75 400 15.1 389.3 15.1 376C15.1 362.7 26.75 352 40 352H136C149.3 352 160 362.7 160 376V472C160 485.3 149.3 496 136 496C122.7 496 112 485.3 112 472V433.9L48.97 496.1C39.6 506.3 24.4 506.3 15.03 496.1C5.657 487.6 5.657 472.4 15.03 463V463zM528 433.9V472C528 485.3 517.3 496 504 496C490.7 496 480 485.3 480 472V376C480 362.7 490.7 352 504 352H600C613.3 352 624 362.7 624 376C624 389.3 613.3 400 600 400H561.9L624.1 463C634.3 472.4 634.3 487.6 624.1 496.1C615.6 506.3 600.4 506.3 591 496.1L528 433.9z"/></svg>"""
		else -> null
	}
	
}
