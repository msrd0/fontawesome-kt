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

object FA_ARROW_UP_FROM_WATER_PUMP: Icon {
	
	override val name get() = "Arrow Up-from-water-pump"
	
	override val unicode get() = "e4b6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M239.1 0C266.5 0 287.1 21.49 287.1 48V256H416V109.3L390.6 134.6C378.1 147.1 357.9 147.1 345.4 134.6C332.9 122.1 332.9 101.9 345.4 89.37L425.4 9.373C437.9-3.124 458.1-3.124 470.6 9.373L550.6 89.37C563.1 101.9 563.1 122.1 550.6 134.6C538.1 147.1 517.9 147.1 505.4 134.6L480 109.3V256H528C554.5 256 576 277.5 576 304V400C576 408 574 415.6 570.6 422.2C566.8 420.5 562.8 419.1 558.5 418.1C545.4 415.1 531.8 408.3 521.2 399.5C499 380.8 466.9 379.4 443.2 396.1C425.2 408.5 403 416.5 384 416.5C364.4 416.5 343.2 408.8 324.8 396.1C302.8 380.6 273.3 380.6 251.2 396.1C234 407.9 213.2 416.5 192 416.5C172.1 416.5 150.8 408.5 132.9 396.1C109.1 379.4 77.01 380.8 54.78 399.5C44.18 408.3 30.59 415.1 17.49 418.1C13.27 419.1 9.239 420.5 5.439 422.2C1.965 415.6 0 408 0 400V304C0 277.5 21.49 256 48 256H64V48C64 21.49 85.49 0 112 0H239.1zM384 448C410.9 448 439.4 437.2 461.4 421.9L461.5 421.9C473.4 413.4 489.5 414.1 500.7 423.6C515 435.5 533.2 444.6 551.3 448.8C568.5 452.8 579.2 470.1 575.2 487.3C571.2 504.5 553.1 515.2 536.7 511.2C512.2 505.4 491.9 494.6 478.5 486.2C449.5 501.7 417 512 384 512C352.1 512 323.4 502.1 303.6 493.1C297.7 490.5 292.5 487.8 288 485.4C283.5 487.8 278.3 490.5 272.4 493.1C252.6 502.1 223.9 512 192 512C158.1 512 126.5 501.7 97.5 486.2C84.12 494.6 63.79 505.4 39.27 511.2C22.06 515.2 4.853 504.5 .8422 487.3C-3.169 470.1 7.532 452.8 24.74 448.8C42.84 444.6 60.96 435.5 75.31 423.6C86.46 414.1 102.6 413.4 114.5 421.9L114.6 421.9C136.7 437.2 165.1 448 192 448C219.5 448 247 437.4 269.5 421.9C280.6 414 295.4 414 306.5 421.9C328.1 437.4 356.5 448 384 448H384z"/></svg>"""
		else -> null
	}
	
}
