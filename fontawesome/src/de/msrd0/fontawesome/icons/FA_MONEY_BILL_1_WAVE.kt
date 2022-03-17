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

/** Money bill 1 wave */
object FA_MONEY_BILL_1_WAVE: Icon {
	
	override val name get() = "Money bill 1 wave"
	
	override val unicode get() = "f53b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M251.1 207.1C251.1 196.1 260.1 187.1 271.1 187.1H287.1C299 187.1 308 196.1 308 207.1V275.1H312C323 275.1 332 284.1 332 295.1C332 307 323 315.1 312 315.1H263.1C252.1 315.1 243.1 307 243.1 295.1C243.1 284.1 252.1 275.1 263.1 275.1H267.1V227.6C258.9 225.7 251.1 217.7 251.1 207.1zM48.66 79.13C128.4 100.9 208.2 80.59 288 60.25C375 38.08 462 15.9 549 48.38C565.9 54.69 576 71.62 576 89.66V399.5C576 423.4 550.4 439.2 527.3 432.9C447.6 411.1 367.8 431.4 288 451.7C200.1 473.9 113.1 496.1 26.97 463.6C10.06 457.3 0 440.4 0 422.3V112.5C0 88.59 25.61 72.83 48.66 79.13L48.66 79.13zM127.1 416C127.1 380.7 99.35 352 63.1 352V416H127.1zM63.1 223.1C99.35 223.1 127.1 195.3 127.1 159.1H63.1V223.1zM512 352V287.1C476.7 287.1 448 316.7 448 352H512zM512 95.1H448C448 131.3 476.7 159.1 512 159.1V95.1zM287.1 143.1C234.1 143.1 191.1 194.1 191.1 255.1C191.1 317.9 234.1 368 287.1 368C341 368 384 317.9 384 255.1C384 194.1 341 143.1 287.1 143.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_MONEY_BILL_1_WAVE]. */
val FA_MONEY_BILL_WAVE_ALT = FA_MONEY_BILL_1_WAVE
