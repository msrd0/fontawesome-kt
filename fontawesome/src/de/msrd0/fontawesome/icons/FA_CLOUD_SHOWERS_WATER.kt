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

/** Cloud Showers-water */
object FA_CLOUD_SHOWERS_WATER: Icon {
	
	override val name get() = "Cloud Showers-water"
	
	override val unicode get() = "e4e4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M223.1 0C262.6 0 295.9 22.82 311.2 55.7C325.7 41.07 345.8 32 368 32C406.7 32 438.1 59.48 446.4 96H448C483.3 96 512 124.7 512 160C512 195.3 483.3 224 448 224H127.1C92.65 224 63.1 195.3 63.1 160C63.1 124.7 92.65 96 127.1 96C127.1 42.98 170.1 0 223.1 0zM92.58 372.3C85.76 383.7 71.02 387.4 59.65 380.6C48.29 373.8 44.6 359 51.42 347.7L99.42 267.7C106.2 256.3 120.1 252.6 132.3 259.4C143.7 266.2 147.4 280.1 140.6 292.3L92.58 372.3zM468.3 259.4C479.7 266.2 483.4 280.1 476.6 292.3L428.6 372.3C421.8 383.7 407 387.4 395.7 380.6C384.3 373.8 380.6 359 387.4 347.7L435.4 267.7C442.2 256.3 456.1 252.6 468.3 259.4V259.4zM204.6 372.3C197.8 383.7 183 387.4 171.7 380.6C160.3 373.8 156.6 359 163.4 347.7L211.4 267.7C218.2 256.3 232.1 252.6 244.3 259.4C255.7 266.2 259.4 280.1 252.6 292.3L204.6 372.3zM356.3 259.4C367.7 266.2 371.4 280.1 364.6 292.3L316.6 372.3C309.8 383.7 295 387.4 283.7 380.6C272.3 373.8 268.6 359 275.4 347.7L323.4 267.7C330.2 256.3 344.1 252.6 356.3 259.4V259.4zM384 448C410.9 448 439.4 437.2 461.4 421.9L461.5 421.9C473.4 413.4 489.5 414.1 500.7 423.6C515 435.5 533.2 444.6 551.3 448.8C568.5 452.8 579.2 470.1 575.2 487.3C571.2 504.5 553.1 515.2 536.7 511.2C512.2 505.4 491.9 494.6 478.5 486.2C449.5 501.7 417 512 384 512C352.1 512 323.4 502.1 303.6 493.1C297.7 490.5 292.5 487.8 288 485.4C283.5 487.8 278.3 490.5 272.4 493.1C252.6 502.1 223.9 512 192 512C158.1 512 126.5 501.7 97.5 486.2C84.12 494.6 63.79 505.4 39.27 511.2C22.06 515.2 4.853 504.5 .8422 487.3C-3.169 470.1 7.532 452.8 24.74 448.8C42.84 444.6 60.96 435.5 75.31 423.6C86.46 414.1 102.6 413.4 114.5 421.9L114.6 421.9C136.7 437.2 165.1 448 192 448C219.5 448 247 437.4 269.5 421.9C280.6 414 295.4 414 306.5 421.9C328.1 437.4 356.5 448 384 448H384z"/></svg>"""
		else -> null
	}
	
}
