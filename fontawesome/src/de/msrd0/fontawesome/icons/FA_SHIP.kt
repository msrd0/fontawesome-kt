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

object FA_SHIP: Icon {
	
	override val name get() = "Ship"
	
	override val unicode get() = "f21a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M192 32C192 14.33 206.3 0 224 0H352C369.7 0 384 14.33 384 32V64H432C458.5 64 480 85.49 480 112V240L524.4 254.8C547.6 262.5 553.9 292.3 535.9 308.7L434.9 401.4C418.7 410.7 400.2 416.5 384 416.5C364.4 416.5 343.2 408.8 324.8 396.1C302.8 380.6 273.3 380.6 251.2 396.1C234 407.9 213.2 416.5 192 416.5C175.8 416.5 157.3 410.7 141.1 401.3L40.09 308.7C22.1 292.3 28.45 262.5 51.59 254.8L96 239.1V111.1C96 85.49 117.5 63.1 144 63.1H192V32zM160 218.7L267.8 182.7C280.9 178.4 295.1 178.4 308.2 182.7L416 218.7V128H160V218.7zM384 448C410.9 448 439.4 437.2 461.4 421.9L461.5 421.9C473.4 413.4 489.5 414.1 500.7 423.6C515 435.5 533.2 444.6 551.3 448.8C568.5 452.8 579.2 470.1 575.2 487.3C571.2 504.5 553.1 515.2 536.7 511.2C512.2 505.4 491.9 494.6 478.5 486.2C449.5 501.7 417 512 384 512C352.1 512 323.4 502.1 303.6 493.1C297.7 490.5 292.5 487.8 288 485.4C283.5 487.8 278.3 490.5 272.4 493.1C252.6 502.1 223.9 512 192 512C158.1 512 126.5 501.7 97.5 486.2C84.12 494.6 63.79 505.4 39.27 511.2C22.06 515.2 4.853 504.5 .8422 487.3C-3.169 470.1 7.532 452.8 24.74 448.8C42.84 444.6 60.96 435.5 75.31 423.6C86.46 414.1 102.6 413.4 114.5 421.9L114.6 421.9C136.7 437.2 165.1 448 192 448C219.5 448 247 437.4 269.5 421.9C280.6 414 295.4 414 306.5 421.9C328.1 437.4 356.5 448 384 448H384z"/></svg>"""
		else -> null
	}
	
}
