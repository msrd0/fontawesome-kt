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

/** Mosquito */
object FA_MOSQUITO: Icon {
	
	override val name get() = "Mosquito"
	
	override val unicode get() = "e52b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M430.3 503.8L382.3 447.8C378.4 443.4 376.3 437.7 376.3 431.7V376.3L351.1 344.7V407.8C351.1 425.4 337.7 439.8 319.1 439.8C302.3 439.8 287.1 425.4 287.1 407.8V344.7L263.7 376.3V431.7C263.7 437.7 261.6 443.4 257.7 447.8L209.7 503.8C201.1 513.8 186.1 514.8 176.3 505.9C166.5 497 165.6 481.6 174.3 471.6L216.3 422.5V367.8C216.3 362.3 218.1 357 221.5 352.7L287.1 266.3V266L154.6 387.8C97.58 447.6 .0003 405.2 0 320.6C0 272.7 34.02 232.3 79.35 226.4L232.3 202.5L191.5 161.6C183.7 153.8 182.1 141.5 187.6 131.8L211.5 90.06L173.3 39.18C165.3 28.54 167.2 13.26 177.5 5.046C187.9-3.17 202.7-1.207 210.7 9.429L258.7 73.34C264.6 81.21 265.3 91.99 260.4 100.6L237.8 140L287.1 190.3V152.1C287.1 137.2 298.2 124.7 311.1 121.1V63.93C311.1 59.51 315.6 55.93 319.1 55.93C324.4 55.93 327.1 59.51 327.1 63.93V121.1C341.8 124.7 351.1 137.2 351.1 152.1V190.3L402.2 140L379.6 100.6C374.7 91.99 375.4 81.21 381.3 73.34L429.3 9.429C437.3-1.207 452.1-3.169 462.5 5.047C472.8 13.26 474.7 28.55 466.7 39.18L428.5 90.06L452.4 131.8C457.9 141.5 456.3 153.8 448.5 161.6L407.7 202.5L560.6 226.4C605.1 232.3 640 272.7 640 320.6C640 405.2 542.4 447.6 485.4 387.8L351.1 266V266.3L418.5 352.7C421.9 357 423.7 362.3 423.7 367.8V422.5L465.7 471.6C474.4 481.6 473.5 497 463.7 505.9C453.9 514.8 438.9 513.8 430.3 503.8L430.3 503.8z"/></svg>"""
		else -> null
	}
	
}
