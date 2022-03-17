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

/** People Robbery */
object FA_PEOPLE_ROBBERY: Icon {
	
	override val name get() = "People Robbery"
	
	override val unicode get() = "e536"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M496.1 24.24C501.2 7.093 518.6-3.331 535.8 .9552C552.9 5.242 563.3 22.62 559 39.76L550.3 74.63C539.3 118.6 510.1 154.2 472 174.3V480C472 497.7 457.7 512 440 512C422.3 512 408 497.7 408 480V352H392V480C392 497.7 377.7 512 360 512C342.3 512 328 497.7 328 480V174.3C289.9 154.2 260.7 118.6 249.7 74.63L240.1 39.76C236.7 22.62 247.1 5.242 264.2 .9552C281.4-3.331 298.8 7.093 303 24.24L311.8 59.1C321.9 99.59 358.3 127.1 400 127.1C441.7 127.1 478.1 99.59 488.2 59.1L496.1 24.24zM352 47.1C352 21.49 373.5-.0006 400-.0006C426.5-.0006 448 21.49 448 47.1C448 74.51 426.5 95.1 400 95.1C373.5 95.1 352 74.51 352 47.1V47.1zM32.01 48C32.01 21.49 53.5 0 80.01 0C106.5 0 128 21.49 128 48C128 74.51 106.5 96 80.01 96C53.5 96 32.01 74.51 32.01 48V48zM104.7 128C132.1 128 157.6 142 172.2 165.1L209.6 224H240C257.7 224 272 238.3 272 256C272 273.7 257.7 288 240 288H192C181 288 170.9 282.4 164.1 273.1L152 252.7V480C152 497.7 137.7 512 120 512C102.3 512 88 497.7 88 480V352H72V480C72 497.7 57.68 512 40 512C22.33 512 8.005 497.7 8.005 480V288.6L8 287.1V191.1C8 156.7 36.65 127.1 72 127.1L104.7 128z"/></svg>"""
		else -> null
	}
	
}
